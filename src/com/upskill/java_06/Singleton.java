package com.upskill.java_06;

public class Singleton {

	// Singleton is class that can only one object 
	//Private contractor , its prevents any other class from instantiating 
	
	private Singleton() {
		
	}
	
	//private static object of the class
	
	private static Singleton Singeltonobj = new Singleton();
	
	//static instance method
	 public static Singleton getInstance() {
		 return Singeltonobj;
	 }
	
	protected static void demo() {
		System.out.println("Demo methods for singleton class");
	}
}
