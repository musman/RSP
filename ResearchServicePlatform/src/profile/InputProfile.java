/**
 * 
 */
package profile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.workflow.AbstractQoSRequirement;


/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class InputProfile {

	//protected String name;
	protected int maxSteps;
	//protected String workflowPath;
	protected String qosRequirement;
	protected List<InputProfileVariable> variables=new ArrayList<>();
	
	//Map<String,Map<String,Double>> variables=new HashMap<>();
	
	//protected Map<String,Object> variables=new HashMap<>();
	
	public InputProfile(){
		
	}
	
	public InputProfile(int maxSteps, String qosRequirement,List<InputProfileVariable> variables){
		this.maxSteps=maxSteps;
		this.qosRequirement=qosRequirement;
		this.variables=variables;
	}


	public int getMaxSteps() {
		return maxSteps;
	}


	public String getQosRequirement() {
		return qosRequirement;
	}
	
	
	public void addVariable(InputProfileVariable variable){
		this.variables.add(variable);
	}


}
