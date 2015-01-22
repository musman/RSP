/**
 * 
 */
package service.adaptation.effector;

import service.auxiliary.ServiceDescription;
import service.composite.CompositeService;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class AbstractEffector {
	
	CompositeService compositeService=null;
	
	public AbstractEffector(CompositeService compositeService){
		this.compositeService=compositeService;
		compositeService.addEffector(this);
	}
	
	/**
	 * @return the compositeService
	 */
	public CompositeService getCompositeService() {
		return compositeService;
	}

	/**
	 * @param compositeService the compositeService to set
	 */
	//public void setCompositeService(CompositeService compositeService) {
	//	this.compositeService = compositeService;
	//}
	
	/**
	 * Select another service, in case of failure
	 * @param service
	 * @param opName
	 * @param params
	 * @return
	 */
	 public ServiceDescription selectAlternativeService(ServiceDescription service, String opName, Object[] params){
	     return null;
	 }
}
