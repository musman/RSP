package service.composite;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import service.adaptation.effector.AbstractEffector;
import service.adaptation.effector.CacheEffector;
import service.adaptation.effector.ConfigurationEffector;
import service.adaptation.effector.WorkflowEffector;
import service.adaptation.probes.AbstractProbe;
import service.adaptation.probes.CostProbe;
import service.adaptation.probes.ServiceInvocationProbe;
import service.adaptation.probes.WorkflowProbe;
import service.auxiliary.CompositeServiceConfiguration;
import service.auxiliary.Configuration;
import service.auxiliary.Param;
import service.auxiliary.ServiceDescription;
import service.auxiliary.ServiceOperation;
import service.provider.AbstractService;
import service.registry.ServiceRegistry;
import service.workflow.AbstractQoSRequirement;
import service.workflow.WorkflowEngine;

public class CompositeService extends AbstractService {

    String workflow;

    // Initializing probes
    CostProbe costProbe = new CostProbe();
    ServiceInvocationProbe serviceInvocationProbe = new ServiceInvocationProbe();
    WorkflowProbe workflowProbe = new WorkflowProbe();

    // Initializing effectors
   // CacheEffector cacheEffector = new CacheEffector(this);
    ConfigurationEffector configurationEffector = new ConfigurationEffector(this);
    //WorkflowEffector workflowEffector = new WorkflowEffector(this);

    /**
     * @param workflow
     *            the workflow to set
     */
    public void setWorkflow(String workflow) {
	this.workflow = workflow;
    }

    Map<String, AbstractQoSRequirement> qosRequirements = new HashMap<String, AbstractQoSRequirement>();

    SDCache cache;

    public SDCache getCache() {
	return cache;
    }

    @Override
    protected void readConfiguration() {
	try {
	    Annotation annotation = this.getClass().getAnnotation(CompositeServiceConfiguration.class);
	    if (annotation != null && annotation instanceof CompositeServiceConfiguration) {
		CompositeServiceConfiguration CSConfiguration = (CompositeServiceConfiguration) annotation;
		this.configuration = new Configuration(CSConfiguration.MultipeThreads(), CSConfiguration.MaxNoOfThreads(), CSConfiguration.MaxQueueSize(),
			CSConfiguration.Timeout(), CSConfiguration.IgnoreTimeOutError(), CSConfiguration.MaxRetryAttempts(), CSConfiguration.SDCacheMode(),
			CSConfiguration.SDCacheShared(), CSConfiguration.SDCacheTimeout(), CSConfiguration.SDCacheSize());
	    } else {
		this.configuration = new Configuration(false, 1, 0, 10, false, 1, false, false, 0, 0);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public CompositeService(String serviceName, String serviceEndpoint, String workflow) {
	super(serviceName, serviceEndpoint);
	this.workflow = workflow;

	if (this.configuration.SDCacheMode) {
	    cache = new SDCache();
	}
    }

    public void addQosRequirement(String requirementName, AbstractQoSRequirement qosRequirement) {
	qosRequirements.put(requirementName, qosRequirement);
    }

    public Map<String, AbstractQoSRequirement> getQosRequirements() {
	return qosRequirements;
    }

    /**
     * Returns list of QoS names added in to the composite service
     * 
     * @return
     */
    @ServiceOperation
    public List<String> getQosRequirementNames() {
	List<String> list = new LinkedList<String>();
	list.addAll(qosRequirements.keySet());
	return list;
    }

    @ServiceOperation
    public Object invokeCompositeService(String qosRequirementName, Object params[]) {
	AbstractQoSRequirement qosRequirement = qosRequirements.get(qosRequirementName);
	SDCache sdCache = cache == null ? new SDCache() : cache;
	WorkflowEngine engine = new WorkflowEngine(this, sdCache);

	workflowProbe.workflowStarted(qosRequirementName, params);

	Object result = engine.executeWorkflow(workflow, qosRequirement, params);

	workflowProbe.workflowEnded(result, qosRequirementName, params);

	return result;

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

    /*
     * Search through service registry to get the list of service descriptions
     */
    public List<ServiceDescription> lookupService(String serviceType, String opName) {

	List<ServiceDescription> serviceDescriptions = cache.get(serviceType, opName);
	if (serviceDescriptions == null) {
	    serviceDescriptions = (List<ServiceDescription>) this.sendRequest(ServiceRegistry.NAME, ServiceRegistry.ADDRESS, true, "lookup", serviceType, opName);
	    cache.add(serviceType, opName, serviceDescriptions);
	}

	return serviceDescriptions;
    }
    
    public CostProbe getCostProbe() {
	return costProbe;
    }
    
//    public WorkflowProbe getServiceInvocationProbe() {
//	return workflowProbe;
//    }
    
    public WorkflowProbe getWorkflowProbe() {
	return workflowProbe;
    }
    
    //public WorkflowEffector getWorkflowEffector() {
	//return workflowEffector;
    //}
    
    //public CacheEffector getCacheEffector() {
	//return cacheEffector;
    //}
    
    public ConfigurationEffector getConfigurationEffector() {
	return configurationEffector;
    }

    /**
     * Returns true if composite service cache contains instances of the specific service type with operation name
     * @param serviceType
     * @param opName
     * @return
     */
    public boolean containServices(String serviceType, String opName) {
	return cache.containsCache(serviceType, opName);
    }
    
    /**
     * Get service description using registeration ID of the service from cache
     * @param serviceId
     * @return
     */
    public ServiceDescription getServiceDescription(int registerId){
	return cache.getServiceDescription(registerId);
    }
}
