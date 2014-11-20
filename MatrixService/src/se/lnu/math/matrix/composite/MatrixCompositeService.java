package se.lnu.math.matrix.composite;

import java.io.File;

import se.lnu.math.matrix.composite.qosrequirements.MinCostQoS;
import se.lnu.math.matrix.composite.qosrequirements.MinCostAndResponseTime;
import se.lnu.math.matrix.composite.qosrequirements.MinResponseTimeQoS;
import service.auxiliary.LocalOperation;
import service.composite.CompositeService;

public class MatrixCompositeService extends CompositeService{

    public MatrixCompositeService(String serviceName, String serviceEndpoint,
			String workflow) {
		super(serviceName, serviceEndpoint, workflow);
		// TODO Auto-generated constructor stub
	}
    
    @LocalOperation
    public int[][] plus(int[][] a, int[][] b) {
    	System.out.println("local operation");
	// Checking if input matrix is of same size as original matrix. If not,
	// throw an exception.
	int size = a.length;

	// Creating new matrix to store final addition results.
	int[][] result = new int[size][size];
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		// Computing addition and storing result into new matrix.
		result[i][j] = a[i][j] + b[i][j];
	    }
	}
	return result;
    }

	public static void main(String[] args) {
		
		MatrixCompositeService compositeService = new MatrixCompositeService("Matrix", "se.lnu.Matrix", "/Users/ryf/Dropbox/Architectures for Service-based Systems/code/MatrixService/src/matrix-workflow.txt");
    	compositeService.addQosRequirement("MinCost", new MinCostQoS());
    	compositeService.addQosRequirement("MinResponseTime", new MinResponseTimeQoS());
    	compositeService.addQosRequirement("MinCostAndResponseTime", new MinCostAndResponseTime());
    	compositeService.startService();
	compositeService.register();
	
		/*
	CompositeService compositeService = new CompositeService("Matrix", "se.lnu.Matrix", "/Users/ryf/Dropbox/Architectures for Service-based Systems/code/MatrixService/src/matrix-workflow.txt");
    	compositeService.addQosRequirement("MinCost", new MinCostQoS());
    	compositeService.addQosRequirement("MinResponseTime", new MinResponseTimeQoS());
    	compositeService.addQosRequirement("MinCostAndResponseTime", new MinCostAndResponseTime());
    	compositeService.startService();
	compositeService.register();*/
    }
}
