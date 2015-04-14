package service.workflow;

import java.util.List;

import service.auxiliary.ServiceDescription;

public interface AbstractQoSRequirement {
	/**
	 * Select a best service from list of services
	 * @param serviceDescriptions  list of service descriptions for selecting
	 * @param opName  the operation name
	 * @param params the parameters for the operation
	 * @return the best service
	 */
    ServiceDescription applyQoSRequirement(List<ServiceDescription> serviceDescriptions, String opName, Object[] params);
}
