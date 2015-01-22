/**
 * 
 */
package service.adaptation;

import java.util.List;

import service.auxiliary.Operation;
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
		compositeService.setEffector(this);
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
	
	public void removeService(ServiceDescription service){
		for(Operation operation: service.getOperationList())
			compositeService.getCache().remove(service,operation.getOpName());
	}
	
	public void removeService(ServiceDescription service,String opName){
		compositeService.getCache().remove(service,opName);
	}
	
	public void refreshCache(){
		compositeService.getCache().refresh();
	}
	
	public List<ServiceDescription> refreshCache(ServiceDescription service, String opName){
	    removeService(service, opName);
	    return compositeService.lookupService(service.getServiceName(), opName);
	}
	
	public void updateServiceDescription(ServiceDescription oldService,ServiceDescription newService){
		if(oldService.getRegisterID()==newService.getRegisterID()){
			for(Operation operation: oldService.getOperationList())
				compositeService.getCache().update(oldService, newService, operation.getOpName());
		}
	}
	
	public void updateWorkflow(String workflow){
	    System.out.println("Workflow updated");
		compositeService.setWorkflow(workflow);
	}
	
	public void changeTimeout(int timeout){
		compositeService.getConfiguration().timeout=timeout;
	}
	
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
