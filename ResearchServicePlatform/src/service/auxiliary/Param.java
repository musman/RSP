package service.auxiliary;

public class Param{
	private Class<?> type;
	private Object value;
	
	public Param(Object value){
		if(value!=null){
			this.type=value.getClass();
			this.value=value;}
		else{
			this.type=null;
			this.value=null;
		}
	}
	
	public Class<?> getType() {
	    return type;
	}
	
	public Object getValue() {
	    return value;
	}
	
	public void setValue(Object value) {
	    this.value = value;
	}
	
	public void setType(Class<?> type) {
	    this.type = type;
	}
	
	@Override
	public String toString() {
	    return value.toString();
	}
}
