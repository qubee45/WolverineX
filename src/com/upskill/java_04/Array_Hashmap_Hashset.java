package com.upskill.java_04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset {
	
	

	public static void main(String[] args) {
		
		//array store multiple data using index
		
		int age =30;
		int [] ageWolverine  = new int [] {24,28,30,35,29,40};
		
		//array index [0][1][2][3][4][5]
		
		System.out.println("Student age: " + ageWolverine[2]);
		System.out.println("Total Student: " + ageWolverine.length);
		
		
		
		String[] nameWolverine = new String [] { "Omar", "Polash", "Rafi", "Abdulla"};
		System.out.println("Student Name " + nameWolverine [1]);
		System.out.println("Total People : " + nameWolverine.length);
		
		//Multi-dimensional array
		
		int [][] ageWolverine2D = {
				{
					24,28,30,35,29,40},		//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
				{
						35,22,27			//[1][0]  [1][1]   [1][2] 
				}
				
				};
		System.out.println("Student Age 2D: " + ageWolverine2D[0][3]);
		System.out.println("Student Age 2D: " + ageWolverine2D[1][1]);
		
		//Hashmap store multiple data using key-value , implementation of map interface 
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Omar", 32);
		Student.put("Polash", 27);
		Student.put("Rafi", 22);
		Student.put("Abdulla", 25);
		Student.put("Rosni", 45);
		
		System.out.println("Student Age : " + Student.get("Omar"));
		
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital city : " + Capital.get("USA"));
		
		//HashSet store unordered collection containing unique value, Implementation of set interface
		
		
		HashSet<String> car = new HashSet<String>();
		car.add("Audi");
		car.add("BMW");
		car.add("Ford");
		System.out.println("Car " + car );
		
		//Hashtable store multiple data using key-value pair, but is synchronized (only one thread can be modify)
		
		Hashtable < String, String > region = new  Hashtable <String , String >();
		
		region.put("BD", "Asia");
		region.put("USA", "North America");
		
		System.out.println("Region : " + region.get("BD"));
		
		}

	}


