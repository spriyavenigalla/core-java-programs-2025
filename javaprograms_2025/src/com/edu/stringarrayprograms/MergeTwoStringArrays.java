package com.edu.stringarrayprograms;

import java.util.Scanner;

public class MergeTwoStringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        scanner.nextLine();

        String[] arr1 = new String[size1];
        System.out.println("Enter " + size1 + " strings for first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextLine();
        }
        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] arr2 = new String[size2];
        System.out.println("Enter " + size2 + " strings for second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextLine();
        }

        String[] merged = new String[size1 + size2];
        for (int i = 0; i < size1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            merged[size1 + i] = arr2[i];
        }
        System.out.println("Merged array:");
        for (String str : merged) {
            System.out.println(str);
        }

        scanner.close();

	}

}
