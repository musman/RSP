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

	private String name;
	private int maxNumofInvocations;
	private String workflowPath;
	private Map<String,Object> variables=new HashMap<>();
	
	public InputProfile(){
		
	}
	
	public InputProfile(String name, int invocationNum, String workflowPath, Map<String,Object> variables){
		this.name=name;
		this.maxNumofInvocations=invocationNum;
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
	public int getMaxNumofInvocations() {
		return maxNumofInvocations;
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
