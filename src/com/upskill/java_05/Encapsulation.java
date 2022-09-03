package com.upskill.java_05;

public class Encapsulation {
	
	private String name = "upskill";		//write and read
	private int ssn = 345678901;			//write only setter method 
	private String username = "Bhuiyan";	//read only getter method 
	
	
	
	
													//setter  method is more like void method
	
			public void setNmae(String value) {
				name = value;
			}
			
													//getter method always return type
			
			public String getName() {
				 return name;
			} 
			
			
			
			
			public void  setSSn (int Value)				//set data
			{
				ssn = Value;
			}
			
			
			public String getUserName() {				//get data
				return username;
			}
			
				
			
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.setNmae("Bhuiyan");
		obj.getName();
		System.out.println(obj.getName());
		obj.setSSn(0);
		obj.getUserName();
		System.out.println(obj.getUserName());
		
	}

}
