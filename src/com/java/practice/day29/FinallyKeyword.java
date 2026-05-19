package com.java.practice.day29;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		String str = null;
		
		try {
			System.out.println(a / b);
		}
		catch(Exception e) {
			
			e.printStackTrace(); // it is used to identify which exception occured.
			System.out.println("Exception Occured");
		}
		finally {
			// finally block is used to execute statement even exception occured.
			
			System.out.println("Finally Block started");
			
			// the exception occured in finally block is also handled
			try
			{
				System.out.println(str.toUpperCase());
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("NullPointerException Occured");
			}
		}
	}
}
