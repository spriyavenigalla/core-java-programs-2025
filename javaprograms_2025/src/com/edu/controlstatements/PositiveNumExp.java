package com.edu.controlstatements;

import java.util.Scanner;

public class PositiveNumExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			int a = scanner.nextInt();
			
			if(a>0) {
				System.out.print("The given number is positive");
				
			}else {
				System.out.println("the given number is negative");
		
			}
		scanner.close();
        
    
	}

}
