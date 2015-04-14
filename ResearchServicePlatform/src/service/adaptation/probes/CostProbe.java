package service.adaptation.probes;

import service.adaptation.probes.interfaces.CostProbeInterface;
import service.auxiliary.ServiceDescription;

public class CostProbe extends AbstractProbe<CostProbeInterface> {

    double cost;
    
    @Override
    public void costOperation(ServiceDescription service, String opName){
    	cost = service.getOperationCost(opName);
    	notifyCostSubscribers(service.getServiceName(), opName, cost);
    }
    
    /**
     * Notify subscribed probes the cost of a service
     * @param serviceName
     * @param opName
     * @param cost
     */
    private void notifyCostSubscribers(String serviceName, String opName, double cost){
    	for (CostProbeInterface subscriber : subscribers) {
    		subscriber.serviceCost(serviceName, opName, cost);
    	}
    }
}
