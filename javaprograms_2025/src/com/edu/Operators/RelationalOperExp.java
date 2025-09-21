package com.edu.Operators;

import java.util.Scanner;

public class RelationalOperExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the  number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the firts number: ");
        int number1 = scanner.nextInt();
        if (number > number1) {
            System.out.println("The number is greater than.");
        } else if (number < number1) {
            System.out.println("The  number  less than.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
	}

}
