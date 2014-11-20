package service.composite;

import java.util.List;
import service.client.AbstractServiceClient;

public class CompositeServiceClient {

    AbstractServiceClient client;
    
    public CompositeServiceClient(String serviceAddress){
	client = new AbstractServiceClient(serviceAddress);
    }
    
    public Object invokeCompositeService(String qosRequirement, Object...params){
	return client.sendRequest("invokeCompositeService", qosRequirement, params);
    }
    
    public List<String> getQosRequirementNames(){
	return (List<String>) client.sendRequest("getQosRequirementNames"); 
    }
}
