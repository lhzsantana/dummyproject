package org.dummy;

public class GlobalUsedClass {
	
	public String usedVariable;
	
	public void usedMethod(String usedParameter){
		
		usedVariable=usedParameter;
		
		GlobalUsedClass localUsedClass = new GlobalUsedClass();
		
		localUsedClass.usedMethod(usedVariable);
	}

}
