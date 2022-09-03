package com.upskill.java;

public class Class_0_HelloWorld {
	
	//Access modifier - public, private, protected, default
	
	public String name = " Omar";								 //public - any class can access it 
	
	
	private int age = 29;        								 // private - Only same class can access it  
	
	
	protected String ssn = "123-45-6789";						 //protected - only same class package & subclass can access it 
	
	String address = "Hertiage Tower";							////default - works as public, only by classes in the same package 

	
	boolean isNice = true;											
	
	public static void main(String[] args) {
	
		
		System.out.println("Hello World");
		System.out.println("Omar");
		System.out.println("29");
		System.out.println("Hertiage Tower");
		System.out.println("True");
	}

}
 