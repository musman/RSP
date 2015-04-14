package service.auxiliary;

public class Request extends AbstractMessage{
	private String serviceName;
	private String opName;
	private Param [] params;
	
	/**
	 * 
	 * @param messageID
	 * @param address
	 * @param serviceName
	 * @param opName
	 * @param params
	 */
	public Request(int messageID,String address, String serviceName, String opName, Object[] params){
		super(messageID,address,"request");
		this.serviceName=serviceName;
		this.opName=opName;
		this.params = new Param[params.length];
		for (int i = 0; i < params.length; i++) {
		    this.params[i] = new Param(params[i]);
		}
	}
	
	/**
	 * 
	 * @param messageID
	 * @param address
	 * @param serviceName
	 * @param opName
	 */
	public Request(int messageID,String address,String serviceName, String opName){
		super(messageID,address,"request");
		this.serviceName=serviceName;
		this.opName=opName;
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
	 * @return
	 */
	public String getServiceName() {
	    return serviceName;
	}
	
	/**
	 * 
	 * @param opName
	 */
	public void setOpName(String opName) {
	    this.opName = opName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getOpName() {
	    return opName;
	}
	
	/**
	 * 
	 * @param params
	 */
	public void setParams(Param[] params) {
	    this.params = params;
	}
	
	/**
	 * 
	 * @return
	 */
	public Param[] getParams() {
	    return params;
	}
}
