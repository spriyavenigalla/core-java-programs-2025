package com.edu.controlstatements;

import java.util.Scanner;

public class SingleCharacterTypeChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character");
		 char C = scanner.next().charAt(0);
		 
		 if(C>='A' && C<='Z') {
			 
			 System.out.println("The charcter is upper case letter");
			 
		 }else if(C>='a' && C<='z'){
			 System.out.println("The charcter is lower case letter");
			 
		 }else if(C>='0' && C<='9'){
			 System.out.println("Digit");
		 }
		 else {
			 System.out.println("Special Character");
		 }
		 
		scanner.close();
		
		

	}

}
