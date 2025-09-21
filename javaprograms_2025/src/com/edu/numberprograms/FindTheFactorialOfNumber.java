package com.edu.numberprograms;

import java.util.Scanner;

public class FindTheFactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;  // factorial = factorial * i
        }

        // Output the result
        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();

	}

}
