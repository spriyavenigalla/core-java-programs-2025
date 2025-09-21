package com.edu.methodsexp;

public class InstanceStaticVariableDemo {
	
	static int a=10;
	
	 int b=20;
	 
	 static String  collageName="CBIT";
	 
	 String studentName = "priya";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InstanceStaticVariableDemo t=new InstanceStaticVariableDemo();
		
		System.out.println(InstanceStaticVariableDemo.a);
		System.out.println(t.b);
		System.out.println(InstanceStaticVariableDemo.collageName);
		System.out.println(t.studentName);


	}

}
