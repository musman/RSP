package service.adaptation.probes.interfaces;

import service.auxiliary.ServiceDescription;

public interface ServiceInvocationProbeInterface {
    
    public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params);

    public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params);

    public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params);
}
