package com.java.practice.day5;

import java.util.Scanner;

public class Fabonacii {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = s1.nextInt();
		int num1 = 0;
		int num2 = 1;
		int temp = 0;
		int count = 0;
		
		while(count != n)
		{
			if(count == 0)
			{
				System.out.print(0 + " ");
				count++;
			}
			if(count == 1)
			{
				System.out.print(1 + " ");
				count++;
			}
			System.out.print(num1+num2 + " ");
			
			temp = num2;
			num2 = num1 + num2;
			num1 = temp;
			count++;
			
		}
		
	}
}
