/**
 * 
 */
package profile;
import java.util.ArrayList;
import java.util.List;

/**
 * Profile for how to execute the workflow
 * @author Yifan Ruan
 * @email  ry222ad@student.lnu.se
 */
public class InputProfile {
	protected int maxSteps;
	protected String qosRequirement;
	protected List<InputProfileVariable> variables=new ArrayList<>();
		
	/**
	 * 
	 */
	public InputProfile(){
	}
	
	/**
	 * 
	 * @param maxSteps  steps for invoking the workflow
	 * @param qosRequirement  
	 * @param variables   specific variables
	 */
	public InputProfile(int maxSteps, String qosRequirement,List<InputProfileVariable> variables){
		this.maxSteps=maxSteps;
		this.qosRequirement=qosRequirement;
		this.variables=variables;
	}

	/**
	 * 
	 * @return 
	 */
	public int getMaxSteps() {
		return maxSteps;
	}

	/**
	 * 
	 * @return
	 */
	public String getQosRequirement() {
		return qosRequirement;
	}
	
	/**
	 * 
	 * @param variable
	 */
	public void addVariable(InputProfileVariable variable){
		this.variables.add(variable);
	}

	/**
	 * 
	 * @param variableName
	 * @return
	 */
	public InputProfileVariable getVariable(String variableName){
		for(InputProfileVariable variable:variables){
			if(variable.name.equals(variableName))
				return variable;
		}
		return null;
	}

}
