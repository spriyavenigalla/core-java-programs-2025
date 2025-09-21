package com.edu.numberprograms;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        int count = 0;

	        // Handle 0 specifically (since logics below would skip it)
	        if (num == 0) {
	            count = 1;
	        } else {
	            // Make number positive if negative
	            num = Math.abs(num);

	            while (num > 0) {
	                num = num / 10;  // Remove last digit
	                count++;         // Increment digit count
	            }
	        }

	        System.out.println("Number of digits: " + count);

	        scanner.close();

	}

}
