package com.srini.threadprograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnableTask implements Runnable{
private String taskName;
MyRunnableTask(String Name){
	this.taskName= Name;
}

public void run() {
	System.out.println(taskName+"is running by"+Thread.currentThread().getName());
}
}
public class ExecutorThradDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor= Executors.newFixedThreadPool(2);
		executor.execute(new MyRunnableTask("Task-1"));
		executor.execute(new MyRunnableTask("Task-2"));
		executor.execute(new MyRunnableTask("Task-3"));
		executor.execute(new MyRunnableTask("Task-4"));
		executor.execute(new MyRunnableTask("Task-5"));
		
		

	}
}

