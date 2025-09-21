package com.edu.stringprograms;

import java.util.Scanner;

public class ReplaceAllSpacesManually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = ""; 

        
        for (int i = 0; i < input.length(); i++) {
            char cha = input.charAt(i);

            
            if (cha == ' ') {
                result += '-';
            } else {
                result += cha;
            }
        }

        
        System.out.println("Modified string: " + result);

        scanner.close();

	}

}
