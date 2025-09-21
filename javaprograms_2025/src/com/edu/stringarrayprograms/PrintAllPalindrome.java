package com.edu.stringarrayprograms;

import java.util.Scanner;

public class PrintAllPalindrome {

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

        System.out.println("Palindrome strings in the array:");

        boolean found = false;
        for (String str : arr) {
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            if (str.equalsIgnoreCase(reversed)) {
                System.out.println(str);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No palindrome strings found.");
        }

        scanner.close();

	}

}
