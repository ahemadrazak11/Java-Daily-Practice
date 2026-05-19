package com.java.practice.day29;

public class WrongInputException extends RuntimeException {
	
	public WrongInputException()
	{
		
	}
	
	public WrongInputException(String message){
		super(message);
	}
	
	public static void main(String[] args) {
		int a = 0;
		
		if(a == 0)
		{
			throw new WrongInputException("Wrong Input.......");
		}
		else {
			System.out.println(a);
		}
	}
}


// note: getMessage method is present in Throwable class.