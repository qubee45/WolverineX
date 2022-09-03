package com.upskill.java_03;

import com.upskill.java_02.MethodType;

/* The process of obtaining the data members and methods from one class to another class is known as inheritance.
-	Single Inheritance
-	Multiple Inheritance	(Java doesn't support Multiple Inheritance directly rather through Interfaces)
-	Multilevel Inheritance

*/


	
	public class inheritance extends MethodType{
		
	

	public static void main(String[] args) {
		
		inheritance myobj = new inheritance();
		myobj.annaualincomeVoid();
		myobj.weeklyIncomeStatic();
		myobj.quaterlyIncomeStatic();
		

	}

}


