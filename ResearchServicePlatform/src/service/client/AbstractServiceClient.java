package service.client;

import service.auxiliary.Response;
import service.auxiliary.Request;
import service.auxiliary.XMLBuilder;
import service.provider.MessageReceiver;
import service.provider.ServiceProvider;
import service.provider.ServiceProviderFactory;

public class AbstractServiceClient implements MessageReceiver {
    private String serviceAddress;
    Object result = null;

    static int clientId = 0;
    String clientEndpoint;
   ServiceProvider serviceProvider;
    public AbstractServiceClient(String serviceEndpoint) {
	String clientEndpoint = serviceEndpoint + ".client" + (clientId == 0 ? "" : clientId);
	clientId++;
	initialize(serviceEndpoint, clientEndpoint);
    }

    public AbstractServiceClient(String serviceEndpoint, String clientEndpoint) {
	initialize(serviceEndpoint, clientEndpoint);
    }

    private void initialize(String serviceEndpoint, String clientEndpoint) {
	this.serviceAddress = serviceEndpoint;
	this.clientEndpoint = clientEndpoint;

	serviceProvider = ServiceProviderFactory.createServiceProvider();
	serviceProvider.startListening(clientEndpoint, this);	
    }

    public synchronized Object sendRequest(String methodName, Object... params) {

	try {
	    Request request = new Request(0, clientEndpoint, clientEndpoint, methodName, params);
	    XMLBuilder build = new XMLBuilder();
	    String requestMessage = build.toXML(request); 
	    
	    serviceProvider.sendMessage(requestMessage, serviceAddress);
	    
	    synchronized (this) {
		this.wait();
	    }
	    return result;

	} catch (Exception e) {
	    e.printStackTrace();
	    return null;
	}
    }

    @Override
    public void onMessage(String message) {
	try {

	    Response response = (Response) (new XMLBuilder().fromXML(message));
	    if (response.getReturnType() != null) {
		Class<?> type = (Class<?>) response.getReturnType();
		result = type.cast(response.getReturnValue());
	    } else {
		result = null;
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
