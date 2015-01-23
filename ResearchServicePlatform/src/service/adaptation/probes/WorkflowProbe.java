package service.adaptation.probes;

import service.adaptation.probes.interfaces.WorkflowProbeInterface;

public class WorkflowProbe extends AbstractProbe<WorkflowProbeInterface>{

    @Override
    public void workflowStarted(String qosRequirement, Object[] params){
	notifyWorkflowStarted(qosRequirement, params);
    }

    @Override
    public void workflowEnded(Object result, String qosRequirement, Object[] params){
	notifyWorkflowEnded(result, qosRequirement, params);
    }
    
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

}
