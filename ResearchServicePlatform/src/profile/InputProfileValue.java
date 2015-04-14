/**
 * 
 */
package profile;

/**
 * Combination of data and related ratio
 * @author Yifan Ruan
 * @email  ry222ad@student.lnu.se
 */
public class InputProfileValue {
	
	private Object data;
	private double ratio;
	
	/** 
	 * Constructor
	 * @param data the data
	 * @param ratio the definition of how many times to execute with this data
	 */
	public InputProfileValue(Object data, double ratio){
		this.data=data;
		this.ratio=ratio;
	}
	
	/**
	 * Return data
	 * @return the data of the value
	 */
	public Object getData(){
		return this.data;
	}
	
	/**
	 * Return ration
	 * @return the ration of the value
	 */
	public double getRatio(){
		return this.ratio;
	}
}
