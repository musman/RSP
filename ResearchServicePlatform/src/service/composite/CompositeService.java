package service.composite;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import service.auxiliary.ServiceOperation;
import service.provider.AbstractService;
import service.workflow.AbstractQoSRequirement;
import service.workflow.WorkflowEngine;

public class CompositeService extends AbstractService{

    String workflow;
    Map<String, AbstractQoSRequirement> qosRequirements = new HashMap<String, AbstractQoSRequirement>();
    
    public CompositeService(String serviceName, String serviceEndpoint, String workflow) {
	super(serviceName, serviceEndpoint);
		this.workflow=workflow;
    }

    
    public void addQosRequirement(String requirementName, AbstractQoSRequirement qosRequirement){
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
    public Object invokeCompositeService(String qosRequirementName, Object params[]){
	AbstractQoSRequirement qosRequirement = qosRequirements.get(qosRequirementName);
	WorkflowEngine engine = new WorkflowEngine(this);
	return engine.executeWorkflow(workflow, qosRequirement, params);
    }
    
}
