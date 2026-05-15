package com.java.practice.day26;

public class StringMethods {

	public static void main(String[] args)
	{
		String str1 = "Ahemad";
		String str2 = "Ahemad";
		String str3 = " ";
		String str4 = new String("AHEMAD");
		
		
		// Length / Emptyness Checking Methods.
		System.out.println(str1.length()); // 6		
		System.out.println(str2.length()); // 6		
		System.out.println(str1.isEmpty()); // false		
		System.out.println(str1.isBlank()); // false		
		System.out.println(str3.isEmpty()); // false		
		System.out.println(str3.isBlank()); // true
		
		// Charachter Access Methods.
		
		System.out.println(str1.charAt(0)); // A		
		System.out.println(str1.charAt(2)); // e		
		System.out.println(str1.toCharArray()); // Convert String into char type of Array.
		
		// Comparision		
		System.out.println(str1 == str2); // true ==> comparing references pointing to same string means same address.
		System.out.println(str1 == str4); // false ==> because "==" operator compare the addresses of both string and both are diff.
		System.out.println(str1.equals(str2)); // true		
		System.out.println(str1.equals(str4)); // true
		System.out.println("B".compareTo("A")); // if both equal return 0 , if str1<str2 then return -ve value, if str1>str2 then +ve return
		System.out.println(str1.compareTo(str2)); // if both equal return 0 , if str1<str2 then return -ve value, if str1>str2 then +ve return
		System.out.println(str1.equalsIgnoreCase(str4)); // true ==> because it ignor the casing.
		
		// Searching
	}
}

