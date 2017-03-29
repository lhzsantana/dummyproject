package org.dummy;

public class GlobalUsedClass {
	
	public String usedPublicVariable;

	public String unusedPublicVariable;
	
	private String unusedPrivateVariable;
	
	private String usedPrivateVariable;
	
	public void usedMethod(String usedParameter){
		
		usedPublicVariable=usedParameter;
		usedPrivateVariable=usedParameter;
		
		GlobalUsedClass localUsedClass = new GlobalUsedClass();
		localUsedClass.usedMethod(usedPublicVariable);
	}

	private void privateUnusedMethod(String unusedParameter){
		
		String privateMethodVariable;
		
		
	}

}
