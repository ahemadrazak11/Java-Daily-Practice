package com.java.practice.day03;

import java.util.Scanner;

public class IsPrime {
	
	public static boolean isPrime(int num)
	{
		if(num == 2)
		{
			return true;
		}
		
		for(int i = 2; i<=Math.sqrt(num); i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		
		
		return true;
	}

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		int n = 1;
		
		while(n != 0)
		{
			System.out.print("Enter the Number: ");
		    n = s1.nextInt();
		
		if(isPrime(n))
		{
			System.out.println(n + " : is Prime Number");
		}
		else
		{
			System.out.println(n + " : is Not A Prime Number");
		}
		}
		
		
		s1.close();
	}
	
	
}
