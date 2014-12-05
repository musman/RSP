package service.auxiliary;

public class Operation {
	private String opName;
	/**
	 * @return the opName
	 */
	public String getOpName() {
		return opName;
	}
	private Class<?>[] paramTypes;
	private String returnType;
	
	public Operation(String opName,Class<?>[] paramTypes,String returnType){
		this.opName=opName;
		this.paramTypes=paramTypes;
		this.returnType=returnType;
	}
}
