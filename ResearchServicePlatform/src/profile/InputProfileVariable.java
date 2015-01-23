/**
 * 
 */
package profile;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class InputProfileVariable {

	String name;
	List<InputProfileValue> values=new ArrayList<>();
	
	public InputProfileVariable(String name, List<InputProfileValue> values){
		this.name=name;
		this.values=values;
	}
	
	public InputProfileVariable(String name){
		this.name=name;
	}
	
	public void addValue(InputProfileValue value){
		this.values.add(value);
	}
	
	public List<InputProfileValue> getValues(){
		return this.values;
	}
}
