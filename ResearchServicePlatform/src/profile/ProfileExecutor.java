/**
 * 
 */
package profile;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStream;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class ProfileExecutor {

	private static XStream xstream=new XStream(new StaxDriver());
	public static InputProfile profile=new InputProfile();
	
	static{
		xstream.alias("InputProfile", InputProfile.class);
	}
	
	public static void readFromXml(String xmlPath){
		try {
			InputStream input = new FileInputStream(xmlPath);
			ProfileExecutor.profile= (InputProfile)xstream.fromXML(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeToXml(String xmlPath){
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter(xmlPath));	
			writer.write(xstream.toXML(ProfileExecutor.profile));
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args){
		
		
		//String xmlPath="/Users/ryf/Documents/github/TeleAssistanceSystem/resources/profile.xml";
		
		String xmlPath="inputProfile.xml";

		
		ProfileExecutor.profile.name="profile1";
		ProfileExecutor.profile.maxSteps=100;
		ProfileExecutor.profile.variables.put("pick", 2);
		ProfileExecutor.profile.variables.put("analysisResult", 1);
		
		ProfileExecutor.writeToXml(xmlPath);
		
		/*
		ProfileExecutor.readFromXml(xmlPath);
		System.out.println("Variable analysisResult: "+ProfileExecutor.profile.getVariable("analysisResult"));*/

		
		//String xml=xstream.toXML(profile);
		//System.out.println(xml);
		
		/*
		Profile profile=new Profile(xmlPath);
		System.out.println("Variable analysisResult: "+profile.getVariable("analysisResult"));*/

		
	}
}
