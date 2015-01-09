package service.registry;

import java.util.*;

import service.atomic.AtomicService;
import service.auxiliary.Param;
import service.auxiliary.ServiceDescription;
import service.auxiliary.ServiceOperation;
import service.auxiliary.ServiceRegistryInterface;

public class ServiceRegistry extends AtomicService implements ServiceRegistryInterface{
    
    HashMap<Integer, ServiceDescription> serviceList = new HashMap<>();
    Map<String, Set<ServiceDescription>> services = new HashMap<String, Set<ServiceDescription>>(); // serviceName

    int serviceCount = -1;

    public ServiceRegistry() {
    	super(NAME, ADDRESS);
    }

    @ServiceOperation
    public int register(ServiceDescription serviceDescription) {
	
	serviceCount++;
	serviceDescription.setRegisterID(serviceCount);
	serviceList.put(serviceCount, serviceDescription);
	String name = serviceDescription.getServiceName();
	if (services.containsKey(name)) {
	    services.get(name).add(serviceDescription);
	} else {
	    Set<ServiceDescription> set = new HashSet<ServiceDescription>();
	    set.add(serviceDescription);
	    services.put(name, set);
	}
	
	System.out.println("Service " + serviceDescription.getServiceName() + " is registered.");
	
	return serviceCount;
    }

    @ServiceOperation
    public void unRegister(int registerID) {
	ServiceDescription service = serviceList.get(registerID);
	serviceList.remove(registerID);
	Set<ServiceDescription> set = services.get(service.getServiceName());
	set.remove(service);
	if (set.size() == 0)
	    services.remove(service.getServiceName());
	
	System.out.println("Service " + service.getServiceName() + " is registered.");
    }

    @ServiceOperation
    public List<ServiceDescription> lookup(String serviceName, String opName) {
	System.out.println("Lookup " + serviceName + "." + opName);
	List<ServiceDescription> list = new ArrayList<ServiceDescription>();
	if (services.containsKey(serviceName)) {
	    Set<ServiceDescription> set = services.get(serviceName);
	    Iterator<ServiceDescription> iter = set.iterator();
	    while (iter.hasNext()) {
		ServiceDescription server = iter.next();
		if (server.containsOperation(opName))
		    list.add(server);
	    }
	}
	return list;
    }
    
    @ServiceOperation
    public void update(ServiceDescription description){
    	ServiceDescription oldDescription=serviceList.remove(description.getRegisterID());
    	Set<ServiceDescription> descriptions=services.get(description.getServiceName());
    	descriptions.remove(oldDescription);
    	descriptions.add(description);
    	//System.out.println("Update service description");
    }
    
    public static void main(String[] args) {
    	ServiceRegistry serviceRegistry=new ServiceRegistry();
    	serviceRegistry.startService();
    }
}
