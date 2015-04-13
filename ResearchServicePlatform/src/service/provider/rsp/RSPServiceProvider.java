package service.provider.rsp;

import service.provider.MessageReceiver;
import service.provider.ServiceProvider;

public class RSPServiceProvider implements ServiceProvider {

    private RSPMessagingService rspMessagingService;
    private String endPoint;
    private MessageReceiver messageReceiver;
   
    public RSPServiceProvider() {
	rspMessagingService = RSPMessagingService.getInstance();
    }
   
    @Override
    public void startListening(String endPoint, MessageReceiver messageReceiver) {
	this.endPoint = endPoint;
	this.messageReceiver = messageReceiver;
	rspMessagingService.register(endPoint, messageReceiver);
    }

    @Override
    public void stopListening() {
	rspMessagingService.deregister(endPoint);
    }

    @Override
    public void sendMessage(String msgText, String destinationEndPoint) {
	rspMessagingService.sendMessage(endPoint, destinationEndPoint, msgText);
    }

}
