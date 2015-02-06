package service.adaptation.probes.interfaces;

import service.auxiliary.ServiceDescription;

public interface WorkflowProbeInterface {

    /**
     * This event is triggered when a request has been made to composite service to start the execution of the workflow.
     */
    public void workflowStarted(String qosRequirement, Object[] params);

    /**
     * Generates an event when a service operation is invoked by the workflow.
     */
    public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params);

    /**
     * Generates an event when a service operation invoked by the workflow returns successfully.
     */
    public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params);

    /**
     * Generates an event when a service operation invoked by the workflow fails, that is, the service has not responded within a predefined timeout.
     */
    public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params);

    /**
     * Generates an event when the workflow cannot find a concrete service for the given service type and operation.
     */
    public void serviceNotFound(String serviceType, String opName);

    /**
     * When a workflow finish execution, this event is triggered.
     */
    public void workflowEnded(Object result, String qosRequirement, Object[] params);

}
