package com.edu.controlstatements;

import java.util.Scanner;

public class MonthOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int Month=scanner.nextInt();
		
		switch(Month) {
		case 1:
			System.out.println("Jun will have 1 to 31 days");
			break;
		case 2:
			System.out.println("Feb will have 1 to 31 days");
			break;
		case 3:
			System.out.println("March will have 1 to 31 days");
			break;
		case 4:
			System.out.println("Apirl will have 1 to 31 days");
			break;
		case 5:
			System.out.println("May will have 1 to 31 days");
			break;
		case 6:
			System.out.println("Jun will have 1 to 31 days");
			break;
		case 7:
			System.out.println("Jul will have 1 to 31 days");
			break;
		case 8:
			System.out.println("Agu will have 1 to 31 days");
			break;
		case 9:
			System.out.println("Spet will have 1 to 31 days");
			break;
		case 10:
			System.out.println("Oct will have 1 to 31 days");
			break;
		case 11:
			System.out.println("Nov will have 1 to 31 days");
			break;
		case 12:
			System.out.println("Dce will have 1 to 31 days");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		
		scanner.close();
		

	}

}
