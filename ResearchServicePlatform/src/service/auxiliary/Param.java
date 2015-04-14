package service.auxiliary;

/**
 * Combination of type and value for a parameter
 * @author Yifan Ruan
 * @email  ry222ad@student.lnu.se
 */
public class Param{
	private Class<?> type;
	private Object value;
	
	/**
	 * 
	 * @param value
	 */
	public Param(Object value){
		if(value!=null){
			this.type=value.getClass();
			this.value=value;}
		else{
			this.type=null;
			this.value=null;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public Class<?> getType() {
	    return type;
	}
	
	/**
	 * 
	 * @return
	 */
	public Object getValue() {
	    return value;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void setValue(Object value) {
	    this.value = value;
	}
	
	/**
	 * 
	 * @param type
	 */
	public void setType(Class<?> type) {
	    this.type = type;
	}
	
	@Override
	public String toString() {
	    return value.toString();
	}
}
