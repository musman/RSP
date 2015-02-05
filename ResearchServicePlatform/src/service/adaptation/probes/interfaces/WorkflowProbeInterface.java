package service.adaptation.probes.interfaces;

public interface WorkflowProbeInterface extends ServiceInvocationProbeInterface{
    
    /**
     *  This event is triggered when a request has been made to composite service to start the execution of the workflow.
     */
    public void workflowStarted(String qosRequirement, Object[] params);
    
    /**
     *  When a workflow finish execution, this event is triggered.
     */
    public void workflowEnded(Object result, String qosRequirement, Object[] params);

}
