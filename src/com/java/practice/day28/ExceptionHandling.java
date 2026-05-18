package com.java.practice.day28;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a :" );
		int a = sc.nextInt();
		
		System.out.println("Enter the b :");
		int b = sc.nextInt();
		String s = "hi";
		
		try {
			System.out.println(a/b);
			
			System.out.println(s.charAt(3));
		}
		catch(ArithmeticException | NullPointerException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
						
			System.out.println("Exception Occured");
		}
		catch(StringIndexOutOfBoundsException e) // at a time only one catch executed
		{
			System.out.println("String Exception");
		}
		
		System.out.println("Main end");
	}
	
}
