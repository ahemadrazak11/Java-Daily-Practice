package com.java.practice.day06;

import java.util.Scanner;

// the perfect number is nothing but the total sum of it's divisible number excluding itself is equal to itself.

public class PerfectNum {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = s1.nextInt();
		int sum = 0;
		for(int i = 1; i<n; i++)
		{
			if(n % i == 0)
			{
				sum = sum + i;
			}
		}	
		
		if(sum == n)
		{
			System.out.println("The Number is pefect");
			
		}
		else
		{
			System.out.println("The Number is not prefect");
		}
	}	
}
