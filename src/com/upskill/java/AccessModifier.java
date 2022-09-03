package com.upskill.java;

public class AccessModifier {
	
// different access Modifier in 
	public String name = " Omar";								 //public - any class can access it 
	
	
	private int age = 29;        								 // private - Only same class can access it  
	
	
	protected String ssn = "123-45-6789";						 //protected - only classes from the same package & subclass can access it 
	
	String address = "Hertiage Tower";							//default - works as public but only classes from the same package can access it 

	
	boolean isNice = true;		
	
	public static void main(String[] args) {
		
		
		
	}

}
