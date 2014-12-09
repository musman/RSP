/**
 * 
 */
package service.composite;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

import com.thoughtworks.xstream.XStream;

import service.auxiliary.ServiceDescription;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class SDCache{
    Map<Description, List<ServiceDescription>> caches = new ConcurrentHashMap<Description, List<ServiceDescription>>();
    int maxCacheSize;
    int refreshPeriod=10000;
    Timer timer = null;    
    

    
	public int getRefreshPeriod() {
		return refreshPeriod;
	}


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


	public int getMaxCacheSize() {
		return maxCacheSize;
	}


	public void setMaxCacheSize(int maxCacheSize) {
		this.maxCacheSize = maxCacheSize;
	}

	public boolean add(String serviceName,String opName,List<ServiceDescription> serviceDescriptions){
		if(maxCacheSize<=caches.size() && maxCacheSize>0)
			return false;
		List<ServiceDescription> services=new ArrayList<>();
		for(ServiceDescription serviceDescription : serviceDescriptions)
			services.add((ServiceDescription)serviceDescription.clone());
		
		caches.put(new Description(serviceName,opName),services);
    	return true;
    }
    
    public List<ServiceDescription> get(String serviceName,String opName){
    	Description description=new Description(serviceName,opName);
    	if(caches.containsKey(description)){
    		List<ServiceDescription> services=new ArrayList<>();
    		for(ServiceDescription serviceDescription : caches.get(description)){
    			//System.out.println(serviceDescription);
				services.add((ServiceDescription)serviceDescription.clone());
    		}
    		return services;
    	} 	
    	return null;
    }
    
    public boolean remove(String serviceName,String opName){
    	Description description=new Description(serviceName,opName);
    	if(caches.containsKey(description)){
    		caches.remove(new Description(serviceName,opName));
    		return true;
    	}
    	return false;
    }
    
    public boolean remove(String serviceName,String opName,ServiceDescription service){
    	Description description=new Description(serviceName,opName);
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
    
    public boolean remove(ServiceDescription service, String opName){
    	return this.remove(service.getServiceName(), opName,service);
    }
    
    public int size(){
    	return caches.size();
    }
    
    public boolean containsCache(String serviceName,String opName){
    	return caches.containsKey(new Description(serviceName,opName));
    }
    
    public void refresh(){
        caches.clear();
    }

    public boolean update(ServiceDescription oldService, ServiceDescription newService, String opName){
    	Description description=new Description(oldService.getServiceName(),opName);
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
    
    class Description{
		String serviceName;
    	String opName;
    	
		public Description(String serviceName, String opName) {
			this.serviceName = serviceName;
			this.opName = opName;
		}
		
		@Override
		public int hashCode(){
			return serviceName.hashCode()+opName.hashCode();
		}
		
		@Override
		public boolean equals(Object obj){
			if(obj instanceof Description){
				Description description=(Description)obj;
				if(description.serviceName.equals(serviceName) && description.opName.equals(opName))
					return true;
			}
			return false;
		}
    }
}
