package com.edu.numberprograms;

import java.util.Scanner;

public class CheckEvenOrOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scanner.nextInt();
		
		
		if(num% 2==0) {
			System.out.println("The given number is Even");
			}else {
		
		System.out.println("the given is odd");
			}
		
scanner.close();
	}

}
