package service.adaptation.probes;

import java.util.LinkedList;
import java.util.List;

import service.adaptation.probes.interfaces.CostProbeInterface;
import service.auxiliary.ServiceDescription;

public class CostProbe extends AbstractProbe<CostProbeInterface> {

    List<CostProbeInterface> subscribers = new LinkedList<>();
    double cost;
    @Override
    public void costOperation(ServiceDescription service, String opName){
	cost = service.getOperationCost(opName);
	
	notifyCostSubscribers(service.getServiceName(), opName, cost);
    }
    
    private void notifyCostSubscribers(String serviceName, String opName, double cost){
	for (CostProbeInterface subscriber : subscribers) {
	    subscriber.serviceCost(serviceName, opName, cost);
	}
    }
}
