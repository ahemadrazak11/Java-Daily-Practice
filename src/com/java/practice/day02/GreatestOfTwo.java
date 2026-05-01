package com.java.practice.day02;

import java.util.Scanner;

public class GreatestOfTwo {

	public static void main(String[] args)
	{
		Scanner S1 = new Scanner(System.in);
		
		System.out.print("Enter A : ");
		int a = S1.nextInt();
		System.out.print("Enter B : ");
		int b = S1.nextInt();
		
		if(a>b)
			System.out.println("A is Greater : " + a);
		else
			System.out.println("B is Greater : " + b);
	}
}
