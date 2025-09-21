package com.edu.stringarrayprograms;

import java.util.Arrays;


public class TwoStringsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     
        String[] arr1 = {"Java", "Python", "C"};
        String[] arr2 = {"HTML", "CSS", "JavaScript"};

        
        String[] merged = new String[arr1.length + arr2.length];

      
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

    
        System.out.println("Merged Array: " + Arrays.toString(merged));


	}

}
