package com.java.practice.day2;
import java.util.Scanner;

public class IsAmstrong {

	
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		int Amst = 1;
		int Num = 0;
		while(Amst != 0)
		{
		System.out.print("Enter the Number : ");
		Num = s1.nextInt();
		
		Amst = Num;
		int count = 0;
		
		while(Num != 0)
		{
			count++;
			Num = Num / 10;
		}
		
		int DigitCount = count;
		int sum = 0;
		Num = Amst;
		while(Num != 0)
		{
			
			sum = sum + (int) Math.pow(Num%10, DigitCount);
			Num = Num / 10;
		}
		
		if(sum == Amst)
		System.out.println(Amst + "  = is a Amstrong Number");
		else
		System.out.println(Amst + " = is not a Amstrong Number");
		}
		s1.close();
		
	}
	
	
}
