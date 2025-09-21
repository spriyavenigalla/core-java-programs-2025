package com.edu.controlstatements;

import java.util.Scanner;

public class VotingEligibileExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter person age: ");
		int age = scanner.nextInt();
		if (age >= 18) {
			System.out.println("A person eligible for voting.");
		}
		else {
			 System.out.println("A person not eligible to vote.");
			
		}
		scanner.close();

	}

}
