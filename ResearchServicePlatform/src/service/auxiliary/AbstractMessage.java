package service.auxiliary;

public class AbstractMessage {
	private int id;
	private String endpoint;
	private String msgType;
	
	public AbstractMessage(int id, String endpoint, String msgType){
		this.id=id;
		this.endpoint=endpoint;
		this.msgType=msgType;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public int getId() {
	    return id;
	}
	
	public void setAddress(String address) {
	    this.endpoint = address;
	}
	
	public String getAddress() {
	    return endpoint;
	}
	
	public void setType(String msgType) {
	    this.msgType = msgType;
	}
	
	public String getType() {
	    return msgType;
	}
}
