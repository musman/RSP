package service.provider;

import service.provider.activemq.ActiveMQProvider;
import service.provider.rsp.RSPServiceProvider;

/**
 * This class helps to choose a service provider.
 * 
 * @author M. Usman Iftikhar & Yifan Ruan
 */
public class ServiceProviderFactory {
    
    /**
     * This method helps to choose a service provider from list of available service providers.
     * @return ServiceProvider
     */
    public static ServiceProvider createServiceProvider() {
    	//return new ActiveMQProvider();
	return new RSPServiceProvider();
    }
}
