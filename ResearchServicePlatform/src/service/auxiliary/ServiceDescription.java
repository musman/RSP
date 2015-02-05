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

    public String getServiceType() {
	return serviceType;
    }

    public void setServiceType(String serviceType) {
	this.serviceType = serviceType;
    }
    
    public String getServiceName() {
	return serviceName;
    }

    public void setServiceName(String serviceName) {
	this.serviceName = serviceName;
    }

    public ServiceDescription(String serviceName, String serviceAddress) {
	this.serviceName = serviceName;
	this.serviceEndpoint = serviceAddress;

    }

    public ServiceDescription(String serviceName, String serviceAddress, int responseTime) {
    this.serviceName = serviceName;
	this.serviceEndpoint = serviceAddress;
	setResponseTime(responseTime);
    }

    public List<Operation> getOperationList() {
	return opList;
    }

    public boolean containsOperation(String opName) {
	for (int i = 0; i < opList.size(); i++) {
	    if (opList.get(i).getOpName().equals(opName))
		return true;
	}
	return false;
    }

    public void setOperationList(List<Operation> opList) {
	this.opList = opList;
    }
    
    public Operation getOperation(String opName){
	for(Operation op: opList){
	    if (op.getOpName().equals(opName)){
		return op;
	    }
	}
	return null;
    }

    public HashMap<String, Object> getCustomProperties() {
	return customProperties;
    }

    public int getResponseTime() {
	if (customProperties.containsKey(RESPONSE_TIME))
	    return (int) customProperties.get(RESPONSE_TIME);

	return 0;
    }

    public void setResponseTime(int responseTime) {
	customProperties.put(RESPONSE_TIME, responseTime);
    }

    public double getOperationCost(String opName){
	return getOperation(opName).getOpCost();
    }
    
/*    public void setServiceCost(double serviceCost) {
	this.serviceCost = serviceCost;
    }

    public double getServiceCost() {
	return serviceCost;
    }
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
	    if (registerID == service.getRegisterID() && serviceEndpoint.equals(service.getServiceEndpoint()) && serviceType.equals(service.getServiceType())) {

		for (int i = 0; i < opList.size(); i++) {
		    if (!opList.get(i).equals(service.getOperationList().get(i)))
			return false;
		}

		for (Map.Entry<String, Object> entry : customProperties.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    if (!service.getCustomProperties().containsKey(key))
			return false;
		    else if (!service.getCustomProperties().get(key).equals(value))
			return false;
		}

		return true;
	    }
	}
	return false;
    }

    public void setOperationCost(String opName, double cost) {
	getOperation(opName).setOpCost(cost);
    }
}
