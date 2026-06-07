package com.java.practice.day38;

public class BooleanClass {

	public static void main(String[] args) {
		
		Boolean bln = true; // internally java add Boolean.valueOf(true);
		
		System.out.println(bln);
		
		Boolean bln1 = Boolean.valueOf(false);
		
		System.out.println(bln1);
		
		System.out.println(bln.booleanValue()); // convert boolean object to primitve;
		
		System.out.println(Boolean.parseBoolean("true")); // String to primitive.
		
		System.out.println(Boolean.compare(false, true)); // return values like -1 0 1
		
		System.out.println("false as String: " + bln1.toString());
	}
}
