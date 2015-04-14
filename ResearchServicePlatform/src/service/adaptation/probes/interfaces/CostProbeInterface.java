
package service.adaptation.probes.interfaces;

public interface CostProbeInterface {

	/**
	 * Probe the cost of a specific service
	 * @param serviceName
	 * @param opName
	 * @param cost
	 */
    public void serviceCost(String serviceName, String opName, double cost);
}
