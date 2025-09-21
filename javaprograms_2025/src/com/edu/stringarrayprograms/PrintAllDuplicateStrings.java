package com.edu.stringarrayprograms;

import java.util.Scanner;

public class PrintAllDuplicateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // 
        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.println("Duplicate strings in the array:");

        boolean foundDuplicate = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == null) continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] != null && arr[i].equalsIgnoreCase(arr[j])) {
                    System.out.println(arr[i]);
                    arr[j] = null; // 
                    foundDuplicate = true;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }

        scanner.close();

	}

}
