package com.upskill.java_03;


/*Contractor is instance of class, method name same as class, java will execute contractor first
Contractor cannot be static or override nor void or return type.
		default contractor no Contractor is initialized
		parameterized Contractor add different signature 
		Contractor overloading different signature 
*/
public class constractor {
	
	String admin;
	int adAge;
	

		public constractor(String name, int age) 
		{
		admin = name;
		adAge = age;
			
			
		} 
		
	

	public static void main(String[] args) {
		constractor myobj= new constractor( "Zainal", 35);
		System.out.println(myobj.admin);
		System.out.println(myobj.adAge);
	}

}
