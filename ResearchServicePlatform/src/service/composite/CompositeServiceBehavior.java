package service.composite;

import java.util.List;
import service.auxiliary.ServiceDescription;

public interface CompositeServiceBehavior {
	
	/*
	onServicesSelected method returns the list as a reference. So list can be modified by implementation class. 
	This method will be called all the time whenever some services are selected.
	*/
	
	void onServicesSelected(List<ServiceDescription> serviceDescriptions);
	
	/*
	 * onTimeout function will be called only when a service is failed or not responding.  
	 * ServiceComposition will use alternative service returned by onTimeout method to solve the problem.
	 *  If again timeout happen this method will be called again.
	 */
	ServiceDescription onTimeout(ServiceDescription serviceSelected);
}
