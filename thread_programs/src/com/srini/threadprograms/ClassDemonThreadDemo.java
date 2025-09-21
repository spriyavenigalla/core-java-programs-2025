package com.srini.threadprograms;



class DemonThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Thread is not daemon");
		}
	}
}

public class ClassDemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Main-Srini");
		System.out.println(Thread.currentThread().getName());
		DemonThread t= new  DemonThread();
		t.setDaemon(true);
		t.start();
	}

}
