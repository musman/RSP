/**
 * 
 */
package service.utility;

import java.util.Arrays;

import service.atomic.ExtraBehavior;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class LogAtomicService extends ExtraBehavior {

    public boolean preInvokeOperation(String operationName, Object... args) {
	System.out.println("Operation: " + operationName);
	System.out.println("Arguments: " + Arrays.toString(args));
	return true;
    }

    public Object postInvokeOperation(String operationName, Object result, Object... args) {
	System.out.println("Operation: " + operationName);
	System.out.println("Result: " + result.toString());
	System.out.println("Arguments: " + Arrays.toString(args));
	return result;
    }
}
