package service.auxiliary;

public class Response extends AbstractMessage{

	private int requestID;
	private Class<?> returnType;
	private Object returnValue;
	
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

	public int getRequestID() {
	    return requestID;
	}

	public void setRequestID(int requestID) {
	    this.requestID = requestID;
	}

	public Class<?> getReturnType() {
	    return returnType;
	}

	public void setReturnType(Class<?> returnType) {
	    this.returnType = returnType;
	}

	public Object getReturnValue() {
	    return returnValue;
	}

	public void setReturnValue(Object returnValue) {
	    this.returnValue = returnValue;
	}
	
}
