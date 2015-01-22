/**
 * 
 */
package profile;
import java.util.HashMap;
import java.util.Map;


/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class InputProfile {

	protected String name;
	protected int maxSteps;
	protected String workflowPath;
	protected Map<String,Object> variables=new HashMap<>();
	
	public InputProfile(){
		
	}
	
	public InputProfile(String name, int maxSteps, String workflowPath, Map<String,Object> variables){
		this.name=name;
		this.maxSteps=maxSteps;
		this.workflowPath=workflowPath;
		this.variables=variables;

	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the maxNumofInvocations
	 */
	public int getMaxSteps() {
		return maxSteps;
	}

	/**
	 * @return the workflowPath
	 */
	public String getWorkflowPath() {
		return workflowPath;
	}
	
	public Object getVariable(String variable){
		return this.variables.get(variable);
	}
}
