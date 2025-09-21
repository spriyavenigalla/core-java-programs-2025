package com.edu.stringprograms;

import java.util.Scanner;

public class StringEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str=scanner.nextLine();

        System.out.print("Enter second string: ");
        String str1=scanner.nextLine();

        
        if (str.equals(str1)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        scanner.close();

	}

}
