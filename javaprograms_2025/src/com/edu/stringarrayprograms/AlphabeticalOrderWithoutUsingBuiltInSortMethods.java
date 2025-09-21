package com.edu.stringarrayprograms;

import java.util.Scanner;

public class AlphabeticalOrderWithoutUsingBuiltInSortMethods {

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

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted strings in alphabetical order:");
        for (String str : arr) {
            System.out.println(str);
        }

        scanner.close();

	}

}
