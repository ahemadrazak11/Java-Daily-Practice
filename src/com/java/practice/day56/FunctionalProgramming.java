package com.java.practice.day56;

public class FunctionalProgramming {

	public static void main(String[] args) {
		
		

		// this is addition operation using lambda expression
        Calculator add = (a, b) -> a + b;
        
        
        // this is multiplication operation using lambda expression
        Calculator multiply = (a, b) -> a * b;
        
        // this is subtraction operation using lambda expression
        Calculator subtract = (a, b) -> a - b;
        
     // this is Division operation using lambda expression
        Calculator div = (a, b) -> a / b;
        
        
        System.out.println("A = " + 10 +" " + "B = " + 5);
        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Multiplication: " + multiply.calculate(10, 5));
        System.out.println("Subtraction: " + subtract.calculate(10, 5));
        System.out.println("Division: " + div.calculate(10, 5));
        
    }
	
}


@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
