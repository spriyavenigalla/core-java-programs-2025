package com.edu.stringarrayprograms;

import java.util.Scanner;

public class ReverseEachStringInTheArray {

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
        System.out.println("Reversed strings:");
        for (String str : arr) {
            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            System.out.println(reversed);
        }

        scanner.close();

	}

}
