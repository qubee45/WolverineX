package com.upskill.java_06;

public class MyException extends Exception {
	
	String a;
	
	public MyException (String b)
	{
		a=b;
	}	

	public String Upskill() {
		return a;
		
		
	}
}
