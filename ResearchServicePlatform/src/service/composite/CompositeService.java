package service.composite;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import service.auxiliary.Param;
import service.auxiliary.ServiceOperation;
import service.provider.AbstractService;
import service.workflow.AbstractQoSRequirement;
import service.workflow.WorkflowEngine;

public class CompositeService extends AbstractService{

    String workflow;
    Map<String, AbstractQoSRequirement> qosRequirements = new HashMap<String, AbstractQoSRequirement>();
    CompositeServiceBehavior behavior;
    
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


	public CompositeServiceBehavior getBehavior() {
		return behavior;
	}


	public void setBehavior(CompositeServiceBehavior behavior) {
		this.behavior = behavior;
	}



	@Override
    public Object invokeOperation(String opName, Param[] params){
    	//System.out.println(opName);
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
