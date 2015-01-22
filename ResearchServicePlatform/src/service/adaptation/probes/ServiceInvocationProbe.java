package service.adaptation.probes;

import service.auxiliary.ServiceDescription;

public abstract class ServiceInvocationProbe extends AbstractProbe{

    @Override
    public abstract void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params);

    @Override
    public abstract void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params);

    @Override
    public abstract void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params);
}
