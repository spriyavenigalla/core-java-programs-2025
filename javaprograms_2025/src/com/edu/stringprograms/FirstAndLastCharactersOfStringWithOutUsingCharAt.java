package com.edu.stringprograms;

import java.util.Scanner;

public class FirstAndLastCharactersOfStringWithOutUsingCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        if (str.length() > 0) {//priya 5>0 true
            
            String first = str.substring(0, 1);

            String last = str.substring(str.length() - 1); //5-1

            System.out.println("First character: " + first);
            System.out.println("Last character: " + last);
        } else {
            System.out.println("String is empty.");
        }

        scanner.close();
	}

}
