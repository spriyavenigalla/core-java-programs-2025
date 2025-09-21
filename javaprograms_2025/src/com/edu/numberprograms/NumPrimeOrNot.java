package com.edu.numberprograms;

import java.util.Scanner;

public class NumPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a number");
		int A=scanner.nextInt();
		
		boolean prime = true;
		for(int i=2; i<=A/2; i++) {
			if(A%i==0) {
				prime = false;
			}
		}
		if(prime) {
			System.out.println("The given number is Prime number");
			
		}else {
			System.out.println("The given number is not prime number");
		}

	scanner.close();
	}

}
