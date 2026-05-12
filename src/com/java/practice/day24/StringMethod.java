package com.java.practice.day24;

public class StringMethod {

	public static void main(String[] args)
	{
		String str = " ahemad ";
		
		// the length() function gives the length of string
		System.out.println("str.length() " + str.length());
		
		// the concat() function add the two string
		System.out.println("str.concat( \"Raza\") " + str.concat( "Raza"));
		
		// the substring() function gives the sub string from given index
		System.out.println("str.substring(2) " + str.substring(2));
		
		// the substring(int, int) function gives the string within a range.
		System.out.println("str.substring(0, 2) " + str.substring(2, 7));
		
		//the charAt() function give the charechtar at given index index
		System.out.println("str.charAt(5) " + str.charAt(5));
		
		
		// this function used to removw satring and ending space.
		System.out.println("str.trim() " + str.trim());
		
		// this function also used to remove satring and ending space.
		System.out.println("str.strip() " + str.strip());
		
		// this function used to remove satring space.
		System.out.println("str.stripLeading() " + str.stripLeading());
		// this function used to remove ending space.
		System.out.println("str.stripTrailing() " + str.stripTrailing());
		
		
		// this function used to check the string is empty or  not return true false
		System.out.println("str.isEmpty() " + str.isEmpty());
		
		// this function used to check the string is blank or  not return true false
		System.out.println("str.isBlank() " + str.isBlank());
		
		// this function used to check the string is equal to other string or  not return true false
		System.out.println(" str.equals(\"Ahemad\") " + str.equals("Ahemad"));
		
		String str1 = "Raza";
		
		System.out.println(str.hashCode() == str1.hashCode());
		
		String z = "Core Java";
		
		System.out.println(z.contains("J"));
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('z'));
		
		System.out.println(str.replace('A', 'a'));
		
		
		System.out.println(str.repeat(3));
		
		for(int i = str.length() - 1; i > -1 ; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
		
	}
}
