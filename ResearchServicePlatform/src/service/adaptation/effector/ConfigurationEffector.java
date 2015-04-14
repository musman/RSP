package service.adaptation.effector;

import service.composite.CompositeService;

public class ConfigurationEffector extends AbstractEffector {

    public ConfigurationEffector(CompositeService compositeService) {
    	super(compositeService);
    }

    /**
     * Change timout factor
     * 
     * @param timeout
     */
    public void changeTimeout(int timeout) {
    	compositeService.getConfiguration().timeout = timeout;
    }

    /**
     * Set the maximum retry attempts for sending messages
     * @param maxRetryAttempts
     */
    public void setMaxRetryAttempts(int maxRetryAttempts) {
    	compositeService.getConfiguration().maxRetryAttempts = maxRetryAttempts;
    }
}
