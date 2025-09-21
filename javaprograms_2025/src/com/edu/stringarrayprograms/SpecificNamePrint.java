package com.edu.stringarrayprograms;

import java.util.Scanner;

public class SpecificNamePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) { // case-insensitive match
                System.out.println("Name found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Name not found in the array.");
        }

        scanner.close();

	}

}
