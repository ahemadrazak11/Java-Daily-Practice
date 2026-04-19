package com.java.practice.day10;

import java.util.Scanner;

public class PrintTrianlge {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		int num = S1.nextInt();
		
		for(int i = 0; i< num; i++)
		{
			for(int j = 0; j<= i; j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
