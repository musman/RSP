/**
 * 
 */
package service.auxiliary;

import javax.management.RuntimeErrorException;

/**
 * 
 * @author Yifan Ruan
 * @email  ry222ad@student.lnu.se
 */
public class OperationAborted extends RuntimeErrorException {
	private static final long serialVersionUID = 1L;

	public OperationAborted(Error e) {
		super(e);
	}

}
