package service.registry;

import java.util.*;

import service.atomic.AtomicService;
import service.auxiliary.ServiceDescription;
import service.auxiliary.ServiceOperation;
import service.auxiliary.ServiceRegistryInterface;

public class ServiceRegistry extends AtomicService implements ServiceRegistryInterface{
    
    HashMap<Integer, ServiceDescription> serviceList = new HashMap<>();
    Map<String, Set<ServiceDescription>> services = new HashMap<String, Set<ServiceDescription>>(); // serviceName

    int serviceCount = 0;

    public ServiceRegistry() {
    	super(NAME, ADDRESS);
    }

    @ServiceOperation
    public int register(ServiceDescription serviceDescription) {
	
	serviceCount++;
	serviceDescription.setRegisterID(serviceCount);
	serviceList.put(serviceCount, serviceDescription);
	String type = serviceDescription.getServiceType();
	if (services.containsKey(type)) {
	    services.get(type).add(serviceDescription);
	} else {
	    Set<ServiceDescription> set = new HashSet<ServiceDescription>();
	    set.add(serviceDescription);
	    services.put(type, set);
	}
	
	System.out.println("Service " + serviceDescription.getServiceType() + " is registered.");
	
	return serviceCount;
    }

    @ServiceOperation
    public void unRegister(int registerID) {
	ServiceDescription service = serviceList.get(registerID);
	serviceList.remove(registerID);
	Set<ServiceDescription> set = services.get(service.getServiceType());
	set.remove(service);
	if (set.size() == 0)
	    services.remove(service.getServiceType());
	
	System.out.println("Service " + service.getServiceType() + " is registered.");
    }

    @ServiceOperation
    public List<ServiceDescription> lookup(String serviceType, String opName) {
	System.out.println("Lookup " + serviceType + "." + opName);
	List<ServiceDescription> list = new ArrayList<ServiceDescription>();
	if (services.containsKey(serviceType)) {
	    Set<ServiceDescription> set = services.get(serviceType);
	    Iterator<ServiceDescription> iter = set.iterator();
	    while (iter.hasNext()) {
		ServiceDescription service = iter.next();
		if (service.containsOperation(opName))
		    list.add(service);
	    }
	}
	return list;
    }
    
    /**
     * Update service description
     * @param description
     */
    @ServiceOperation
    public void update(ServiceDescription description){
    	ServiceDescription oldDescription=serviceList.remove(description.getRegisterID());
    	Set<ServiceDescription> descriptions=services.get(description.getServiceType());
    	descriptions.remove(oldDescription);
    	descriptions.add(description);
    	//System.out.println("Update service description");
    }
    
    public static void main(String[] args) {
    	ServiceRegistry serviceRegistry=new ServiceRegistry();
    	serviceRegistry.startService();
    }
}
