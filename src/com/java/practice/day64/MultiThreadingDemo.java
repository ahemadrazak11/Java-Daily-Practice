package com.java.practice.day64;

public class MultiThreadingDemo {
	
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		
		
		// thread using Runnable interface which is Functional Interface whose containe only one abstract method.
		Thread t2 = new Thread(() -> {
			
			for(int i = 0; i<=10; i++) {
				System.out.println("t2 => " + i);
			}
			
		});
		
		
		
		t2.start();
		t1.start();
	}

}

class MyThread extends Thread{
	
	int count = 1;
	@Override
	public void run() {
		System.out.println("Thread is Running...");
	}
}
