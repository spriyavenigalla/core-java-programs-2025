package com.edu.arrayprograms;

import java.util.Scanner;

public class LargestSmallestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        
        System.out.println("Enter integers:"+size);
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        
        int largest = arr[0];      //Initialize
        int smallest = arr[0];

      
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

     
        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);

        scanner.close();

	}

}
