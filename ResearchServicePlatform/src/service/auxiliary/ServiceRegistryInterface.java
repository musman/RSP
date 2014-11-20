package service.auxiliary;

import java.util.List;

public interface ServiceRegistryInterface {
    public static final String NAME = "ServiceRegistry";
    public static final String ADDRESS = "se.lnu.service.registry";
    
    public int register(ServiceDescription serviceDescription);
    public void unRegister(int registerId);
    public List<ServiceDescription> lookup(String serviceName, String opName);
}
