package service.provider;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import service.auxiliary.AbstractMessage;
import service.auxiliary.Configuration;
import service.auxiliary.Operation;
import service.auxiliary.OperationAborted;
import service.auxiliary.Param;
import service.auxiliary.Request;
import service.auxiliary.Response;
import service.auxiliary.ServiceDescription;
import service.auxiliary.ServiceOperation;
import service.auxiliary.ServiceRegistryInterface;
import service.auxiliary.TimeOutError;
import service.auxiliary.XMLBuilder;

public abstract class AbstractService implements MessageListener {

    String serviceName;
    String serviceEndpoint;
    InitialContext initContext;
    QueueConnectionFactory queueConnectingFactory;
    QueueConnection queueConnection;
    AtomicInteger messageCount = new AtomicInteger(0);
    Map<Integer, Object> results = new ConcurrentHashMap<Integer, Object>();
    ServiceDescription serviceDescription;
    private Object NullObject = new Object();
    ExecutorService executors;
    // private AtomicServiceBehavior serviceBehavior;

    public static final boolean DEBUG = false;

    public AbstractService(String serviceName, String serviceEndpoint) {
	try {
	    initContext = new InitialContext();
	    queueConnectingFactory = (QueueConnectionFactory) initContext.lookup("ConnectionFactory");
	    this.serviceName = serviceName;
	    this.serviceEndpoint = serviceEndpoint;
	    serviceDescription = new ServiceDescription(serviceName, serviceEndpoint);
	    createServiceDescription();
	    readConfiguration();
	    applyConfiguration();
	} catch (NamingException e) {
	    e.printStackTrace();
	}
    }

    public AbstractService(String serviceName, String serviceEndpoint, int responseTime) {
	this(serviceName, serviceEndpoint);
	serviceDescription = new ServiceDescription(serviceName, serviceEndpoint, responseTime);
    }

    private void sendMessage(String msgText, Destination destination) {
	try {
	    // Queue queue = (Queue) initContext.lookup(destination);
	    QueueConnection connection = queueConnectingFactory.createQueueConnection();
	    QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
	    MessageProducer sender = session.createProducer(destination);
	    sender.send(session.createTextMessage(msgText));

	    // messageCount.incrementAndGet();
	    connection.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public Object sendRequest(String service, String destination, boolean reply, String opName, Object... params) {
	try {
	    int messageID = messageCount.incrementAndGet();
	    Request request = new Request(messageID, "dynamicQueues/" + this.serviceEndpoint, service, opName, params);
	    XMLBuilder build = new XMLBuilder();
	    String requestMessage = build.toXML(request);

	    Queue queue = (Queue) initContext.lookup("dynamicQueues/" + destination);
	    this.sendMessage(requestMessage, queue);

	    if (DEBUG)
		System.out.println("The request message is: \n" + requestMessage);

	    if (reply) {
		synchronized (this) {
		    while (!results.containsKey(messageID)) {
			this.wait();
			// Thread.sleep(1000);
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

    public Object sendRequest(String service, String destination, boolean reply, long responseTime, String opName, Object... params) {
	try {
	    int messageID = messageCount.incrementAndGet();
	    Request request = new Request(messageID, "dynamicQueues/" + this.serviceEndpoint, service, opName, params);
	    XMLBuilder build = new XMLBuilder();
	    String requestMessage = build.toXML(request);

	    Queue queue = (Queue) initContext.lookup("dynamicQueues/" + destination);
	    this.sendMessage(requestMessage, queue);

	    if (DEBUG)
		System.out.println("The request message is: \n" + requestMessage);

	    if (reply) {
		synchronized (this) {
		    long startTime = System.currentTimeMillis();
		    while (!results.containsKey(messageID)) {
			this.wait(responseTime * 1000);
			// System.out.println(time);
			long endTime = System.currentTimeMillis();
			if ((endTime - startTime) / 1000.0 >= responseTime) {
			    // System.out.println("time out");
			    results.put(messageID, new TimeOutError());
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

    private void sendResponse(int requestID, Object result, Destination destination) {
	Response response = new Response(messageCount.incrementAndGet(), requestID, this.serviceEndpoint, result);
	XMLBuilder build = new XMLBuilder();
	String responseMessage = build.toXML(response);

	this.sendMessage(responseMessage, destination);
    }

    public void startService() {
	try {
	    // System.out.println("Start service");
	    Queue queue = (Queue) initContext.lookup("dynamicQueues/" + serviceEndpoint);

	    queueConnection = queueConnectingFactory.createQueueConnection();
	    QueueSession session = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

	    MessageConsumer receiver = session.createConsumer(queue);
	    receiver.setMessageListener(this);
	    // System.out.println(this.getClass());
	    queueConnection.start();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public void stopService() {
	try {
	    // System.out.println("Stop service");

	    queueConnection.close();
	} catch (JMSException e) {
	    e.printStackTrace();
	}
    }


    @Override
    public void onMessage(final Message message) {
	try {
	    String msgText = ((TextMessage) message).getText();
	    AbstractMessage msg = (AbstractMessage) (new XMLBuilder().fromXML(msgText));
	    final int requestID = msg.getId();
	    String messageType = msg.getType();
	    final String destination = msg.getAddress();
	    // System.out.println(destination);
	    switch (messageType) {
	    case "request": {
		// System.out.println("request");
		// System.out.println(msgText);
		if (DEBUG)
		    System.out.println("Receiving the request: \n" + msgText);
		final Request request = (Request) msg;
		// if (request.serviceName.equals(serviceName)) {
		executors.submit(new Callable<Object>() {

		    @Override
		    public Object call() throws Exception {
			try {

			    // System.out.println(request.getOpName());
			    Object result = invokeOperation(request.getOpName(), request.getParams());

			    if (result instanceof OperationAborted)
				return null;
			    // Object result =callOperation(request.getOpName(),request.getParams());

			    // System.out.println(Object[].class);
			    // System.out.println(this.getClass().getMethod("invokeAtomicService",Object[].class));

			    if (destination != null) {
				Queue queue = (Queue) initContext.lookup(destination);
				sendResponse(requestID, result, queue);
			    } else {
				sendResponse(requestID, result, message.getJMSReplyTo());
				// this.sendResponseToClient(message,
				// result);

			    }

			} catch (Exception e) {
			    e.printStackTrace();
			}

			return null;
		    }
		});
		break;
	    }
	    case "response": {
		// System.out.println("response");
		// System.out.println(msgText);
		if (DEBUG)
		    System.out.println("Receiving the response: \n" + msgText);
		Response response = (Response) msg;
		// System.out.println(response.requestID);
		if (response.getReturnType() != null) {
		    Class<?> type = (Class<?>) response.getReturnType();
		    results.put(response.getRequestID(), type.cast(response.getReturnValue()));
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

    /*
     * private Object callOperation(String opName, Param... params) { // System.out.println(this.getClass().getMethods().length);
     * 
     * for (Method operation : this.getClass().getMethods()) { if (operation.getAnnotation(ServiceOperation.class) != null) { try {
     * 
     * if (operation.getName().equals(opName)) {
     * 
     * Class<?>[] paramTypes = operation.getParameterTypes(); int size = paramTypes.length; if (size == params.length) { Object[] args = new Object[size]; for (int i = 0; i < size;
     * i++) { args[i] = params[i].getValue(); } return operation.invoke(this, args); } } } catch (Exception e) { e.printStackTrace();
     * System.out.println("The operation name or params are not valid. Please check and send again!"); } } }
     * 
     * return null; }
     */

    abstract public Object invokeOperation(String opName, Param[] args);

    /**
     * Register to the service registry
     */
    public void register() {

	// this.sendRequest("ServiceRegistry", "register", params, "ServiceRegistry");
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

    //////////////////////////////////////////// Service Configuration //////////////////////////////////////////////////////
    protected Configuration configuration;

    public Configuration getConfiguration() {
	return this.configuration;
    }

    protected void createServiceDescription() {
	List<Operation> opList = new ArrayList<Operation>();
	for (Method operation : this.getClass().getMethods()) {
	    if (operation.getAnnotation(ServiceOperation.class) != null) {
		ServiceOperation serviceOperation = operation.getAnnotation(ServiceOperation.class);
		Operation op = new Operation(operation.getName(), operation.getParameterTypes(), operation.getReturnType().getName());
		op.setCost(serviceOperation.OperationCost());
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