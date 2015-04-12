/**
 * 
 */
package service.adaptation.probes;

import java.util.LinkedList;
import java.util.List;

import service.auxiliary.ServiceDescription;

/**
 * Abstract probe class with lists of defined interfaces
 * @author Yifan Ruan
 * @email ry222ad@student.lnu.se
 *
 */
public abstract class AbstractProbe<E> {

    protected List<E> subscribers = new LinkedList<E>();

    /**
     * Probe when workflow started
     * @param qosRequirement
     * @param params
     */
    public void workflowStarted(String qosRequirement, Object[] params) {
    }

    /**
     * Probe when workflow ended
     * @param result
     * @param qosRequirement
     * @param params
     */
    public void workflowEnded(Object result, String qosRequirement, Object[] params) {
    }

    /**
     * Probe when invoking a service
     * @param service
     * @param opName
     * @param params
     */
    public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params) {
    }

    /**
     * Probe when receiving the response from a service
     * @param service
     * @param result
     * @param opName
     * @param params
     */
    public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params) {
    }

    /**
     * Probe when a service timeouts
     * @param service
     * @param opName
     * @param params
     */
    public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params) {
    }

    /**
     * Probe the cost of a service
     * @param service
     * @param opName
     */
    public void costOperation(ServiceDescription service, String opName) {
    }
    
    /**
     * Probe when the service to be invoked not found
     * @param serviceType
     * @param serviceName
     */
    public void serviceNotFound(String serviceType, String serviceName){
    }
    
    /**
     * Register a probe 
     * @param e
     */
    public void register(E e){
    	subscribers.add(e);
    }
    
    /**
     * Unregister a probe
     * @param e
     */
    public void unRegister(E e){
    	subscribers.remove(e);
    }

}
