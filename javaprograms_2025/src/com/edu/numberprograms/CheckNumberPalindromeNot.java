package com.edu.numberprograms;

import java.util.Scanner;

public class CheckNumberPalindromeNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); //num =121
        int original = num;

        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; //121%10=1, 12%10 =2   , 0%10=0 loop stop
            reversed = reversed * 10 + digit;//0*+1=1, 1*10+2=12
            num = num / 10;//121/10=12, 1/10=0
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }

        scanner.close();

	}

}
