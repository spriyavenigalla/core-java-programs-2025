package com.srini.threadprograms;

public class ThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println();
		Thread.currentThread().setName("Srini");
		System.out.println(Thread.currentThread().getName());
		
		

	}

}
