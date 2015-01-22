package service.utility;
import service.adaptation.probes.Probe;
import service.auxiliary.ServiceDescription;

public class LogFailure extends Probe{

    @Override
    public void workflowStarted(String qosRequirement, Object[] params) {
	
    }

    @Override
    public void workflowEnded(Object result, String qosRequirement, Object[] params) {
	
    }

    @Override
    public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params) {
	
    }

    @Override
    public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params) {
	
    }

    @Override
    public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params) {
	System.err.println("Service Failed:" + service.getServiceName());
    }

}
