/**
 * 
 */
package service.adaptation;

import service.auxiliary.ServiceDescription;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public interface Probe {
	public void timeout(ServiceDescription service, String opName, Object[] params);
	public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params);
	public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params);
	public void workflowStarted(String qosRequirement, Object[] params);
	public void workflowEnded(Object result,String qosRequirement,Object[] params);
}
