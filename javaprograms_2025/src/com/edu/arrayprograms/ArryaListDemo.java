package com.edu.arrayprograms;

import java.util.Arrays;
import java.util.List;

public class ArryaListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("Srini","Bharath","Ashok","Haritha");
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		
		
		List<Integer> b=Arrays.asList(8,9,0,6);
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
	}

}
