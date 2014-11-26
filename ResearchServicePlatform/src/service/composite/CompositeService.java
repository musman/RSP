package service.composite;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import service.adaptation.Probe;
import service.auxiliary.CompositeServiceConfiguration;
import service.auxiliary.Configuration;
import service.auxiliary.Param;
import service.auxiliary.ServiceOperation;
import service.provider.AbstractService;
import service.workflow.AbstractQoSRequirement;
import service.workflow.WorkflowEngine;

public class CompositeService extends AbstractService {

    String workflow;
    Map<String, AbstractQoSRequirement> qosRequirements = new HashMap<String, AbstractQoSRequirement>();
    CompositeServiceBehavior behavior;
    Probe probe = null;
    public Configuration configuration;
    SDCache cache;

    protected SDCache getCache() {
	return cache;
    }

    private boolean readConfiguration() {
	try {
	    Annotation annotation = this.getClass().getAnnotation(CompositeServiceConfiguration.class);

	    if (annotation instanceof CompositeServiceConfiguration) {
		CompositeServiceConfiguration CSConfiguration = (CompositeServiceConfiguration) annotation;
		this.configuration = new Configuration(CSConfiguration.Thread(), CSConfiguration.MaxNoOfThreads(), CSConfiguration.QueueStrategy(), CSConfiguration.MaxQueueSize(),
			CSConfiguration.MaxResponseTime(), CSConfiguration.SDCacheMode(), CSConfiguration.SDCacheShared(), CSConfiguration.SDCacheTimeout(),
			CSConfiguration.SDCacheSize());
		// System.out.println("MaxNoOfThreads: " + configuration.maxNoOfThreads);
		return true;
	    }

	} catch (Exception e) {
	    e.printStackTrace();
	}
	return false;
    }

    public Configuration getConfiguration() {
	return configuration;
    }

    /**
     * @return the probe
     */
    public Probe getProbe() {
	return probe;
    }

    /**
     * @param probe
     *            the probe to set
     */
    public void setProbe(Probe probe) {
	this.probe = probe;
    }

    public CompositeService(String serviceName, String serviceEndpoint, String workflow) {
	super(serviceName, serviceEndpoint);
	this.workflow = workflow;
	readConfiguration();
    }

    public void addQosRequirement(String requirementName, AbstractQoSRequirement qosRequirement) {
	qosRequirements.put(requirementName, qosRequirement);
    }

    public Map<String, AbstractQoSRequirement> getQosRequirements() {
	return qosRequirements;
    }

    @ServiceOperation
    public List<String> getQosRequirementNames() {
	List<String> list = new LinkedList<String>();
	list.addAll(qosRequirements.keySet());
	return list;
    }

    @ServiceOperation
    public Object invokeCompositeService(String qosRequirementName, Object params[]) {
	AbstractQoSRequirement qosRequirement = qosRequirements.get(qosRequirementName);
	WorkflowEngine engine = new WorkflowEngine(this);

	if (probe != null)
	    probe.compositeServiceStarted(qosRequirementName, params);

	Object result = engine.executeWorkflow(workflow, qosRequirement, params);

	if (probe != null)
	    probe.compositeServiceEnded(result);

	return result;

    }

    public CompositeServiceBehavior getBehavior() {
	return behavior;
    }

    public void setBehavior(CompositeServiceBehavior behavior) {
	this.behavior = behavior;
    }

    @Override
    public Object invokeOperation(String opName, Param[] params) {
	// System.out.println(opName);
	for (Method operation : this.getClass().getMethods()) {
	    if (operation.getAnnotation(ServiceOperation.class) != null) {
		try {
		    if (operation.getName().equals(opName)) {
			Class<?>[] paramTypes = operation.getParameterTypes();
			int size = paramTypes.length;
			if (size == params.length) {
			    Object[] args = new Object[size];
			    for (int i = 0; i < size; i++) {
				args[i] = params[i].getValue();
			    }

			    return operation.invoke(this, args);
			}
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		    System.out.println("The operation name or params are not valid. Please check and send again!");
		}
	    }
	}
	return null;
    }

}
