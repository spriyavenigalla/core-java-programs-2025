package com.edu.arrayprograms;

public class ArryaOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] arr= {12,20,1,2,10,5,8};
		String [] s= {"Srini","priya","Bharath","Aruna","Siva"};
		//for(int i=0; i<s.length; i++) {
		//	System.out.println(s[i]);
		//}
		
		//for(int i=s.length-1; i>=0; i--) {
		//	System.out.println(s[i]);
		//}
		
		for(int i=s.length-1; i>=0; i--) {
			
			if(s[i].startsWith("S")) {
				System.out.println(s[i]);
			}
		}
		
		

		

	}

}
