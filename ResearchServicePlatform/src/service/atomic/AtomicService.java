package service.atomic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import service.auxiliary.AbstractService;
import service.auxiliary.AtomicServiceConfiguration;
import service.auxiliary.Configuration;
import service.auxiliary.OperationAborted;
import service.auxiliary.Param;
import service.auxiliary.ServiceOperation;

public abstract class AtomicService extends AbstractService {
		
	private ServiceProfile serviceProfile=null;
	
    public AtomicService(String serviceName, String serviceEndpoint, int responseTime) {
	super(serviceName, serviceEndpoint, responseTime);
    }

    public AtomicService(String serviceName, String serviceEndpoint) {
	super(serviceName, serviceEndpoint);
    }

    public ServiceProfile getServiceProfile() {
	return serviceProfile;
    }

    public void setServiceProfile(ServiceProfile serviceProfile) {
	this.serviceProfile = serviceProfile;
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

			    boolean flag = serviceProfile != null ? serviceProfile.preInvokeOperation(opName, args) : true;
			    Object result;
			    if (flag) {
				result = operation.invoke(this, args);
				Object mResult = serviceProfile != null ? serviceProfile.postInvokeOperation(opName, result, args) : result;
				return mResult;
			    } else {
				// return null;
				return new OperationAborted(null);
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

    @Override
    protected void readConfiguration() {
	try {
	    Annotation annotation = this.getClass().getAnnotation(AtomicServiceConfiguration.class);
	    if (annotation != null && annotation instanceof AtomicServiceConfiguration) {
		AtomicServiceConfiguration CSConfiguration = (AtomicServiceConfiguration) annotation;
		this.configuration = new Configuration(CSConfiguration.MultipeThreads(), CSConfiguration.MaxNoOfThreads(), CSConfiguration.MaxQueueSize());
	    } else
		this.configuration = new Configuration(false, 1, 0);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
