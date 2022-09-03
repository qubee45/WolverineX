package com.upskill.java_02;

public class switchcase {
	
	static int day = 7;									//if the case and condition is known 
	
	public static void main(String[] args) {
		
		day();
	}

	private static void day() {
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tueday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
		}
	}

}
