package service.adaptation.effector;

import java.util.List;

import service.auxiliary.Operation;
import service.auxiliary.ServiceDescription;
import service.composite.CompositeService;

public class CacheEffector extends AbstractEffector {

    public CacheEffector(CompositeService compositeService) {
	super(compositeService);
    }

    /**
     * Remove service from cache
     * @param service
     */
    public void removeService(ServiceDescription service) {
	    compositeService.getCache().remove(service);
    }

    /**
     * Remove service from cache with service description and operation name
     * @param service
     * @param opName
     */
    public void removeService(ServiceDescription service, String opName) {
	compositeService.getCache().remove(service, opName);
    }

    /**
     * Refresh the cache; all services will be removed.
     */
    public void refreshCache() {
	compositeService.getCache().refresh();
    }

    /**
     * Remove all the services who has 
     * @param service
     * @param opName
     * @return
     */
    public List<ServiceDescription> refreshCache(ServiceDescription service, String opName) {
	removeService(service, opName);
	return compositeService.lookupService(service.getServiceType(), opName);
    }

    /**
     * Update service description
     * @param oldService
     * @param newService
     */
    public void updateServiceDescription(ServiceDescription oldService, ServiceDescription newService) {
	if (oldService.getRegisterID() == newService.getRegisterID()) {
	    for (Operation operation : oldService.getOperationList())
		compositeService.getCache().update(oldService, newService, operation.getOpName());
	}
    }
}
