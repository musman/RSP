package service.atomic;

import service.provider.AbstractService;

public abstract class AtomicService extends AbstractService {
    public AtomicService(String serviceName, String serviceEndpoint) {
	super(serviceName, serviceEndpoint);
    }
}
