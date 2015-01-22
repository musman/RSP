package service.composite;

import java.util.ArrayList;

import service.adaptation.probes.AbstractProbe;
import service.auxiliary.ServiceDescription;

/**
 * ProbeList to be used in composite service
 * @author M. Usman Iftikhar
 *
 */
public class ProbeList extends ArrayList<AbstractProbe> {

    public void workflowStarted(String qosRequirement, Object[] params) {
	for (int i = 0; i < size(); i++) {
	    this.get(i).workflowStarted(qosRequirement, params);
	}
    }

    public void workflowEnded(Object result, String qosRequirement, Object[] params) {
	for (int i = 0; i < size(); i++) {
	    this.get(i).workflowEnded(result, qosRequirement, params);
	}
    }

    public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params) {
	for (int i = 0; i < size(); i++) {
	    this.get(i).serviceOperationInvoked(service, opName, params);
	}
    }

    public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params) {
	for (int i = 0; i < size(); i++) {
	    this.get(i).serviceOperationReturned(service, result, opName, params);
	}
    }

    public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params) {
	for (int i = 0; i < size(); i++) {
	    this.get(i).serviceOperationTimeout(service, opName, params);
	}
    }

    public void costOperation(ServiceDescription service, String opName) {
	for (int i = 0; i < size(); i++) {
	    this.get(i).costOperation(service, opName);
	}
    }
}
