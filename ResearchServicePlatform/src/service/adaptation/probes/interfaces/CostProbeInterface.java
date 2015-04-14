
package service.adaptation.probes.interfaces;

public interface CostProbeInterface {

	/**
	 * Probe the cost of a specific service
	 * @param serviceName the invoked service name
	 * @param opName   the invoked operation name
	 * @param cost   the invoked operation cost
	 */
    public void serviceCost(String serviceName, String opName, double cost);
}
