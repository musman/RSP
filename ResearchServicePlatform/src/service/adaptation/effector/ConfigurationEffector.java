package service.adaptation.effector;

import service.composite.CompositeService;

public class ConfigurationEffector extends AbstractEffector {

    public ConfigurationEffector(CompositeService compositeService) {
	super(compositeService);
    }

    /**
     * Change timout factor
     * @param timeout
     */
    public void changeTimeout(int timeout) {
	compositeService.getConfiguration().timeout = timeout;
    }

}
