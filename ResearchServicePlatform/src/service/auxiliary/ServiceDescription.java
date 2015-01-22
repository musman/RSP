package service.auxiliary;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;


public class ServiceDescription implements Serializable{
    
    public static final String RESPONSE_TIME = "ResponseTime";
    
	private int registerID=-1;
	private String serviceEndpoint;
	private String serviceName;
	private double cost;
	
	private HashMap<String, Object> customProperties = new HashMap<String, Object>();
	private List<Operation> opList=new ArrayList<Operation>();
	
	/*
	@Override
	public Object clone(){
		ServiceDescription service=new ServiceDescription(this.serviceName,this.serviceEndpoint);
		service.registerID=this.registerID;
				
		for(int i=0;i<opList.size();i++){
			Operation op=opList.get(i);
			Operation operation=new Operation(op.getOpName(),op.getParamTypes(),op.getReturnType());
			service.getOperationList().add(operation);
		}
		
		for (Map.Entry<String, Object> entry : customProperties.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    service.customProperties.put(key, value);
		}
		
		return service;		
	}*/
	
	  public Object clone() {   
		    ObjectInputStream is = null; 
		    ObjectOutputStream os = null; 
		    try{ 
		      ByteArrayOutputStream bos = new 
		      ByteArrayOutputStream(); 
		      os = new ObjectOutputStream(bos);   
		      os.writeObject(this);    
		      ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray()); 
		      is = new ObjectInputStream(bin);   
		      Object clone = is.readObject();    
		      return clone; 
		    }catch (Exception ex){ex.printStackTrace();} 
		    finally { 
		      try { 
		        if(os != null) os.close(); 
		        if(is != null) is.close(); 
		      }catch(Exception ex){} 
		    } 
		    return null; 
		  } 

	   
    
	@Override
	public int hashCode(){
		return serviceEndpoint.hashCode()+serviceName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof ServiceDescription){
			ServiceDescription service=(ServiceDescription)obj;
			if(registerID==service.getRegisterID() && serviceEndpoint.equals(service.getServiceEndpoint())
					&& serviceName.equals(service.getServiceName())){
				
				for(int i=0;i<opList.size();i++){
					if(!opList.get(i).equals(service.getOperationList().get(i)))
						return false;
				}

				for (Map.Entry<String, Object> entry : customProperties.entrySet()) {
				    String key = entry.getKey();
				    Object value = entry.getValue();
				    if(!service.getCustomProperties().containsKey(key))
				    	return false; 
				    else if(!service.getCustomProperties().get(key).equals(value))
				    	return false;
				}

				return true;
			}
		}
		return false;
	}	
	
	
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
	
	public double getCost() {
	    return cost;
	}
	
	public void setCost(double cost) {
	    this.cost = cost;
	}
}
