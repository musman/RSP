package service.adaptation.probes.interfaces;

public interface WorkflowProbeInterface {
    
    public void workflowStarted(String qosRequirement, Object[] params);

    
    public void workflowEnded(Object result, String qosRequirement, Object[] params);
}
