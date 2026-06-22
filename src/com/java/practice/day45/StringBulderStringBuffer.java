package com.java.practice.day45;

public class StringBulderStringBuffer {

	public static void main(String[] args) {
		
		
		String str1 = "Ahemad";
		
		String str2 = "Ahemad";
		
		System.out.println("String str1 == String str2 ==> " + (str1 == str2));
		
		StringBuilder strA = new StringBuilder("Ahemad");
		StringBuilder strB = new StringBuilder("Ahemad");
		
		
		System.out.println("StringBuilder strA = " + strA);
		System.out.println("StringBuilder strB = " + strB);
		
		System.out.println("strA == strB ==> " + (strA == strB)); // both pointing to the same object reference.
		
		
	}

}
