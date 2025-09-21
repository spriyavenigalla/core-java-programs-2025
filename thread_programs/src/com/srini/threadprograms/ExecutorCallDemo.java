package com.srini.threadprograms;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTaskCallable implements Callable <String>{
	public String call() throws Exception {
		System.out.println("call() method is executed");
		return"success";
		
	}
}

public class ExecutorCallDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		MyTaskCallable calls= new MyTaskCallable();
		ExecutorService executorService= Executors.newFixedThreadPool(5);
		for(int i=1; i<=5; i++) {
			Future<String> submit=executorService.submit(calls);
			System.out.println(submit.get());
		}
		executorService.shutdown();
	}

}
