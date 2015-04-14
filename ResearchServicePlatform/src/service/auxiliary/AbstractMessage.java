package service.auxiliary;

/**
 * Definition of formated message
 * @author Yifan Ruan
 * @email  ry222ad@student.lnu.se
 */
public class AbstractMessage {
	private int id;
	private String endpoint;
	private String msgType;
	
	/**
	 * 
	 * @param id
	 * @param endpoint
	 * @param msgType
	 */
	public AbstractMessage(int id, String endpoint, String msgType){
		this.id=id;
		this.endpoint=endpoint;
		this.msgType=msgType;
	}
	
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
	    this.id = id;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getId() {
	    return id;
	}
	
	/**
	 * 
	 * @param address
	 */
	public void setEndpoint(String endpoint) {
	    this.endpoint = endpoint;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getEndpoint() {
	    return endpoint;
	}
	
	/**
	 * 
	 * @param msgType
	 */
	public void setType(String msgType) {
	    this.msgType = msgType;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getType() {
	    return msgType;
	}
}
