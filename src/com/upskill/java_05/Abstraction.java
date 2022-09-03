package com.upskill.java_05;

public abstract class Abstraction {
	
	//Abstract class has both abstract method and regular method
	
	
	//Abstract method 

	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public abstract String iEngine();
	
	public abstract void iSeat();
	
	
	
	
	// non abstract or regular method
	
	public void brand() {
		String brand = "BMW";
	}
	public String color(){
		String color = "Black";
		return color;
	}
}
