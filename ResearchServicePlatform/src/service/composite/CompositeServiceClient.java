package service.composite;

import java.util.List;
import service.client.AbstractServiceClient;

public class CompositeServiceClient {

    AbstractServiceClient client;
    
    /**
     * Automatically take care the client endpoint
     * @param serviceEndpoint
     */
    public CompositeServiceClient(String serviceEndpoint){
	client = new AbstractServiceClient(serviceEndpoint);
    }
    
    /*
     * Note: client endpoint should be unique
     */
    public CompositeServiceClient(String serviceEndpoint, String clientEndpoint){
    	client = new AbstractServiceClient(serviceEndpoint, clientEndpoint);
    }
    
    public Object invokeCompositeService(String qosRequirement, Object...params){
	return client.sendRequest("invokeCompositeService", qosRequirement, params);
    }
    
    public List<String> getQosRequirementNames(){
	return (List<String>) client.sendRequest("getQosRequirementNames"); 
    }
}
