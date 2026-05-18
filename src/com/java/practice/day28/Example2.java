package com.java.practice.day28;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a :" );
		int a = sc.nextInt();
		
		System.out.println("Enter the b :");
		int b = sc.nextInt();
		String s = "hi";
		
		try {
			System.out.println(s.charAt(3));			
		}
		catch(ArithmeticException e) 
		{
						
			System.out.println("Arithmetic Exception");
		}
		catch(NullPointerException e) 
		{
			
			System.out.println("Null Pointer Exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Fomrat Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Exception");
		}
		catch(StringIndexOutOfBoundsException e) // at a time only one catch executed
		{
			System.out.println("String Index Exception");
		}
		
		System.out.println("Main end");
	}
	
}
