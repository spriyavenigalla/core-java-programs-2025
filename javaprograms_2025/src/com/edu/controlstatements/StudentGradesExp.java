package com.edu.controlstatements;

import java.util.Scanner;

public class StudentGradesExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();
        if (marks>=90 && marks<=100) {
            System.out.println("Grade:A");
        } else if (marks>=80 && marks<=89) {
            System.out.println("Grade:B");
        } else if (marks>= 70 && marks<=79) {
            System.out.println("Grade:C");
        } else if (marks>=60 && marks<=69) {
            System.out.println("Grade:D");
        } else if (marks>=0 && marks<60) {
            System.out.println("Grade:F");
        } 

        scanner.close();
	}

}
