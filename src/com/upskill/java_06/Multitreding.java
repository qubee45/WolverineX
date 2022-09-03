package com.upskill.java_06;

public class Multitreding {
	/*
	 * MultiThreading is a java feature that allows concurrent excution of two or
	 * more parts of a program
	 * 
	 * Threads can be created by using two mechanisms:
	 * 
	 * 1. Extending the thread class 
	 * 2. Implementing the runnable Interface
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		int n = 5;												//Number of threads 
		for (int i = 0; i< n; i++)
			
		{	MultitredingDemo obj = new MultitredingDemo();		//object for extending the Thread class
			Thread obj2 = new Thread(new MultitredingDemo2());	//Object for Implementing the runnable Interface 
			obj.start();
			
			
		}
		
	}

}
class MultitredingDemo extends Thread {							//Extending the class
	 public void run() {
		 try {
			 System.out.println("Thread " + Thread.currentThread().getId() + " is running ");
		 }catch (Exception e) {
			 System.out.println("Exception is caught");
		 }
	 }
	
}



 class MultitredingDemo2 implements Runnable {					//Implementing the runnable interface 
	 public void run() {
		 try {
			 System.out.println("Thread " + Thread.currentThread().getId() + " is running ");
		 }
		 catch (Exception e) {
			 System.out.println("Exception is cought");
		 }
	 }
 } 
