/**
 * 
 */
package service.adaptation.probes;

import java.util.LinkedList;
import java.util.List;

import service.auxiliary.ServiceDescription;

/**
 * @author yfruan
 * @email ry222ad@student.lnu.se
 *
 */
public abstract class AbstractProbe<E> {

    protected List<E> subscribers = new LinkedList<E>();

    public void workflowStarted(String qosRequirement, Object[] params) {
    }

    public void workflowEnded(Object result, String qosRequirement, Object[] params) {
    }

    public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params) {
    }

    public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params) {
    }

    public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params) {
    }

    public void costOperation(ServiceDescription service, String opName) {
    }
    
    public void serviceNotFound(String serviceType, String serviceName){
    }
    
    public void register(E e){
	subscribers.add(e);
    }
    
    public void unRegister(E e){
	subscribers.remove(e);
    }

}
