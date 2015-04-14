package service.workflow;

import java.util.List;

import service.auxiliary.ServiceDescription;

public interface AbstractQoSRequirement {
	/**
	 * Select a best service from list of services
	 * @param serviceDescriptions
	 * @param opName
	 * @param params
	 * @return
	 */
    ServiceDescription applyQoSRequirement(List<ServiceDescription> serviceDescriptions, String opName, Object[] params);
}
