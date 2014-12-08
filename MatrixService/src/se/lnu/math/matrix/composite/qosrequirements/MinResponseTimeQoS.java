package se.lnu.math.matrix.composite.qosrequirements;

import java.util.List;

import service.auxiliary.ServiceDescription;
import service.workflow.AbstractQoSRequirement;

public class MinResponseTimeQoS implements AbstractQoSRequirement {

    @Override
    public ServiceDescription applyQoSRequirement(List<ServiceDescription> serviceDescriptions, String opName, Object[] params) {
	int minResponseTime = Integer.MAX_VALUE;
	int index = 0;
	int responseTime;
	
	for (int i = 0; i < serviceDescriptions.size(); i++) {
	    if (serviceDescriptions.get(i).getCustomProperties().containsKey("ResponseTime")){
		responseTime = (int) serviceDescriptions.get(i).getCustomProperties().get("ResponseTime");
		if (responseTime < minResponseTime){
		    minResponseTime = responseTime;
		    index = i;
		}
	    }
	    else {
		throw new RuntimeException("ResponseTime custom property not found in service description.");
	    }
	}
	
	return serviceDescriptions.get(index);
    }

}
