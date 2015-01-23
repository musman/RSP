/**
 * 
 */
package profile;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class InputProfileValue {
	Object data;
	double ratio;
	
	public InputProfileValue(Object data, double ratio){
		this.data=data;
		this.ratio=ratio;
	}
	
	public Object getData(){
		return this.data;
	}
	
	public double getRatio(){
		return this.ratio;
	}
}
