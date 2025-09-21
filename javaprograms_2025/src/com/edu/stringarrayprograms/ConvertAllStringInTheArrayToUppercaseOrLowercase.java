package com.edu.stringarrayprograms;

import java.util.Scanner;

public class ConvertAllStringInTheArrayToUppercaseOrLowercase {

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

        System.out.print("Convert to {U}ppercase or [L]owercase? ");
        char choice = scanner.next().charAt(0);

        // Convert and print
        System.out.println("Converted strings:");
        for (String str : arr) {
            if (choice == 'U' || choice == 'u') {
                System.out.println(str.toUpperCase());
            } else if (choice == 'L' || choice == 'l') {
                System.out.println(str.toLowerCase());
            } else {
                System.out.println("Invalid choice.");
                break;
            }
        }

        scanner.close();

	}

}
