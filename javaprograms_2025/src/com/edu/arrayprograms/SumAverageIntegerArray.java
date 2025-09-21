package com.edu.arrayprograms;

import java.util.Scanner;

public class SumAverageIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int size = scanner.nextInt();

        int[] arr = new int[size]; 
        int sum = 0;
        System.out.println("Enter integers:"+size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum = sum+ arr[i];
        }
        
        double average = (double) sum / size;
        
        System.out.println("Sum of array elements = " + sum);
        System.out.println("Average of array elements = " + average);
 
        scanner.close();
	}
}
