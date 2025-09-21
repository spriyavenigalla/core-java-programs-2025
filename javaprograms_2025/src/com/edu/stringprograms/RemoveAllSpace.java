package com.edu.stringprograms;

import java.util.Scanner;

public class RemoveAllSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 

        String noSpaces = input.replaceAll(" ", ""); 

        System.out.println("String without space: " + noSpaces);

        scanner.close();

	}

}
