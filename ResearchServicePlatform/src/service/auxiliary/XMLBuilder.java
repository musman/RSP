package service.auxiliary;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XMLBuilder {
	XStream xstream = new XStream(new DomDriver());
	
	public XMLBuilder(){
		xstream.alias("request", Request.class);
		xstream.alias("response", Response.class);
		xstream.alias("ServiceDescription", ServiceDescription.class);
		xstream.alias("param", Param.class);
		xstream.alias("operation", Operation.class);
	}
	
	public String toXML(Object obj){
		return xstream.toXML(obj);
	}
	
	public Object fromXML(String str){
		return xstream.fromXML(str);
	}

}