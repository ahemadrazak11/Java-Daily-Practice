package com.java.practice.day38;

public class DoubleClass {

	public static void main(String[] args) {
		
		System.out.println("Double Wrapper Class Methods Example,");
		
		Double num = Double.valueOf(100.0); // primitive value assigned to Double Object.
		
		System.out.println(Double.parseDouble("1005.0"));  // converting string into primitive.
		
		System.out.println(num.doubleValue()); // converting Double object into primitive.
		
		System.out.println(num.equals(100.0)); // compare two values.
		
		System.out.println(num.compareTo(20.0)); // compare two values.
		
		System.out.println(Double.compare(100.0, 10.0)); // compare two value static method.
		
		System.out.println(Double.sum(10, 20));
		
		System.out.println(Double.min(20, 10.0));
		
		System.out.println(Double.max(200.0, 10.02));
		
		System.out.println(num.toString());
		
		
		
	}
}
