package com.java.practice.day5;

import java.util.Scanner;

public class FabNthDigit {
	
	public static int Fabo(int num)
	{
		if(num<=1)
		{
			return num;
		}
		
		return Fabo(num - 1) + Fabo(num - 2);
	}

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = s1.nextInt();
		
		for(int i = 0; i<=n; i++)
		System.out.print(Fabo(i) + " ");
		
	}
}
