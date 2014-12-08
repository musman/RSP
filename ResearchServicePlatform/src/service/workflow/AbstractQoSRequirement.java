package service.workflow;

import java.util.List;

import service.auxiliary.ServiceDescription;

public interface AbstractQoSRequirement {
    ServiceDescription applyQoSRequirement(List<ServiceDescription> serviceDescriptions, String opName, Object[] params);
}
