package service.auxiliary;

public class AbstractMessage {
	private int id;
	private String address;
	private String type;
	
	public AbstractMessage(int id, String address, String type){
		this.id=id;
		this.address=address;
		this.type=type;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public int getId() {
	    return id;
	}
	
	public void setAddress(String address) {
	    this.address = address;
	}
	
	public String getAddress() {
	    return address;
	}
	
	public void setType(String type) {
	    this.type = type;
	}
	
	public String getType() {
	    return type;
	}
}
