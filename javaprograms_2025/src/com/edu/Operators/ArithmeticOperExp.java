package com.edu.Operators;

import java.util.Scanner;

public class ArithmeticOperExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter Number");
		
		Double a= scanner.nextDouble();
		
		System.out.println("Enter Number");
		Double b= scanner.nextDouble();
		
		Double Addition=a+b;
		Double Subtraction=a-b;
		Double Multiplication=a*b;
		Double Division= (a/b);
		Double Modules= (a%b);
	
		{
			System.out.println("Value of A:"+Addition);
			System.out.println("Value of S:"+Subtraction);
			System.out.println("Value of m:"+Multiplication);
			System.out.println("Value of D:"+Division);
			System.out.println("Value of M:"+Modules);
			
			
			
		}
		
		scanner.close();
	}

}
