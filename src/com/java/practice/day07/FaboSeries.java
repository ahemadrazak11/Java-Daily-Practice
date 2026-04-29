package com.java.practice.day7;
import java.util.Scanner;

public class FaboSeries {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		int a = 0; 
		int b = 1; 
		int c = 0;
		
		System.out.println("Fabonacii Series");
		System.out.print("enter how many digits you want to print: ");
		int num = s1.nextInt();
		int i = 0;
		while(i<num)
		{
			System.out.print(c + " ");
			
			a = b;
			b = c;
			c = a+b;
			i++;
	
		}
			
		
	}
}
