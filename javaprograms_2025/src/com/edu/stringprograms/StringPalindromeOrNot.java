package com.edu.stringprograms;

import java.util.Scanner;

public class StringPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String rev = "";

        for (int i=str.length()-1; i>= 0; i--)
            rev += str.charAt(i);
     // madam 
     // i = 4 - 'm' → rev = "m"
     //	i = 3 - 'a' → rev = "ma"
     //	i = 2 - 'd' → rev = "mad"
     //	i = 1 - 'a' → rev = "mada"
     // i = 0 - 'm' → rev = "madam"
        System.out.println(str.equals(rev) ? "Palindrome" : "Not a palindrome"); //Ternary Operator
                           // condition        success            fail

        scanner.close();

	}

}
