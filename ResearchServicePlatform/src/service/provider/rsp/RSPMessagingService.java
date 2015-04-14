package service.provider.rsp;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import service.provider.MessageReceiver;
import service.utility.Time;

public class RSPMessagingService {
    
    private static RSPMessagingService instance;
    
    static{
	instance = new RSPMessagingService();
    }
    
    public static RSPMessagingService getInstance() {
	return instance;
    }

    private HashMap<String, MessageReceiver> queue = new HashMap<>();
    
    private ExecutorService threadPool = Executors.newCachedThreadPool();
    
    private int messageLoss, messageCount;
    private int minDelay, maxDelay;
    private Random random = new Random();
    
    public void register(String endPoint, MessageReceiver messageReceiver) {
	queue.put(endPoint, messageReceiver);
    }

    public void deregister(String endPoint) {
	queue.remove(endPoint);
    }

    public void sendMessage(String endPoint, String destinationEndPoint, String msgText) {
	threadPool.submit(new Runnable() {
	    
	    @Override
	    public void run() {
		if (!(endPoint.contains(".#CLIENT#.") || destinationEndPoint.contains(".#CLIENT#.") ||
				endPoint.endsWith(".registry") || destinationEndPoint.endsWith(".registry"))){
		if (messageLoss > 0){
		    if (100 / messageLoss == messageCount){
		    	messageCount = 0;
		    	return;
		    }
		    else {
			messageCount++;
		    }
		}
		
		if (minDelay + maxDelay != 0){
		    try {
			Thread.sleep(random.nextInt((maxDelay - minDelay + 1) + minDelay)*Time.scale);
		    } catch (InterruptedException e) {
			e.printStackTrace();
		    }
		}
		
		}
		queue.get(destinationEndPoint).onMessage(msgText);
	    }
	});
	
	
	
    }
    
    public void setMessageDelay(int minDelay, int maxDelay) {
	this.minDelay = minDelay;
	this.maxDelay = maxDelay;
    }
    
    public void setMessageLoss(int messageLoss) {
	this.messageLoss = messageLoss;
    }
    
    public int getMessageLoss(){
    	return this.messageLoss;
    }
    
    public int getMessageMinDelay(){
    	return this.minDelay;
    }
    
    public int getMessageMaxDelay(){
    	return this.maxDelay;
    }
}
