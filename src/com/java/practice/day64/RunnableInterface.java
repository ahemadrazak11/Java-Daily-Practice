package com.java.practice.day64;

public class RunnableInterface {
	
	public static void main(String[] args) {
		
		
		// Task 1 - Create simple thread using Runnable interface which is Functional Interface.
		
		
		
		MyTask task = new MyTask();
		
		Thread t1 = new Thread(task);
		
		t1.start();
		
		
		
		/*
		 * 
		 * 🟢 Task 2 — Print Numbers Goal: Create a thread using Runnable that prints numbers 1 to 5.
		 * 
		 */
		
		Thread t2 = new Thread(() -> {
			
			System.out.println("Task 2 Print Number 1 to 5 by using thread ----------------------------------");
			for(int i = 1; i<=5; i++) {
				System.out.println(i);
			}
		});
		
		t2.start();
		
		
		
		/*
		 * 
		 * 🟡 Task 3 — Print Thread Name Goal: Understand that the code inside run() is executed by the created thread.
		 * 
		 */
		
		
		Thread t3 = new Thread(() -> {
			System.out.println("Task 3 get thread name----------------------------------");
			System.out.println("Thread t3 name = " + Thread.currentThread().getName());	
			
		});
		
		t3.start();
		
		
		/*
		 * 
		 * Task 4: Set the Thread name.
		 * 
		 * */
		
		
		
		Thread t4 = new Thread(() -> {
			
			System.out.println("Task  4 Set thread name----------------------------------");
			Thread.currentThread().setName("Task4-Thread");
			System.out.println("The Thread t4 name is set to = " + Thread.currentThread().getName());
			
		});
		
		t4.start();
		
	}

}


class MyTask implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("Task 1 Create simple thread ----------------------------------");
		System.out.println("The Thread is running");
	}
}