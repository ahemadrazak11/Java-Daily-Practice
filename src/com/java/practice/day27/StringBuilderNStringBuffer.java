package com.java.practice.day27;

public class StringBuilderNStringBuffer {

	public static void main(String[] args)
	{
		StringBuilder sb1 = new StringBuilder("Ahemad"); // string builder does not override the equals method that is why it compare addresses.  (IMP interview)
		
		StringBuilder sb2 = new StringBuilder("Ahemad");
		
		System.out.println(sb1.equals(sb2)); // false		
		
		
		System.out.println(sb1.capacity()); // 6 (Ahmead) + 16 ==> 22
		sb1.trimToSize();
		System.out.println(sb1.capacity()); // 6
	}
}
