package com.java.practice.day11;

import java.util.Scanner;

public class String2Int {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int num = Integer.parseInt(str);
		
		if(num == 4)
		{
			System.out.println("String to int conveerted.");
		}
		
	}
	
	
}
