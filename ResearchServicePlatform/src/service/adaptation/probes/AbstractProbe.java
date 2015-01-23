/**
 * 
 */
package service.adaptation.probes;

import service.auxiliary.ServiceDescription;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public abstract class AbstractProbe {
	public void workflowStarted(String qosRequirement, Object[] params){}
	public void workflowEnded(Object result,String qosRequirement,Object[] params){}
	public void serviceOperationInvoked(ServiceDescription service, String opName, Object[] params){}
	public void serviceOperationReturned(ServiceDescription service, Object result, String opName, Object[] params){}
	public void serviceOperationTimeout(ServiceDescription service, String opName, Object[] params){}
	public void costOperation(ServiceDescription service, String opName, double cost){}
}
