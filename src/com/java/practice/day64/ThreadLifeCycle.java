package com.java.practice.day64;

public class ThreadLifeCycle {
	
	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		Thread t1 = new Thread(() -> {
			
			
			System.out.println("Thread name is = " + Thread.currentThread().getName());
			System.out.println("MainThread Current State = " + mainThread.getState());
		});
		
		// the state of Thread are NEW RUNNABLE TERMINATED.
			
		System.out.println("Thread Current State = " + t1.getState());
	
		t1.start();
		
		try {
			
			// here we stop the main thread execution hence we canget TIME_WAITING 
			Thread.sleep(5000); // here we stop or sleep the main thread execution till 2 seconds.			
		}
		catch(Exception e){			
		}
		System.out.println("Thread Current State = " + t1.getState());
	}

}
