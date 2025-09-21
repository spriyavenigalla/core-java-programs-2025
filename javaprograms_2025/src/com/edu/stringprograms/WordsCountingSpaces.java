package com.edu.stringprograms;

import java.util.Scanner;

public class WordsCountingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().trim();

        int wordCount = 1;

        if (str.isEmpty()) {
            wordCount = 0; 
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    wordCount++;  
                }
            }
        }

        System.out.println("Number of words: " + wordCount);

        scanner.close();

	}

}
