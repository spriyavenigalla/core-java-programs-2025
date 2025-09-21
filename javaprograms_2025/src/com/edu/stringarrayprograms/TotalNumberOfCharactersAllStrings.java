package com.edu.stringarrayprograms;

import java.util.Scanner;

public class TotalNumberOfCharactersAllStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        int totalCharacters = 0;
        for (String str : arr) {
            totalCharacters += str.length();
        }

        System.out.println("Total number of characters: " + totalCharacters);

        scanner.close();

	}

}
