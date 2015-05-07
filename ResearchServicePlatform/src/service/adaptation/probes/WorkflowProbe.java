package service.adaptation.probes;

import service.adaptation.probes.interfaces.WorkflowProbeInterface;
import service.auxiliary.ServiceDescription;

/**
 * 
 * Monitor the start and end of a workflow execution
 * 
 */
public class WorkflowProbe extends AbstractProbe<WorkflowProbeInterface>{
    
    public void notifyWorkflowStarted(String qosRequirement, Object[] params){
    	for(WorkflowProbeInterface workflowInterface: subscribers){
    		workflowInterface.workflowStarted(qosRequirement, params);
    	}
    }

    public void notifyWorkflowEnded(Object result, String qosRequirement, Object[] params){
    	for(WorkflowProbeInterface workflowInterface: subscribers){
    		workflowInterface.workflowEnded(result, qosRequirement, params);
    	}
    }
    
    public void notifyServiceOperationInvoked(ServiceDescription description, String opName, Object[] params){
    	for (WorkflowProbeInterface workflowInterface : subscribers) {
    		workflowInterface.serviceOperationInvoked(description, opName, params);
    	}
    }
    
    public void notifyServiceOperationReturned(ServiceDescription description, Object result, String opName, Object[] params){
    	for (WorkflowProbeInterface workflowInterface : subscribers) {
    		workflowInterface.serviceOperationReturned(description, result, opName, params);
    	}
    }
    
    public void notifyServiceOperationTimeout(ServiceDescription description, String opName, Object[] params){
    	for (WorkflowProbeInterface workflowInterface : subscribers) {
    		workflowInterface.serviceOperationTimeout(description, opName, params);
    	}
    }
    
    public void notifyServiceNotFound(String serviceType, String opName){
    	for (WorkflowProbeInterface workflowInterface : subscribers) {
    		workflowInterface.serviceNotFound(serviceType, opName);
    	}
    }
}
