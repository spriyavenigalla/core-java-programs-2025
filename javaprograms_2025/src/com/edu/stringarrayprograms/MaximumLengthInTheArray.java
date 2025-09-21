package com.edu.stringarrayprograms;

import java.util.Scanner;

public class MaximumLengthInTheArray {

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

        String maxString = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i].length() > maxString.length()) {
                maxString = arr[i];
            }
        }
        System.out.println("String with maximum length: " + maxString);
        System.out.println("Length: " + maxString.length());

        scanner.close();

	}

}
