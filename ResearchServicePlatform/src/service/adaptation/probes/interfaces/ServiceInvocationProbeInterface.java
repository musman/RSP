package service.adaptation.probes.interfaces;

import service.auxiliary.ServiceDescription;

public interface ServiceInvocationProbeInterface {
    
    /**
     *  This event is triggered when a service is selected by QoS requirement to be invoked.
     */
    public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params);

    /**
     *  This event is triggered when a call to service operation is successfully returned.
     */
    public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params);

    /**
     *  When an invocation of service operation is failed, this even is triggered.
     */
    public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params);
    
    /**
     * This event is fired when a service is not found.
     */
    public void serviceNotFound(String serviceType, String opName);
}
