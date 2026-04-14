package com.java.practice.day7;
import java.util.Scanner;

public class FaboNthDigit {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		int a = 0; 
		int b = 1; 
		int c = 0;
		System.out.println("Fabonacii Series");
		System.out.print("enter the number for Nth digit: ");
		int num = s1.nextInt();
		int i = 1;
		
		if(num == 1)
		{
			c = 0;
		}
		else
		{
		do
		{			
			a = b;
			b = c;
			c = a+b;
			i++;
	
		}while(i<num);
		}
		
		System.out.println("Nth digit is : " + c);
			
		
	}
}