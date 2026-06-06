package com.java.practice.day37;

public class IntegerClass {

	public static void main(String[] args)
	{
		
		
		System.out.println(Integer.parseInt("123")); // String to Primitive
		
		//Integer num = 10; ---> we can write this but internally java add following method.
		Integer num = Integer.valueOf(20); // Converting value into Integer Object
		
		System.out.println("num  ==> " + num);
		
		System.out.println("num.intValue()  ==> " + num.intValue()); // Converting Integer object into corresponding primitive data type.
		
		System.out.println(Integer.max(20, 10));
		
		System.out.println(Integer.min(20, 30));
		
		System.out.println(Integer.sum(10, 20));
		
		System.out.println("Integer.compare(10, 50) ==> " + Integer.compare(10, 50));
		
		System.out.println("num.equals(20) ==> " + num.equals(20));
		
		System.out.println(Integer.toString(123)); // Converting value into string.
		
		num = 10;
		
		System.out.println(num.compareTo(10)); // return 0 because num is equal to 10 is true
		
		System.out.println(num.compareTo(20)); // return -1 because num is less than 20 is true
		
		System.out.println(num.compareTo(5)); // return 1 because num is grate than 5 is true
		
		
		
		
		
	}
}
