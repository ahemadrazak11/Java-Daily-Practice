package com.java.practice.day36;

public class WrapperClass {

	
		public static void main(String[] args) {
			
			int a = 10; // Primitive Data Type
			
			Integer b = a; // Autoboxing happen here.  Primitive ---> Integer Wrapper Class
			
			
			System.out.println(a);
			System.out.println(b); // unboxing happen here because java does add intValue() method implicitly.
			
			
			Integer ab = Integer.valueOf(20); // it is depricated means it does not uses in new java. but it is valid.
			
			
			Integer x = 20;
			int y = x ; // unboxing
		}
		
}
