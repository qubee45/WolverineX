package com.upskill.java;

public class Variables {
	
	/* variables in java
	
		Instance or Global Variable
		Static Variable
		Local Variable
		Method Parameter */
	
	public String country = "USA";			// Instance or Global Variable - variables declared in class level, outside method
	
	public static String region = "America";  // static Variable - variables belong to the class and don't required creating object 
		
		
	public static void main(String[] args) {
		
		String city = "New York";				//Local  Variable - Variable declared in methods 
		
		

	}

	public void method(String county) {				//Method parameter - variables used as method parameter
		String myCounty = county;
		
	}
}
