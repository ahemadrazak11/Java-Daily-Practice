package com.java.practice.day4;

import java.util.Scanner;

public class Factorial {
	
	public static int factorialOfNum(int num)
	{
		int fact = 1;
		while(num != 0)
		{
			fact = fact * num--;
		}
		
		
		return fact;
	}

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		int n = 1;
		do
		{
		System.out.println("Enter the Number: ");
		 n = s1.nextInt();
		
		int result = factorialOfNum(n);
		
		System.out.println(result);
		}while(n != 0);
	}
	
	
}
