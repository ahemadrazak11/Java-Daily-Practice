package com.java.practice.day28;


public class Example3 {

	public static void main(String[] args) {
	
		System.out.println("Main Started");
		String s = "hi";
		
		try {
			System.out.println(s.charAt(3));			
		}
		catch(Exception e)  // using parent type of container for refrence.
		{
			e.printStackTrace();
		}
		
		System.out.println("Main Ended");
	}
	
}

