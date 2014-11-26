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
	public void timeout(ServiceDescription serviceSelected);
	public void serviceExecuted(ServiceDescription serviceSelected, Object result, String opName, Object params[]);
	//public void workflowExecuteStarted();
	//public void workflowExecuteEnded();
	public void compositeServiceStarted(String qosRequirementName, Object params[]);
	public void compositeServiceEnded(Object result);
}
