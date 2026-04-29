package com.java.practice.day4;

import java.util.Scanner;

public class EvenOdd {
	

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = s1.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("The Number is Even");
		}
		else
		{
			System.out.println("The Number is Odd");
		}
		
	}
	
	
}
