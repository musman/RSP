package service.messagingservice;

import service.provider.MessageReceiver;
import service.provider.ServiceProvider;

/**
 * 
 * A service provider with functions of 
 * sending message and handling incoming messages
 */
public class MessagingServiceProvider implements ServiceProvider {

    private MessagingService rspMessagingService;
    private String endPoint;
    //private MessageReceiver messageReceiver;
   
    /**
     * Constructor
     */
    public MessagingServiceProvider() {
    	rspMessagingService = MessagingService.getInstance();
    }
   
    @Override
    public void startListening(String endPoint, MessageReceiver messageReceiver) {
    	this.endPoint = endPoint;
    	//this.messageReceiver = messageReceiver;
    	rspMessagingService.register(endPoint, messageReceiver);
    }

    @Override
    public void stopListening() {
    	rspMessagingService.unRegister(endPoint);
    }

    @Override
    public void sendMessage(String msgText, String destinationEndPoint) {
    	rspMessagingService.sendMessage(endPoint, destinationEndPoint, msgText);
    }

}
