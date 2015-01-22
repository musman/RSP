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
<<<<<<< Updated upstream:ResearchServicePlatform/src/profile/InputProfile.java
public class InputProfile {
=======
>>>>>>> Stashed changes:ResearchServicePlatform/src/profile/Profile.java

public class Profile {
	private String name;
	private int maxNumofInvocations;
	private String workflowPath;
	private Map<String,Object> variables=new HashMap<>();
<<<<<<< Updated upstream:ResearchServicePlatform/src/profile/InputProfile.java
	
	static{
		xstream.alias("Profile", InputProfile.class);
	}
	
	public InputProfile(){
=======

	public Profile(){
>>>>>>> Stashed changes:ResearchServicePlatform/src/profile/Profile.java
		
	}
	
	public Profile(String name, int invocationNum, String workflowPath, Map<String,Object> variables){
		this.name=name;
		this.maxNumofInvocations=invocationNum;
		this.workflowPath=workflowPath;
		this.variables=variables;
<<<<<<< Updated upstream:ResearchServicePlatform/src/profile/InputProfile.java
	}*/
	
	public InputProfile(String xmlPath){
		InputProfile profile=(InputProfile)this.readFromXml(xmlPath);
		if(profile!=null){
			this.name=profile.name;
			this.maxNumofInvocations=profile.maxNumofInvocations;
			this.workflowPath=profile.workflowPath;
			this.variables=profile.variables;
		}
	}
	
	public InputProfile readFromXml(String xmlPath){
		try {
			InputStream input = new FileInputStream(xmlPath);
			return (InputProfile)xstream.fromXML(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void writeToXml(String xmlPath){
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter(xmlPath));	
			writer.write(xstream.toXML(this));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
=======
>>>>>>> Stashed changes:ResearchServicePlatform/src/profile/Profile.java
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

<<<<<<< Updated upstream:ResearchServicePlatform/src/profile/InputProfile.java
	public static void main(String[] args){
		
		/*
		Profile profile=new Profile();
		profile.name="profile1";
		profile.invocationNum=50;
		profile.variables.put("pick", 0);
		profile.variables.put("analysisResult", 1);
		
		String xml=xstream.toXML(profile);
		System.out.println(xml);
		profile.writeToXml("profile.xml");*/
		
		InputProfile profile=new InputProfile("profile.xml");
		System.out.println("Variable analysisResult: "+profile.getVariable("analysisResult"));

		
	}
=======
>>>>>>> Stashed changes:ResearchServicePlatform/src/profile/Profile.java
}
