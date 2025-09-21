package com.edu.controlstatements;

import java.util.Scanner;

public class EvenOddNumExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		
	       
	        System.out.println("Enter Number:");
	        int num = scanner.nextInt();
	        if (num % 2 == 0) {
	            System.out.println( "Given Number is Even number:"+num);
	        } else {
	            System.out.println("Given Number is Even number:"+num);
	        }

	        scanner.close();

	}

}
