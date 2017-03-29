package org.dummy;

public class LocalUsedClass {
	
	private String usedVariable;
	
	public void usedMethod(String usedParameter){
		
		usedVariable=usedParameter;
		
		LocalUsedClass localUsedClass = new LocalUsedClass();
		
		localUsedClass.usedMethod(usedVariable);
	}

}
