package com.upskill.java_02;

public class IfElseStatement {
	
	static int age = 65;

	public static void main(String[] args) {
		age();
		
		

	}
	//if else Statement
	
	public static void age() {
		if ( age < 13 ) {
			System.out.println("You are children");
		}
		else if (age > 13 && age < 18) {
			System.out.println("You are Teenager");
		}
		else if ( age >= 60 ){
			
			//nested if else statement
			if ( age >= 100) {
				System.out.println("You are a Hero");
			}
			else {
				System.out.println("You are senior");
			}
			
	
		}
		else {
			System.out.println("You are adult");
		}
		
	}

}
