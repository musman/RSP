package se.lnu.math.matrix;


import service.atomic.AtomicService;
import service.auxiliary.ServiceOperation;
import service.utility.LogAtomicService;

/**
 * Matrix.java
 * 
 * @author Muhammad Usman Iftikhar
 * @created 29/09/2014
 * 
 */

public class MatrixMultRecursive extends AtomicService{

    public MatrixMultRecursive(String serviceName, String serviceEndpoint) {
	super(serviceName, serviceEndpoint);
    }

    @ServiceOperation
    public int[][] mult(int a[][], int b[][]) {
	
	System.out.println("Recursive matrix multiplication algorightm is called.");
	return multRecursive(a, b);
    }
    
    public int[][] multRecursive(int a[][], int b[][]) {
	
	int size = a.length;

	if (size <= 1) {
	    int val = a[0][0]* b[0][0];
	    int [][] r = {{val}};
	    return r;
	}
	int[][] a00, a01, a10, a11, b00, b01, b10, b11, C00, C01, C10, C11;
	int half = size / 2;
	boolean padNull = false;
	
	// if odd size
	if ((size % 2) == 1) {
	    half += 1;
	    padNull = true;
	}

	// dividing matrix in to 4 parts
	a00 = copyMatrix(a, 0, half, 0, half, half, padNull);
	a01 = copyMatrix(a, 0, half, half, size, half, padNull);
	a10 = copyMatrix(a, half, size, 0, half, half, padNull);
	a11 = copyMatrix(a, half, size, half, size, half, padNull);

	b00 = copyMatrix(b, 0, half, 0, half, half, padNull);
	b01 = copyMatrix(b, 0, half, half, size, half, padNull);
	b10 = copyMatrix(b, half, size, 0, half, half, padNull);
	b11 = copyMatrix(b, half, size, half, size, half, padNull);

	// applying mult formula
	C00 = plus(multRecursive(a00, b00), multRecursive(a01, b10));
	C01 = plus(multRecursive(a00, b01), multRecursive(a01, b11));
	C10 = plus(multRecursive(a10, b00), multRecursive(a11, b10));
	C11 = plus(multRecursive(a10, b01), multRecursive(a11, b11));

	// merging matrixes
	int[][] result = new int[size][size];
	mergeMatrix(result, C00, 0, 0);
	mergeMatrix(result, C01, 0, half);
	mergeMatrix(result, C10, half, 0);
	mergeMatrix(result, C11, half, half);
	return result;

    }

    private int[][] copyMatrix(int[][] m, int rowStart, int rowEnd, int colStart, int colEnd, int rows, boolean padNull) {
	// Creating new Matrix to return as copy.
	int[][] clonnedMatrix = new int[rows][rows];
	int a = rowStart;
	int b;

	for (int i = 0; i < rows; i++) {
	    b = colStart;
	    for (int j = 0; j < rows; j++) {
		if (a >= rowEnd || b >= colEnd)
		    clonnedMatrix[i][j] = 0;
		else
		    clonnedMatrix[i][j] = m[a][b++];
	    }
	    a++;
	}

	return clonnedMatrix;
    }

    public void mergeMatrix(int[][] val, int[][] merger, int rowIndex, int colIndex) {
	int a = 0, b;
	int size = val.length;
	for (int i = rowIndex; i < size && a < merger.length; i++) {
	    b = 0;
	    for (int j = colIndex; j < size && b < merger.length; j++) {
		val[i][j] = merger[a][b++];
	    }
	    a++;
	}
    }

    /*
     * @method: plus()
     * 
     * @param: QRMatrix
     * 
     * @return: QRMatrix The method computes matrix addition operation between original matrix and input matrix. It creates a new matrix without changing the two involved matrices.
     * A NotCompatibleException is raised if the two matrices are not compatible.
     */

    @ServiceOperation
    public int[][] plus(int[][] a, int[][] b) {
	
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
	MatrixMultRecursive matrix = new MatrixMultRecursive("Matrix", "se.lnu.math.matrix.square.mult.recursive");
	matrix.getServiceDescription().getCustomProperties().put("Cost", 2);
	matrix.getServiceDescription().getCustomProperties().put("Complexity", 3.0);
	matrix.getServiceDescription().getCustomProperties().put("ResponseTime", 4);
	//matrix.setServiceBehavior(new LogAtomicService());
	matrix.startService();
	matrix.register();
    }

}
