package com.java.practice.day31;

public class ThrowsException {

	public static int div(int a, int b) throws ArithmeticException {
		
		return a / b;
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			div(a, b);
		}catch(Exception e)
		{
			System.out.println("the input is wrong ArithmeticException");
		}
		
		
		
		System.out.println("Main Ended");
		
	}
}
