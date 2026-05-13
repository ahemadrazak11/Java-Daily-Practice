package com.java.practice.day25;

public class StringClass {

	public static void main(String[] args)
	{
		String str1 = new String("Ahemad");
		String str2 = new String("Ahemad");
		
		System.out.println(str1 == str2); // false because new keyword create new object and it stored in heap memory and compaire addresses.
		
		
		String str3 = "Ahemad";
		String str4 = "Ahemad";
		
		System.out.println(str3 == str4); // true because the string is created in string pool and targeting same string means same address.
		
		
		String str6 = "Java";
		String str7 = str6 + "Script";
		
		System.out.println(str7);
		
		str7 = str7.concat(" Language");
		
		System.out.println(str7);
		
		
		
	}
	
}
