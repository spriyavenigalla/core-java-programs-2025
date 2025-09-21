package com.edu.methodsexp;

public class TestDemo {
public void getInfo() {
		System.out.println("Srini");

	}
public void getData() {
System.out.println("IT-Solution");

}
public void add(int a, int b) {

	System.out.println(a+b);
}

public void addString(String str, String str1) {
	System.out.println(str+str1);
}

public int addition(int a, int b) {
	int c=a+b;
	return c;
}

public String concatString(String str, String str1) {
	String result=str+str1;
	
   return result;

}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo t= new TestDemo();
		t.getInfo();
		t.getData(); 
		t.add(10,20);
		t.addString("Srini", "-it-solutions"); 
		int c=t.addition(10, 20);
		System.out.println(c);
		
		String result=t.concatString("Srini", "-it-solutions");
		System.out.println(result);
		
	}

}
