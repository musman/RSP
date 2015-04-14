package service.adaptation.effector;

import service.auxiliary.ServiceDescription;
import service.composite.CompositeService;

public class WorkflowEffector extends AbstractEffector {

    private CacheEffector cacheEffector;
    
    /**
     * 
     * @param compositeService
     */
    public WorkflowEffector(CompositeService compositeService) {
    	super(compositeService);
    	cacheEffector = new CacheEffector(compositeService);
    }

    /**
     * Update the workflow
     * @param workflow
     */
    public void updateWorkflow(String workflow) {
    	compositeService.setWorkflow(workflow);
    }
    
    /**
     * Remove the service from workflow cache
     * @param sd
     */
    public void removeService(ServiceDescription sd){
    	cacheEffector.removeService(sd);
    }
    
    /**
     * Remove the service from workflow cache using serviceId
     * @param serviceId
     */
    public void removeService(int serviceId){
    	cacheEffector.removeService(serviceId);
    }
    
    /**
     * Clear the workflow cache
     */
    public void refreshAllServices(){
    	cacheEffector.refreshCache();
    }

    /**
     * Clear the workflow cache
     * @param serviceType
     * @param opName
     */
    public void refreshAllServices(String serviceType, String opName){
    	cacheEffector.getAllServices(serviceType, opName);
    }


    /**
     * Update the service description in the workflow cache
     * @param oldService
     * @param newService
     */
    public void updateServiceDescription(ServiceDescription oldService, ServiceDescription newService) {
    	cacheEffector.updateServiceDescription(oldService, newService);
    }
}
