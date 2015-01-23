package service.auxiliary;

import java.io.Serializable;

public class Operation implements Serializable{
	private String opName;
	/**
	 * @return the opName
	 */
	public String getOpName() {
		return opName;
	}
	private Class<?>[] paramTypes;
	/**
	 * @return the paramTypes
	 */
	public Class<?>[] getParamTypes() {
		return paramTypes;
	}

	private String returnType;
	
	/**
	 * @return the returnType
	 */
	public String getReturnType() {
		return returnType;
	}
	
	private double opCost;
	
	public double getOpCost() {
	    return opCost;
	}
	
	public void setOpCost(double opCost) {
	    this.opCost = opCost;
	}


	public Operation(String opName,Class<?>[] paramTypes,String returnType){
		this.opName=opName;
		this.paramTypes=paramTypes;
		this.returnType=returnType;
	}
	
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Operation){
			Operation op=(Operation)obj;
			if(!opName.equals(op.getOpName()))
				return false;
			if(!returnType.equals(op.getReturnType()))
				return false;
			for(int i=0;i<paramTypes.length;i++){
				if(!paramTypes[i].equals(op.getParamTypes()[i]))
					return false;
			}
			return true;
		}
		return false;
	}	
}
