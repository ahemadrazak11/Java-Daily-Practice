package com.java.practice.day56;

public class FunctionalProgramming {

	public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Addition: " + add.calculate(10, 5));
        System.out.println("Multiplication: " + multiply.calculate(10, 5));
        System.out.println("Subtraction: " + subtract.calculate(10, 5));
    }
	
}


@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
