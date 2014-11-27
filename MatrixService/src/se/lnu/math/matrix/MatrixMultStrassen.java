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

public class MatrixMultStrassen  extends AtomicService{

    public MatrixMultStrassen(String serviceName, String serviceEndpoint) {
	super(serviceName, serviceEndpoint);
    }
    
    @ServiceOperation
    public int[][] mult(int[][] a, int[][] b) {
	System.out.println("Strassen's matrix multiplication algorightm is called.");
	return multStrassen(a, b);
    }

    public int[][] multStrassen(int[][] a, int[][] b) {

	int size = a.length;
	if (size <= 1) {
	    int val = a[0][0]* b[0][0];
	    int [][] r = {{val}};
	    return r;
	}

	int[][] a00, a01, a10, a11, b00, b01, b10, b11;
	boolean padNull = false;
	int half = size / 2;
	
	// If odd size
	if (size % 2 == 1) {
	    half += 1;
	    padNull = true;
	}

	// copy matrixes
	a00 = copyMatrix(a, 0, half, 0, half, half, padNull);
	a01 = copyMatrix(a, 0, half, half, size, half, padNull);
	a10 = copyMatrix(a, half, size, 0, half, half, padNull);
	a11 = copyMatrix(a, half, size, half, size, half, padNull);

	b00 = copyMatrix(b, 0, half, 0, half, half, padNull);
	b01 = copyMatrix(b, 0, half, half, size, half, padNull);
	b10 = copyMatrix(b, half, size, 0, half, half, padNull);
	b11 = copyMatrix(b, half, size, half, size, half, padNull);

	// applying algorithm
	int[][] M1 = multStrassen(minus(a01, a11), plus(b10, b11));
	int[][] M2 = multStrassen(plus(a00, a11), plus(b00, b11));
	int[][] M3 = multStrassen(minus(a00, a10), plus(b00, b01));
	int[][] M4 = multStrassen(plus(a00, a01), b11);
	int[][] M5 = multStrassen(a00, minus(b01, b11));
	int[][] M6 = multStrassen(a11, minus(b10, b00));
	int[][] M7 = multStrassen(plus(a10, a11), b00);

	int[][] C00 = plus(minus(plus(M1, M2), M4), M6);
	int[][] C01 = plus(M4, M5);
	int[][] C10 = plus(M6, M7);
	int[][] C11 = minus(plus(minus(M2, M3), M5), M7);

	// merging result
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

    @ServiceOperation
    public int[][] minus(int[][] a, int[][] b) {
	int size = a.length;
	int[][] result = new int[size][size];

	// Creating new matrix to store final addition results.

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		// Computing addition and storing result into new matrix.
		result[i][j] = a[i][j] - b[i][j];
	    }
	}
	return result;
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
	MatrixMultStrassen matrix = new MatrixMultStrassen("Matrix", "se.lnu.math.matrix.square.mult.strassen");
	matrix.getServiceDescription().getCustomProperties().put("Cost", 3);
	matrix.getServiceDescription().getCustomProperties().put("Complexity", 2.80);
	matrix.getServiceDescription().setResponseTime(2);
	matrix.setServiceBehavior(new LogAtomicService());
	matrix.startService();
	matrix.register();
    }

}
