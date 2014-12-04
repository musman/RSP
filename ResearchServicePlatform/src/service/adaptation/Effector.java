/**
 * 
 */
package service.adaptation;

import java.util.List;

import service.auxiliary.ServiceDescription;
import service.composite.CompositeService;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class Effector {
	
	CompositeService compositeService=null;
	
	public Effector(CompositeService compositeService){
		this.compositeService=compositeService;
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
	public void setCompositeService(CompositeService compositeService) {
		this.compositeService = compositeService;
	}
	
	public void removeService(ServiceDescription service,String opName){
		compositeService.getCache().remove(service,opName);
	}
	
	public void refreshCache(){
		compositeService.getCache().refresh();
	}
	
	public void updateServiceDescription(ServiceDescription oldService,ServiceDescription newService,String opName){
		compositeService.getCache().update(oldService, newService, opName);
	}
}
