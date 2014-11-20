package se.lnu.math.matrix.composite.client;

import java.util.Arrays;
import java.util.List;

import se.lnu.math.matrix.MatrixMultNaive;
import se.lnu.math.matrix.composite.MatrixCompositeService;
import service.composite.CompositeServiceClient;
import service.registry.ServiceRegistry;

public class MatrixClient {

    public static void main(String[] args) {
    	
	ServiceRegistry.main(args);
	MatrixMultNaive.main(args);
	MatrixCompositeService.main(args);
	CompositeServiceClient client = new CompositeServiceClient("se.lnu.Matrix");
	int a[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
	int b[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
	//int c[][] = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
	int result[][];
	List<String> qosRequirements = client.getQosRequirementNames();
	
	for(String qosRequirement: qosRequirements){
	    System.out.println("QoS requirement:" + qosRequirement );
	    Object object = client.invokeCompositeService(qosRequirement, a, b);
	    result = (int[][]) object;
	    System.out.println("Result with QoS requirement:" + qosRequirement);
	    
	    //for(int i = 0; i < result; i++){
		System.out.println(Arrays.deepToString(result));
	    //}
	    
	}
    }
}
