package service.adaptation.probes;

public abstract class WorkflowInvocationProbe extends Probe{

    @Override
    public abstract void workflowStarted(String qosRequirement, Object[] params);

    @Override
    public abstract void workflowEnded(Object result, String qosRequirement, Object[] params);

}
