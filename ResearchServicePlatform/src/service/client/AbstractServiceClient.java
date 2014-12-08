package service.client;

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

import service.auxiliary.Response;

import org.apache.activemq.ActiveMQConnectionFactory;

import service.auxiliary.Request;
import service.auxiliary.ServiceDescription;
import service.auxiliary.XMLBuilder;

public class AbstractServiceClient implements MessageListener {
    private String serviceAddress; 
    //private boolean transacted = false;
    //private static int ackMode = Session.AUTO_ACKNOWLEDGE;
    private MessageProducer producer;
    private Session session;
    private int messageCount = 0;
    Object result=null;
    
    static int clientId=0;
    String clientEndpoint;
    InitialContext initContext;
    QueueConnectionFactory queueConnectingFactory;
    QueueConnection queueConnection;
    
    public AbstractServiceClient(String serviceEndpoint){
    	String clientEndpoint= serviceEndpoint + ".client" + (clientId == 0? "" : clientId);
    	clientId++;
    	initialize(serviceEndpoint, clientEndpoint);
    }
    
    public AbstractServiceClient(String serviceEndpoint, String clientEndpoint){
    	initialize(serviceEndpoint, clientEndpoint);
    }
    
    private void initialize(String serviceEndpoint, String clientEndpoint){
    	this.serviceAddress = serviceEndpoint;
    	this.clientEndpoint = clientEndpoint;
    	
    	try {
    	    initContext = new InitialContext();
    	    queueConnectingFactory = (QueueConnectionFactory) initContext.lookup("ConnectionFactory");
    	    
    	    Queue queue = (Queue) initContext.lookup("dynamicQueues/" + clientEndpoint);
    	    
    	    queueConnection = queueConnectingFactory.createQueueConnection();
    	    QueueSession session = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

    	    MessageConsumer receiver = session.createConsumer(queue);
    	    receiver.setMessageListener(this);
    	    queueConnection.start();

    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    	
    	/*
	this.setServiceAddress(serviceAddress);
	
	ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection connection;
        try {
            connection = connectionFactory.createConnection();
            connection.start();
            session = connection.createSession(transacted, ackMode);
            Destination adminQueue = session.createQueue(serviceAddress);
 
            //Setup a message producer to send message to the queue the server is consuming from
            this.producer = session.createProducer(adminQueue);
            this.producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
        } catch (JMSException e) {
            e.printStackTrace();
        }*/
    }

    
    public synchronized Object sendRequest(String methodName, Object...params){
	
    	try {
    	    Request request = new Request(0, "dynamicQueues/", clientEndpoint, methodName, params);
    	    XMLBuilder build = new XMLBuilder();
    	    String requestMessage = build.toXML(request);

    	    Queue queue = (Queue) initContext.lookup("dynamicQueues/" + this.serviceAddress);

    	    QueueConnection connection = queueConnectingFactory.createQueueConnection();
    	    QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
    	    MessageProducer sender = session.createProducer(queue);
    	    sender.send(session.createTextMessage(requestMessage));

    	    // messageCount.incrementAndGet();
    	    connection.close();
    	    
    		synchronized (this) {
    		    //while (result==null) {
    			this.wait();
    			// Thread.sleep(1000);
    		   // }
    		}
    		return result;
    	   
    	} catch (Exception e) {
    	    e.printStackTrace();
    	    return null;
    	}
    	
    	/*
	try {
            Destination tempDest = session.createTemporaryQueue();
            MessageConsumer responseConsumer = session.createConsumer(tempDest);
 
            //This class will handle the messages to the temp queue as well
            responseConsumer.setMessageListener(this);
 
	    // System.out.println(destination);
	    // System.out.println(address);
	    // System.out.println("Sending request message: ");

	    Request request = new Request(messageCount, null, null, methodName, params);
	    XMLBuilder build = new XMLBuilder();
	    String requestMessage = build.toXML(request);
	    
	    //this.sendMessage(requestMessage, serviceAddress);

	    //Now create the actual message you want to send
            TextMessage txtMessage = session.createTextMessage();
            txtMessage.setText(requestMessage);
 
            //Set the reply to field to the temp queue you created above, this is the queue the server
            //will respond to
            txtMessage.setJMSReplyTo(tempDest);
 
            //Set a correlation ID so when you get a response you know which sent message the response is for
            //If there is never more than one outstanding message to the server then the
            //same correlation ID can be used for all the messages...if there is more than one outstanding
            //message to the server you would presumably want to associate the correlation ID with this
            //message somehow...a Map works good
            result = null;
            this.producer.send(txtMessage);
	    
	   
		synchronized (this) {
		    //while (result==null) {
			this.wait();
			// Thread.sleep(1000);
		   // }
		}
		return result;
	   
    	

	}catch (Exception e) {
	    e.printStackTrace();
	    return null;
	}*/
        
    }

    @Override
    public void onMessage(Message message) {
	try {
	    String msgText = ((TextMessage) message).getText();	   
	 
		Response response = (Response) (new XMLBuilder().fromXML(msgText));
		if (response.getReturnType() != null) {
		    Class<?> type = (Class<?>) response.getReturnType();
		    result=type.cast(response.getReturnValue());
		} else {
		    result=null;
		}
		synchronized (this) {
		    this.notifyAll();
		}
		
	} catch (Exception e) {
	    e.printStackTrace();
	}    
	
    }

    public String getServiceAddress() {
	return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
	this.serviceAddress = serviceAddress;
    }
}
