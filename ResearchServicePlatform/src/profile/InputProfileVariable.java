/**
 * 
 */
package profile;
import java.util.ArrayList;
import java.util.List;

/**
 * Combination of name and related list of values
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class InputProfileVariable {

	String name;
	List<InputProfileValue> values=new ArrayList<>();
	
	/**
	 * 
	 * @param name
	 * @param values
	 */
	public InputProfileVariable(String name, List<InputProfileValue> values){
		this.name=name;
		this.values=values;
	}
	
	/**
	 * 
	 * @param name
	 */
	public InputProfileVariable(String name){
		this.name=name;
	}
	
	/**
	 * 
	 * @param value
	 */
	public void addValue(InputProfileValue value){
		this.values.add(value);
	}
	
	/**
	 * 
	 * @return
	 */
	public List<InputProfileValue> getValues(){
		return this.values;
	}
}
