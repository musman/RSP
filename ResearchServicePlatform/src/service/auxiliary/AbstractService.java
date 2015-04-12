package service.auxiliary;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import service.provider.MessageReceiver;
import service.provider.ServiceProvider;
import service.provider.ServiceProviderFactory;

public abstract class AbstractService implements MessageReceiver {

    String serviceName;
    String serviceEndpoint;
    ServiceProvider serviceProvider;

    AtomicInteger messageCount = new AtomicInteger(0);
    Map<Integer, Object> results = new ConcurrentHashMap<Integer, Object>();
    ServiceDescription serviceDescription;
    private Object NullObject = new Object();
    ExecutorService executors;

    public static final boolean DEBUG = false;

    public AbstractService(String serviceName, String serviceEndpoint) {
		serviceProvider = ServiceProviderFactory.createServiceProvider();
		this.serviceName = serviceName;
		this.serviceEndpoint = serviceEndpoint;
		serviceDescription = new ServiceDescription(serviceName,serviceEndpoint);
		createServiceDescription();
		readConfiguration();
		applyConfiguration();
    }

    public AbstractService(String serviceName, String serviceEndpoint, int responseTime) {
    	this(serviceName, serviceEndpoint);
    	serviceDescription = new ServiceDescription(serviceName, serviceEndpoint, responseTime);
    }

    public Object sendRequest(String service, String destination, boolean reply, String opName, Object... params) {
    	return sendRequest(service, destination, reply, -1, opName, params);
    }

    public Object sendRequest(String service, String destination, boolean reply, long responseTime, String opName, Object... params) {
		try {
			int messageID = messageCount.incrementAndGet();
			Request request = new Request(messageID, this.serviceEndpoint,service, opName, params);
			XMLBuilder build = new XMLBuilder();
			String requestMessage = build.toXML(request);

			serviceProvider.sendMessage(requestMessage, destination);

			if (DEBUG)
				System.out.println("The request message is: \n"+ requestMessage);

			if (reply) {
				synchronized (this) {
					if (responseTime == -1) {
						while (!results.containsKey(messageID)) {
							this.wait();
						}
					} else {
						long startTime = System.currentTimeMillis();
						while (!results.containsKey(messageID)) {
							this.wait(responseTime * 1000);
							long endTime = System.currentTimeMillis();
							if ((endTime - startTime) / 1000.0 >= responseTime) {
								results.put(messageID, new TimeOutError());
							}
						}
					}
				}

				Object result = results.get(messageID);
				results.remove(messageID);
				return result != NullObject ? result : null;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
    }

    private void sendResponse(int requestID, Object result, String destination) {
    	Response response = new Response(messageCount.incrementAndGet(), requestID, this.serviceEndpoint, result);
    	XMLBuilder build = new XMLBuilder();
    	String responseMessage = build.toXML(response);
    	serviceProvider.sendMessage(responseMessage, destination);
    }

    public void startService() {
    	serviceProvider.startListening(serviceEndpoint, this);
    }

    public void stopService() {
    	serviceProvider.stopListening();
    }

    @Override
    public void onMessage(final String message) {
		try {
			AbstractMessage msg = (AbstractMessage) (new XMLBuilder()
					.fromXML(message));
			final int requestID = msg.getId();
			String messageType = msg.getType();
			final String destination = msg.getEndpoint();
			switch (messageType) {
			case "request": {
				if (DEBUG)
					System.out.println("Receiving the request: \n" + message);
				final Request request = (Request) msg;
				executors.submit(new Callable<Object>() {

					@Override
					public Object call() throws Exception {
						try {

							Object result = invokeOperation(request.getOpName(), request.getParams());

							if (result instanceof OperationAborted)
								return null;
							sendResponse(requestID, result, destination);

						} catch (Exception e) {
							e.printStackTrace();
						}

						return null;
					}
				});
				break;
			}
			case "response": {
				if (DEBUG)
					System.out.println("Receiving the response: \n" + message);
				Response response = (Response) msg;
				if (response.getReturnType() != null) {
					Class<?> type = (Class<?>) response.getReturnType();
					results.put(response.getRequestID(),type.cast(response.getReturnValue()));
				} else {
					results.put(response.getRequestID(), NullObject);
				}
				synchronized (this) {
					this.notifyAll();
				}
				break;
			}
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    abstract public Object invokeOperation(String opName, Param[] args);

    /**
     * Register to the service registry
     */
    public void register() {
    	int registerId = (int) this.sendRequest(ServiceRegistryInterface.NAME, ServiceRegistryInterface.ADDRESS, true, "register", serviceDescription);
    	this.serviceDescription.setRegisterID(registerId);
    	System.out.println("The service " + serviceDescription.getServiceType() + " has been registered. The registerID is " + this.serviceDescription.getRegisterID());
    }

    /**
     * Un register from the service registry
     */
    public void unRegister() {
    	this.sendRequest(ServiceRegistryInterface.NAME, ServiceRegistryInterface.ADDRESS, true, "unRegister", this.serviceDescription.getRegisterID());
    }

    /**
     * Helps to dynamically update the service description
     */
    public void updateServiceDescription() {
    	if (serviceDescription.getRegisterID() > 0)
    		this.sendRequest(ServiceRegistryInterface.NAME, ServiceRegistryInterface.ADDRESS, true, "update", this.serviceDescription);
    	else
    		System.err.println("Service is not registered in the registy yet. It can't be updated.");
    }

    public ServiceDescription getServiceDescription() {
    	return serviceDescription;
    }

    public void setServiceDescription(ServiceDescription serviceDescription) {
    	this.serviceDescription = serviceDescription;
    }

    // ////////////////////////////////////////// Service Configuration //////////////////////////////////////////////////////
    protected Configuration configuration;

    public Configuration getConfiguration() {
    	return this.configuration;
    }

    protected void createServiceDescription() {
		List<Operation> opList = new ArrayList<Operation>();
		for (Method operation : this.getClass().getMethods()) {
			if (operation.getAnnotation(ServiceOperation.class) != null) {
				ServiceOperation serviceOperation = operation.getAnnotation(ServiceOperation.class);
				Operation op = new Operation(operation.getName(),operation.getParameterTypes(), operation.getReturnType().getName());
				op.setOpCost(serviceOperation.OperationCost());
				opList.add(op);
			}
		}
		serviceDescription.setOperationList(opList);
		serviceDescription.setServiceType(this.getClass().getSimpleName());
    }

    abstract protected void readConfiguration();

    protected void applyConfiguration() {
		if (configuration.MultipleThreads == false) {
			executors = Executors.newSingleThreadExecutor();
		} else {
			executors = Executors.newFixedThreadPool(configuration.maxNoOfThreads);
		}
    }
}