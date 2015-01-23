package service.adaptation.probes;

import service.adaptation.probes.interfaces.ServiceInvocationProbeInterface;
import service.auxiliary.ServiceDescription;

public class ServiceInvocationProbe extends AbstractProbe<ServiceInvocationProbeInterface>{

    @Override
    public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params){
	notifyServiceOperationInvoked(service, opName, params);
    }

    @Override
    public  void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params){
	notifyServiceOperationReturned(service, result, opName, params);
    }

    @Override
    public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params){
	notifyServiceOperationTimeout(service, opName, params);
    }
    
    private void notifyServiceOperationInvoked(ServiceDescription service, String opName, Object[] params){
	for (ServiceInvocationProbeInterface serviceInvocation : subscribers) {
	    serviceInvocation.serviceOperationInvoked(service, opName, params);
	}
    }
    
    private void notifyServiceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params){
	for (ServiceInvocationProbeInterface serviceInvocation : subscribers) {
	    serviceInvocation.serviceOperationReturned(service, result, opName, params);
	}
    }
    
    private void notifyServiceOperationTimeout(ServiceDescription service, String opName, Object[] params){
	for (ServiceInvocationProbeInterface serviceInvocation : subscribers) {
	    serviceInvocation.serviceOperationTimeout(service, opName, params);
	}
    }
}
