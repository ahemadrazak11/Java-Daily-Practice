package com.java.practice.day06;

import java.util.Scanner;

// the perfect square is nothing but the product of it's INTEGER square root is equal to the number

public class PerfectSquare {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = s1.nextInt();
		int root = (int) Math.sqrt(n);	
		
		if(root*root == n)
		{
			System.out.println("It is a pefect square");
			
		}
		else
		{
			System.out.println("It is not a prefect square");
		}
	}	
}
