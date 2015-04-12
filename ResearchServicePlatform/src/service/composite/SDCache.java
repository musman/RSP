/**
 * 
 */
package service.composite;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

import service.auxiliary.Operation;
import service.auxiliary.ServiceDescription;

/**
 * Cache for available services
 * @author Yifan Ruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class SDCache{
	
    Map<Description, List<ServiceDescription>> caches = new ConcurrentHashMap<Description, List<ServiceDescription>>();
    int maxCacheSize;
    int refreshPeriod=10000;         
    Timer timer = null;    
    
    /**
     * 
     * @return
     */
	public int getRefreshPeriod() {
		return refreshPeriod;
	}


	/**
	 * 
	 * @param refreshPeriod
	 * @return
	 */
	public boolean setRefreshPeriod(int refreshPeriod) {
		this.refreshPeriod = refreshPeriod;
		if (timer != null){
			timer.cancel();
			timer.purge();
			timer = null;
		}
		
		if(refreshPeriod>0){
			timer = new Timer();
			timer.scheduleAtFixedRate(new TimerTask() {
	      	  	public void run() {
	      	  		refresh();
	      	  	}
			}, refreshPeriod, refreshPeriod);
			return true;
		}
		return false;
	}

	/**
	 * Return available services
	 * @return
	 */
	public Set<String> getServices(){
		Set<String> services=new HashSet<>();
		for (List<ServiceDescription> serviceList : caches.values()) {
			for(ServiceDescription service:serviceList)
				services.add(service.getServiceName());
		}
		return services;
	}

	/**
	 * 
	 * @return
	 */
	public int getMaxCacheSize() {
		return maxCacheSize;
	}

	/**
	 * 
	 * @param maxCacheSize
	 */
	public void setMaxCacheSize(int maxCacheSize) {
		this.maxCacheSize = maxCacheSize;
	}

	/**
	 * Add new services
	 * @param serviceType
	 * @param opName
	 * @param serviceDescriptions
	 * @return
	 */
	public boolean add(String serviceType,String opName,List<ServiceDescription> serviceDescriptions){
		if(maxCacheSize<=caches.size() && maxCacheSize>0)
			return false;
		List<ServiceDescription> services=new ArrayList<>();
		for(ServiceDescription serviceDescription : serviceDescriptions)
			services.add((ServiceDescription)serviceDescription.clone());
		
		caches.put(new Description(serviceType,opName),services);
    	return true;
    }
    
	/**
	 * Get services with specific type and operation
	 * @param serviceType
	 * @param opName
	 * @return
	 */
    public List<ServiceDescription> get(String serviceType,String opName){
    	Description description=new Description(serviceType,opName);
    	if(caches.containsKey(description)){
    		List<ServiceDescription> services=new ArrayList<>();
    		for(ServiceDescription serviceDescription : caches.get(description)){
    			//System.out.println(serviceDescription);
				services.add((ServiceDescription)serviceDescription);
    		}
    		return services;
    	} 	
    	return null;
    }
    
    /**
     * 
     * @param service
     */
    public void remove(ServiceDescription service) {
    	for (Operation operation : service.getOperationList())
    		remove(service, operation.getOpName());
    }
    
    /**
     * 
     * @param serviceType
     * @param opName
     * @return
     */
    public boolean remove(String serviceType,String opName){
    	Description description=new Description(serviceType,opName);
    	if(caches.containsKey(description)){
    		caches.remove(new Description(serviceType,opName));
    		return true;
    	}
    	return false;
    }
    
    /**
     * 
     * @param serviceType
     * @param opName
     * @param service
     * @return
     */
    public boolean remove(String serviceType,String opName,ServiceDescription service){
    	Description description=new Description(serviceType,opName);
    	if(caches.containsKey(description)){
    		List<ServiceDescription> services=caches.get(description);
    		for(ServiceDescription s:services){
    			if(s.equals(service)){
    				return services.remove(s);
    			}
    		}
    	}
    	return false;
    }
    
    /**
     * 
     * @param service
     * @param opName
     * @return
     */
    public boolean remove(ServiceDescription service, String opName){
    	return this.remove(service.getServiceType(), opName,service);
    }
    
    /**
     * 
     * @return
     */
    public int size(){
    	return caches.size();
    }
    
    /**
     * Check cache has specific service 
     * @param serviceType
     * @param opName
     * @return
     */
    public boolean containsCache(String serviceType,String opName){
	Description description = new Description(serviceType, opName);
    	if (caches.containsKey(description))
    	{
    	    List<ServiceDescription> descriptions = caches.get(description);
    	    return descriptions!= null && descriptions.size() > 0;
    	}
    	return false;
    }
    
    /**
     * 
     */
    public void refresh(){
        caches.clear();
    }

    /**
     * 
     * @param oldService
     * @param newService
     * @param opName
     * @return
     */
    public boolean update(ServiceDescription oldService, ServiceDescription newService, String opName){
    	Description description=new Description(oldService.getServiceType(),opName);
    	if(caches.containsKey(description)){
    		List<ServiceDescription> services=caches.get(description);
    		if(services.contains(oldService)){
    			//System.out.println(services.indexOf(oldService));
    			services.set(services.indexOf(oldService),newService);
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
     * 
     * @param registerId
     * @return
     */
    public ServiceDescription getServiceDescription(int registerId){
    	for (List<ServiceDescription> serviceList : caches.values()) {
    		for(ServiceDescription service:serviceList){
    			if (service.getRegisterID() == registerId)
    				return service;
    		}
    	}	
    	return null;
    }
    
    /**
     * 
     * @param registerId
     */
    public void remove(int registerId) {
    	ServiceDescription serviceDescription = getServiceDescription(registerId);
    	if (serviceDescription != null){
    		remove(serviceDescription);
    	}
    	else{
    		System.err.println("Service not found with registeration Id:" + registerId);
    		System.err.println("Service cannot be removed.");
    	}
    }
    
    class Description{
		String serviceType;
    	String opName;
    	
		public Description(String serviceType, String opName) {
			this.serviceType = serviceType;
			this.opName = opName;
		}
		
		@Override
		public int hashCode(){
			return serviceType.hashCode()+opName.hashCode();
		}
		
		@Override
		public boolean equals(Object obj){
			if(obj instanceof Description){
				Description description=(Description)obj;
				if(description.serviceType.equals(serviceType) && description.opName.equals(opName))
					return true;
			}
			return false;
		}
		
		@Override
		public String toString(){
		    return serviceType + "." + opName;
		}
    }
}
