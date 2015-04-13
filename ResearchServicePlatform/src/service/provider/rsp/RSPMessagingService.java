package service.provider.rsp;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import service.provider.MessageReceiver;

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
		
		if (messageLoss > 0){
		    if (100 / messageLoss == messageCount)
			return;
		    else 
			messageCount++;
		}
		
		if (minDelay + maxDelay != 0){
		    try {
			Thread.sleep(random.nextInt(maxDelay - minDelay + 1) + minDelay);
		    } catch (InterruptedException e) {
			e.printStackTrace();
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
}
