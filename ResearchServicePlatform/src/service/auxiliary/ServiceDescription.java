package service.auxiliary;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class ServiceDescription implements Serializable {

    public static final String RESPONSE_TIME = "ResponseTime";

    private int registerID = -1;
    private String serviceEndpoint;
    private String serviceType;
    private String serviceName;
    //private double serviceCost;

    private HashMap<String, Object> customProperties = new HashMap<String, Object>();
    private List<Operation> opList = new ArrayList<Operation>();

    /**
     * 
     * @param serviceName
     * @param serviceEndpoint
     * @param responseTime
     */
    public ServiceDescription(String serviceName, String serviceEndpoint, int responseTime) {
    	this.serviceName = serviceName;
    	this.serviceEndpoint = serviceEndpoint;
    	setResponseTime(responseTime);
    }
    
    /**
     * 
     * @return
     */
    public int getRegisterID() {
    	return registerID;
    }

    /**
     * 
     * @param registerID
     */
    public void setRegisterID(int registerID) {
    	this.registerID = registerID;
    }

    /**
     * 
     * @return
     */
    public String getServiceEndpoint() {
    	return serviceEndpoint;
    }

    /**
     * 
     * @param serviceEndpoint
     */
    public void setServiceEndpoint(String serviceEndpoint) {
    	this.serviceEndpoint = serviceEndpoint;
    }

    /**
     * 
     * @return
     */
    public String getServiceType() {
    	return serviceType;
    }

    /**
     * 
     * @param serviceType
     */
    public void setServiceType(String serviceType) {
    	this.serviceType = serviceType;
    }
    
    /**
     * 
     * @return
     */
    public String getServiceName() {
    	return serviceName;
    }

    /**
     * 
     * @param serviceName
     */
    public void setServiceName(String serviceName) {
    	this.serviceName = serviceName;
    }

    /**
     * 
     * @param serviceName
     * @param serviceEndpoint
     */
    public ServiceDescription(String serviceName, String serviceEndpoint) {
    	this.serviceName = serviceName;
    	this.serviceEndpoint = serviceEndpoint;
    }

    /**
     * 
     * @return
     */
    public List<Operation> getOperationList() {
    	return opList;
    }

    /**
     * 
     * @param opName
     * @return
     */
    public boolean containsOperation(String opName) {
    	for (int i = 0; i < opList.size(); i++) {
    		if (opList.get(i).getOpName().equals(opName))
    			return true;
    	}
    	return false;
    }

    /**
     * 
     * @param opList
     */
    public void setOperationList(List<Operation> opList) {
    	this.opList = opList;
    }
    
    /**
     * 
     * @param opName
     * @return
     */
    public Operation getOperation(String opName){
    	for(Operation op: opList){
    		if (op.getOpName().equals(opName)){
    			return op;
    		}
    	}
    	return null;
    }

    /**
     * 
     * @return
     */
    public HashMap<String, Object> getCustomProperties() {
    	return customProperties;
    }

    /**
     * Get response time if this service has custom property "RESPONSE_TIME"
     * @return
     */
    public int getResponseTime() {
    	if (customProperties.containsKey(RESPONSE_TIME))
    		return (int) customProperties.get(RESPONSE_TIME);
    	return 0;
    }

    /**
     * 
     * @param responseTime
     */
    public void setResponseTime(int responseTime) {
    	customProperties.put(RESPONSE_TIME, responseTime);
    }

    /**
     * 
     * @param opName
     * @return
     */
    public double getOperationCost(String opName){
    	return getOperation(opName).getOpCost();
    }
    /**
     *  
     * @param opName
     * @param cost
     */
    public void setOperationCost(String opName, double cost) {
    	getOperation(opName).setOpCost(cost);
    }
    
    /**
     * Clone a same Object
     */
    public Object clone() {
    	ObjectInputStream is = null;
    	ObjectOutputStream os = null;
    	try {
    		ByteArrayOutputStream bos = new ByteArrayOutputStream();
    		os = new ObjectOutputStream(bos);
    		os.writeObject(this);
    		ByteArrayInputStream bin = new ByteArrayInputStream(bos.toByteArray());
    		is = new ObjectInputStream(bin);
    		Object clone = is.readObject();
    		return clone;
    	} catch (Exception ex) {
    		ex.printStackTrace();
    	} finally {
    		try {
    			if (os != null)
    				os.close();
    			if (is != null)
    				is.close();
    		} catch (Exception ex) {
    		}
    	}
    	return null;
    }

    @Override
    public int hashCode() {
    	return serviceEndpoint.hashCode() + serviceType.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
		if (obj instanceof ServiceDescription) {
			ServiceDescription service = (ServiceDescription) obj;
			if (registerID == service.getRegisterID()
					&& serviceEndpoint.equals(service.getServiceEndpoint())
					&& serviceType.equals(service.getServiceType())) {

				for (int i = 0; i < opList.size(); i++) {
					if (!opList.get(i)
							.equals(service.getOperationList().get(i)))
						return false;
				}

				for (Map.Entry<String, Object> entry : customProperties
						.entrySet()) {
					String key = entry.getKey();
					Object value = entry.getValue();
					if (!service.getCustomProperties().containsKey(key))
						return false;
					else if (!service.getCustomProperties().get(key)
							.equals(value))
						return false;
				}
				return true;
			}
		}
		return false;
    }
}
