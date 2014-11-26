package service.provider;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
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

import service.atomic.AtomicServiceBehavior;
import service.auxiliary.AbstractMessage;
import service.auxiliary.Operation;
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
    
    //private AtomicServiceBehavior serviceBehavior;

    public static final boolean DEBUG = false;

    public AbstractService(String serviceName, String serviceEndpoint) {
	try {
	    initContext = new InitialContext();
	    queueConnectingFactory = (QueueConnectionFactory) initContext.lookup("ConnectionFactory");
	    this.serviceName = serviceName;
	    this.serviceEndpoint = serviceEndpoint;
	    serviceDescription =new ServiceDescription(serviceName, serviceEndpoint);
	} catch (NamingException e) {
	    e.printStackTrace();
	}
    }
    
    public AbstractService(String serviceName, String serviceEndpoint,int responseTime) {
	try {
	    initContext = new InitialContext();
	    queueConnectingFactory = (QueueConnectionFactory) initContext.lookup("ConnectionFactory");
	    this.serviceName = serviceName;
	    this.serviceEndpoint = serviceEndpoint;
	    serviceDescription =new ServiceDescription(serviceName, serviceEndpoint,responseTime);
	} catch (NamingException e) {
	    e.printStackTrace();
	}
    }

    private void sendMessage(String msgText, Destination destination) {
	try {
	    // Queue queue = (Queue) initContext.lookup(destination);
	    QueueConnection connection = queueConnectingFactory.createQueueConnection();
	    QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
	    MessageProducer sender = session.createProducer(destination);
	    sender.send(session.createTextMessage(msgText));
	    
	    //messageCount.incrementAndGet();
	    connection.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public Object sendRequest(String service, String destination, boolean reply, String opName,Object... params) {
	try {
	    // System.out.println(destination);
	    // System.out.println(address);
	    // System.out.println("Sending request message: ");
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
		return result != NullObject? result : null;
	    }
	    return null;
	} catch (Exception e) {
	    e.printStackTrace();
	    return null;
	}
    }

    public Object sendRequest(String service, String destination, boolean reply, long responseTime, String opName,Object... params) {
	try {
	    // System.out.println(destination);
	    // System.out.println(address);
	    // System.out.println("Sending request message: ");
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
			long startTime=System.currentTimeMillis();
			//System.out.println(responseTime);
			//double time=System.currentTimeMillis()+responseTime*1000.0;
			//System.out.println(time);
			//System.out.println(startTime);
			//System.out.println(System.currentTimeMillis());
		    while (!results.containsKey(messageID)) {
		    	this.wait(responseTime * 1000);
		    	//System.out.println(time);
		    	long endTime=System.currentTimeMillis();
		    	if((endTime-startTime)/1000.0 >= responseTime){
		    		//System.out.println("time out");
		    		results.put(messageID, new TimeOutError());
		    	}
		    }
		}
		Object result = results.get(messageID);
		results.remove(messageID);
		return result != NullObject? result : null;
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

    public void sendResponseToClient(Message message, Object result) {
	try {
	    Response response = new Response(messageCount.get(), -1, this.serviceEndpoint, result);
	    XMLBuilder build = new XMLBuilder();
	    String responseMessage = build.toXML(response);

	    Connection connection = queueConnectingFactory.createConnection();
	    Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	    MessageProducer sender = session.createProducer(message.getJMSReplyTo());
	    sender.setDeliveryMode(DeliveryMode.PERSISTENT);

	    sender.send(session.createTextMessage(responseMessage));

	    messageCount.incrementAndGet();
	} catch (Exception e) {
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
				new Thread(new Runnable() {

					@Override
					public void run() {
						try {

							//System.out.println(request.getOpName());
							Object result =invokeOperation(request.getOpName(),request.getParams());

							//Object result =callOperation(request.getOpName(),request.getParams());

							//System.out.println(Object[].class);
							//System.out.println(this.getClass().getMethod("invokeAtomicService",Object[].class));
							
							if (destination != null) {
								Queue queue = (Queue) initContext
										.lookup(destination);
								sendResponse(requestID, result, queue);
							} else {
								sendResponse(requestID, result,
										message.getJMSReplyTo());
								// this.sendResponseToClient(message,
								// result);

							}

						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
				}).start();
		// }
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
    private Object callOperation(String opName, Param... params) {
	// System.out.println(this.getClass().getMethods().length);
    	
	for (Method operation : this.getClass().getMethods()) {
	    if (operation.getAnnotation(ServiceOperation.class) != null) {
		try {
			
		    if (operation.getName().equals(opName)) {
		    	
			Class<?>[] paramTypes = operation.getParameterTypes();
			int size = paramTypes.length;
			if (size == params.length) {
			    Object[] args = new Object[size];
			    for (int i = 0; i < size; i++) {
				args[i] = params[i].getValue();
			    }
			    return operation.invoke(this, args);
			}    
			}
		} catch (Exception e) {
		    e.printStackTrace();
		    System.out.println("The operation name or params are not valid. Please check and send again!");
		}		
	    }
	}
    	
	return null;
    }*/

    abstract public Object invokeOperation(String opName, Param[] args);
    
    public void register() {
	List<Operation> opList = new ArrayList<Operation>();
	for (Method operation : this.getClass().getMethods()) {
	    if (operation.getAnnotation(ServiceOperation.class) != null) {
		Operation op = new Operation();
		op.opName = operation.getName();
		// System.out.println(op.opName);
		op.paramTypes = operation.getParameterTypes();
		op.returnType = operation.getReturnType().getName();
		opList.add(op);
	    }
	}
	serviceDescription.setOperationList(opList);

	// this.sendRequest("ServiceRegistry", "register", params, "ServiceRegistry");
	int registerId = (int) this.sendRequest(ServiceRegistryInterface.NAME, ServiceRegistryInterface.ADDRESS, true, "register", serviceDescription);
	this.serviceDescription.setRegisterID(registerId);
	System.out.println("The service " + serviceDescription.getServiceName() + " has been registered. The registerID is " + this.serviceDescription.getRegisterID());
    }

    public void unRegister() {
    	this.sendRequest(ServiceRegistryInterface.NAME, ServiceRegistryInterface.ADDRESS, true, "unRegister", this.serviceDescription.getRegisterID());
    }

    public ServiceDescription getServiceDescription() {
	return serviceDescription;
    }

    public void setServiceDescription(ServiceDescription serviceDescription) {
	this.serviceDescription = serviceDescription;
    }
}