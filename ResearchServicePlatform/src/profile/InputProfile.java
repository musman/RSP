/**
 * 
 */
package profile;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class InputProfile {

	private static XStream xstream=new XStream(new StaxDriver());
	private String name;
	private int maxNumofInvocations;
	private String workflowPath;
	private Map<String,Object> variables=new HashMap<>();
	
	static{
		xstream.alias("Profile", InputProfile.class);
	}
	
	public InputProfile(){
		
	}
	
	/*
	public Profile(String name, int invocationNum, String workflowPath, Map<String,Object> variables){
		this.name=name;
		this.invocationNum=invocationNum;
		this.workflowPath=workflowPath;
		this.variables=variables;
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
}
