package com.srini.threadprograms;

public class ThreadDemo1 extends Thread{
	public void run() {
		System.out.println("run() method called");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 t=new ThreadDemo1();
		Thread t1=new Thread(t);
		t1.start();

	}

}
