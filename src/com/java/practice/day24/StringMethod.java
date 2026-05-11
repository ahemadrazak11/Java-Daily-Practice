package com.java.practice.day24;

public class StringMethod {

	public static void main(String[] args)
	{
		String str = " Ahemad ";
		
		System.out.println(str.length());
		
		System.out.println(str.concat( "Raza"));
		
		System.out.println(str.substring(0));
		
		System.out.println(str.substring(0, 5));
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.trim());
		
		//strip remove space at start and end.
		
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(str.equals("Ahemad"));
		
		String str1 = "Raza";
		
		System.out.println(str.hashCode() == str1.hashCode());
		
		String z = "Core Java";
		
		System.out.println(z.contains("J"));
		
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf('z'));
		
		System.out.println(str.replace('A', 'a'));
		
		
		System.out.println(str.repeat(3));
		
		for(int i = str.length() - 1; i > -1 ; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
		
	}
}
