package service.auxiliary;

public class Response extends AbstractMessage{

	private int requestID;
	private Class<?> returnType;
	private Object returnValue;
	
	/**
	 * 
	 * @param messageID
	 * @param requestID
	 * @param address
	 * @param returnValue
	 */
	public Response(int messageID, int requestID,String address, Object returnValue){
		super(messageID,address,"response");
		this.setRequestID(requestID);
		if(returnValue!=null){
			this.setReturnType(returnValue.getClass());
			this.setReturnValue(returnValue);
		}
		else{
			this.setReturnType(null);
			this.setReturnValue(null);
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getRequestID() {
	    return requestID;
	}

	/**
	 * 
	 * @param requestID
	 */
	public void setRequestID(int requestID) {
	    this.requestID = requestID;
	}

	/**
	 * 
	 * @return
	 */
	public Class<?> getReturnType() {
	    return returnType;
	}

	/**
	 * 
	 * @param returnType
	 */
	public void setReturnType(Class<?> returnType) {
	    this.returnType = returnType;
	}

	/**
	 * 
	 * @return
	 */
	public Object getReturnValue() {
	    return returnValue;
	}

	/**
	 * 
	 * @param returnValue
	 */
	public void setReturnValue(Object returnValue) {
	    this.returnValue = returnValue;
	}
	
}
