package com.upskill.assignment_2;
/*
 * A school conducts a 100 mark exam for its student and grades them as follows:
 * Grade: Grade A: Marks>=90 Grade B: Marks>=80-89 Grade C: Marks>=70-79 Grade
 * D: Marks>=60-69 AND FAIL THEM WHO HAS <60 Write a java program to calculate
 * the grade for a student in a method passing parameter for grade to display
 * every grade type, using if..else statement.
 */



public class Assignment_02_02 {
	
	static int Mark = 55;
	
	public static void main(String[] args) {
		Mark();

	}

	public static void Mark() {
		if (Mark >= 90) {
			System.out.println("Grade A");
		}
		else if (Mark > 80 && Mark< 89) {
			System.out.println("Grade B");	
		}
		else if (Mark > 70 && Mark < 79){
			System.out.println("Grade C");
		}
		else if (Mark > 60 && Mark < 69) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Fail");
		}
	} //else if formula 
}
