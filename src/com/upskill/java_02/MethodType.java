package com.upskill.java_02;

public class MethodType {
	
	/*type of method 
	 
		1. void Method
		2. static Method 
		3. Return method  */
	
	
	public static int hourlyIncome = 60;
	
	public static int monthlyIncome = 10800;
	 
	
	public static void main(String[] args) {
		
		MethodType myobj = new MethodType();			//creating class object 
		
		myobj.annaualincomeVoid();						// calling void method 
		
		
		weeklyIncomeStatic(); 							// calling static method 
		
		System.out.println("My Monthly Income = " + myobj.monthlyIncomeReturn());  //calling Return method 
		
		myobj.monthlyIncome();
		
		quaterlyIncomeStatic();
		
		System.out.println("My Daily Income = " + myobj.dailyIncome());
		
	}
	


	//Void Method
	
	public void annaualincomeVoid(){
		int calculsteAnnaulIncome = hourlyIncome * 2000; 
	System.out.println("My Annual Income = " + calculsteAnnaulIncome);
	
	}
	
	public void monthlyIncome(){
		int calculateHalfYear = monthlyIncome * 6; 
	System.out.println("My Half year Income  = " + calculateHalfYear);
	
	}
	
	
	
	//static Method
	
	public static void weeklyIncomeStatic() {
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
		
	
	}
	
	public static void quaterlyIncomeStatic() {
	int calculateQuaterlyIncome = monthlyIncome * 3; 
	System.out.println("My Quaterly Income = " + calculateQuaterlyIncome);
		
		
	}
	
	// return method 
	
	public int monthlyIncomeReturn() {
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
		
	}
	 
	public int dailyIncome() {
		int dailyIncome = hourlyIncome * 8;
		return dailyIncome;
	}
	
}

