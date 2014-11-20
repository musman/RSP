package service.auxiliary;

public class Request extends AbstractMessage{
	private String serviceName;
	private String opName;
	private Param [] params;
	
	public Request(int messageID,String address, String serviceName, String opName, Object[] params){
		super(messageID,address,"request");
		this.serviceName=serviceName;
		this.opName=opName;
		this.params = new Param[params.length];
		for (int i = 0; i < params.length; i++) {
		    this.params[i] = new Param(params[i]);
		}
	}
	
	public Request(int messageID,String address,String serviceName, String opName){
		super(messageID,address,"request");
		this.serviceName=serviceName;
		this.opName=opName;
	}
	
	public void setServiceName(String serviceName) {
	    this.serviceName = serviceName;
	}
	
	public String getServiceName() {
	    return serviceName;
	}
	
	public void setOpName(String opName) {
	    this.opName = opName;
	}
	
	public String getOpName() {
	    return opName;
	}
	
	public void setParams(Param[] params) {
	    this.params = params;
	}
	
	public Param[] getParams() {
	    return params;
	}
}
