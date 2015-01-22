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
	public static Profile profile=null;
	
	static{
		xstream.alias("Profile", Profile.class);
	}
	
	public static void readFromXml(String xmlPath){
		try {
			InputStream input = new FileInputStream(xmlPath);
			ProfileExecutor.profile= (Profile)xstream.fromXML(input);
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
		
		/*
		String xmlPath="/Users/ryf/Documents/github/TeleAssistanceSystem/resources/profile.xml";
		
		Profile profile=new Profile();
		profile.name="profile1";
		profile.maxNumofInvocations=10;
		profile.variables.put("pick", 2);
		profile.variables.put("analysisResult", 1);
		
		String xml=xstream.toXML(profile);
		System.out.println(xml);
		profile.writeToXml(xmlPath);*/
		
		/*
		Profile profile=new Profile(xmlPath);
		System.out.println("Variable analysisResult: "+profile.getVariable("analysisResult"));*/

		
	}
}
