package service.auxiliary;

import java.util.*;

import org.antlr.stringtemplate.language.NewlineRef;

public class ServiceDescription {
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
			if(opList.get(i).opName.equals(opName))
				return true;
		}
		return false;
	}
	
	public Operation getOperation(String opName){
	    for(int i=0;i<opList.size();i++){
		if(opList.get(i).opName.equals(opName)){
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
		return (int)customProperties.get("ResponseTime");
	}

	public void setResponseTime(int responseTime) {
		customProperties.put("ResponseTime", responseTime);
	}
}
