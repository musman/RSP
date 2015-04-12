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
	Object data;
	double ratio;
	
	/**
	 * 
	 * @param data
	 * @param ratio
	 */
	public InputProfileValue(Object data, double ratio){
		this.data=data;
		this.ratio=ratio;
	}
	
	/**
	 * 
	 * @return
	 */
	public Object getData(){
		return this.data;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getRatio(){
		return this.ratio;
	}
}
