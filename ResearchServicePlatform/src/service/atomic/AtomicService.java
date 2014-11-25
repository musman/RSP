package service.atomic;

import java.lang.reflect.Method;

import service.auxiliary.Param;
import service.auxiliary.ServiceOperation;
import service.provider.AbstractService;

public abstract class AtomicService extends AbstractService {
		
	private AtomicServiceBehavior serviceBehavior=null;
	
    public AtomicService(String serviceName, String serviceEndpoint, int responseTime) {
    	super(serviceName, serviceEndpoint,responseTime);
    }
    
    public AtomicService(String serviceName, String serviceEndpoint) {
    	super(serviceName, serviceEndpoint);
    }
    
    public AtomicServiceBehavior getServiceBehavior() {
		return serviceBehavior;
	}
    
    public void setServiceBehavior(AtomicServiceBehavior serviceBehavior) {
		this.serviceBehavior = serviceBehavior;
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
    			        			    
    			    boolean flag = serviceBehavior != null? serviceBehavior.preInvokeOperation(opName, args): true;
    			    Object result;
    			    if (flag){
    			    	result = operation.invoke(this, args);
    			    	Object mResult = serviceBehavior != null? serviceBehavior.postInvokeOperation(opName, result, args):result;
    			    	return mResult;
    			    }
    			    else{
    			    	return null;
    			    }
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
