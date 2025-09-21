package com.edu.stringprograms;

import java.util.Scanner;

public class CountCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++; 
        }

        
        System.out.println("Total number of characters: " + count);

        scanner.close();

	}

}
