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
    
    /**
     * Note: client endpoint should be unique
     * @param serviceEndpoint
     * @param clientEndpoint
     */
    public CompositeServiceClient(String serviceEndpoint, String clientEndpoint){
    	client = new AbstractServiceClient(serviceEndpoint, clientEndpoint);
    }
    
    /**
     * Invoke related composite service to start a workflow with specific QoS requirements 
     * and initial parameters for the workflow
     * @param qosRequirement
     * @param params
     * @return
     */
    public Object invokeCompositeService(String qosRequirement, Object...params){
    	return client.sendRequest("invokeCompositeService", qosRequirement, params);
    }
    
    /**
     * Get list of QoS requirements
     * @return
     */
    public List<String> getQosRequirementNames(){
    	return (List<String>) client.sendRequest("getQosRequirementNames"); 
    }
}
