package se.lnu.math.matrix;

import java.util.HashMap;

import service.atomic.AtomicService;
import service.auxiliary.ServiceOperation;

/**
 * Matrix.java
 * 
 * @author Muhammad Usman Iftikhar
 * @created 29/09/2014
 * 
 */

public class MatrixMultNaive extends AtomicService{


    public MatrixMultNaive(String serviceName, String serviceEndpoint) {
	super(serviceName, serviceEndpoint);
    }

    /*
     * @method: mult()
     * 
     * @return: The method computes matrix multiplication operation between original matrix and input matrix. 
     * It creates a new matrix without changing the two involved matrices.
     */
    @ServiceOperation
    public int[][] mult(int[][] a, int[][] b) {
	
	System.out.println("Naive matrix multiplication algorithm is called.");
	
	int size = a.length;

	// Creating new matrix to store final multiplication results.
	int[][] result = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		result[i][j] = 0;
	    }
	}

	for (int i = 0; i < size; i++) { // aRow
	    for (int j = 0; j < size; j++) { // bColumn
		for (int k = 0; k < size; k++) { // aColumn
		    result[i][j] += a[i][k] * b[k][j];
		}
	    }
	}

	return result;
    }

   
    public static void main(String[] args) {
	MatrixMultNaive matrix = new MatrixMultNaive("Matrix", "se.lnu.math.matrix.square.mult.naive");
	HashMap customProperties = matrix.getServiceDescription().getCustomProperties();
	customProperties.put("Cost", 2);
	customProperties.put("Complexity", 3);
	customProperties.put("ResponseTime", 5);
	matrix.startService();
	matrix.register();
    }

}
