package com.upskill.java_04;

import com.upskill.java_02.MethodType;

public class Polymorphism extends MethodType {
	
	/*
	 * polymorphism is the ability of an object to take on many forms.
	 *  -method overloading (compile time polymorphism / static binding ) same method name with different signature to overload
	 *  -method overriding (runtime polymorphism/ dynamic binding) same method name from parent class to override 
	 * 
	 */

	public static void main(String[] args) {
		
		
	car();
	car(4);
	car(2, 4);
	car("Black");
	
	weeklyIncomeStatic();
	
	

	}
	
	
	
	
	public static void car()
	{
		System.out.println("My car is BMW");
	}
public static void car(int door)
{
	System.out.println("My car is BMW, it has door " + door);
	}
public static void car(int door, int wheel)
{
	System.out.println("My BMW cope has door " + door + " " + "Wheel"  + " " + wheel);
	
	}
public static void car(String color)

{
	System.out.println("My car color is " + color);
}

//  -method overriding (runtime polymorphism/ dynamic binding) same method name from parent class to override 


public static void weeklyIncomeStatic() {
	int calculateWeeklyIncome = hourlyIncome * 40;
	System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	
	int businessIncome = 2000;
	int newIncome = calculateWeeklyIncome + businessIncome;
	
	System.out.println("My weekly income including Business " + newIncome);
}



}
