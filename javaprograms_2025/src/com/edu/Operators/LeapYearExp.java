package com.edu.Operators;

import java.util.Scanner;

public class LeapYearExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean Leap = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
        if (Leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();


	}

}
