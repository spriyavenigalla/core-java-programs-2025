package com.edu.numberprograms;

import java.util.Scanner;

public class LargestDigitNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First number");
		int number1 = scanner.nextInt();
		System.out.println("Enter the number");
		int number2 = scanner.nextInt();
		if (number1 >= number2) {
			System.out.println("the number is largest");
		
		}else {
			System.out.println("The given number is small");

		}

		scanner.close();
	}

}
