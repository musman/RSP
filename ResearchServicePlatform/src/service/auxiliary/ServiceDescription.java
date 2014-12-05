package service.auxiliary;

import java.util.*;

public class ServiceDescription {
    
    public static final String RESPONSE_TIME = "ResponseTime";
    
	private int registerID=-1;
	private String serviceEndpoint;
	private String serviceName;
	
	private HashMap<String, Object> customProperties = new HashMap<String, Object>();
	private List<Operation> opList=new ArrayList<Operation>();
	
	public int getRegisterID() {
	    return registerID;
	}
	
	public void setRegisterID(int registerID) {
	    this.registerID = registerID;
	}
	
	public String getServiceEndpoint() {
	    return serviceEndpoint;
	}
	
	public void setServiceEndpoint(String serviceAddress) {
	    this.serviceEndpoint = serviceAddress;
	}
	
	public String getServiceName() {
	    return serviceName;
	}
	
	public void setServiceName(String serviceName) {
	    this.serviceName = serviceName;
	}
	
	public ServiceDescription(String serviceName, String serviceAddress){
	    this.serviceName=serviceName;
	    this.serviceEndpoint=serviceAddress;
	    
	}
	
	public ServiceDescription(String serviceName, String serviceAddress,int responseTime){
	    this.serviceName=serviceName;
	    this.serviceEndpoint=serviceAddress;
	    setResponseTime(responseTime);
	}
	
	public List<Operation> getOperationList() {
	    return opList;
	}

	public boolean containsOperation(String opName){
		for(int i=0;i<opList.size();i++){
			if(opList.get(i).getOpName().equals(opName))
				return true;
		}
		return false;
	}
	
	public Operation getOperation(String opName){
	    for(int i=0;i<opList.size();i++){
		if(opList.get(i).getOpName().equals(opName)){
		    return opList.get(i);
		}
	    }
	    return null;
	}
	
	public void setOperationList(List<Operation> opList) {
	    this.opList = opList;
	}
	
	public HashMap<String, Object> getCustomProperties() {
	    return customProperties;
	}

	public int getResponseTime() {
	    if (customProperties.containsKey(RESPONSE_TIME))
		return (int)customProperties.get(RESPONSE_TIME);
	    
	    return 0;
	}

	public void setResponseTime(int responseTime) {
		customProperties.put(RESPONSE_TIME, responseTime);
	}
}
