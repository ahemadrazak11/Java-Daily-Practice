package com.java.practice.day30;
import java.util.Scanner;

// program to make cutome exceptions for voter.

class VoterUnderAgeException extends RuntimeException{

	public VoterUnderAgeException()
	{
		
	}
	
	public VoterUnderAgeException(String message) {
		super(message);
	}
}

class VoterAboveAgeException extends RuntimeException{

	public VoterAboveAgeException()
	{
		
	}
	
	public VoterAboveAgeException(String message) {
		super(message);
	}
}

public class VoterAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age: ");
		
		int age = sc.nextInt();
		sc.close();
		try {
			
			
				if(age < 18) {
					throw new VoterUnderAgeException("Voter not eligible.");
				}
				else if(age > 75)
				{
					throw new VoterAboveAgeException("Voter above the age.");
				}
				else {
					System.out.println("Voter eligible for voting.");
				}
		
		
		
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		System.out.println("Main Ended.");
		
		
		System.exit(0); // it used to exit or terminate execution in any setuation even finally block not executed.
		
	}
}
