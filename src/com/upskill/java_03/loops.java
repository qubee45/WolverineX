package com.upskill.java_03;

public class loops {
	
public static void main(String[] args) {

	// practiceForLoop();
	 //praticeWhileloop();
	 //prticeDoWhileloop();
	 //praticeInfinteloop();
	// praticeDecremnt();
	// nestedloop();
	 multipicationloop();
}


public static void practiceForLoop() {
	
	int i;										//for loop do again and again up to the limit 
	for (i =1; i<=10; i++) 
	
	{
		System.out.println("For Loop nNumber =" + i);
		
	}
	
	
}

public static void praticeWhileloop()

{
	int i =1;
	
	while (i<=100)
			{
		System.out.println("While Loop Number =" + i);
		i++;
	}
	
	
}
public static void prticeDoWhileloop()
{ int i =1;
	do {
		System.out.println("Do While Loop = " + i);
		i++;
	}
		while (i<=100);
	}
/*
public static void praticeInfinteloop()
{
	int i;
	for (i=1; ; i++)
	{
		System.out.println("Infinie Loop Number =" + i);
	}
	}
	*/

public static void praticeDecremnt() 
{int i;
for (i=10; i>=1; i--)
{
	System.out.println("Decrement loop = " + i);
	}
	
}

public static void nestedloop()
{
	int i;
	int j;
	for (i=1; i<=10;i++) 
	{
		for (j= 1; j<=10; j++)
		{
			System.out.println("Nested for loop =" +i + ":" + j);
		}
		System.out.println("Increase Value of i -> " +i);
	}
	}


public static void multipicationloop()
{ for (int row = 1; row <= 10; row++) {
	for (int col=1; col<= 10; col++)
	{int table = row*col;
		System.out.print(table + " ");
		}
	System.out.println(" ");
}
	}
}
