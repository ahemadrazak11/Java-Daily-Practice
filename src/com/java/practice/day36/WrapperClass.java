package com.java.practice.day36;

public class WrapperClass {

	
		public static void main(String[] args) {
			
			int a = 10; // Primitive Data Type
			
			Integer b = a; // Autoboxing happen here.  Primitive ---> Integer Wrapper Class
			
			
			//System.out.println(a);
			//System.out.println(b); // unboxing happen here because java does add intValue() method implicitly.
			
			
			Integer ab = Integer.valueOf(20); // it is depricated means it does not uses in new java. but it is valid.
			
			
			Integer x = 20;
			int y = x ; // unboxing
			
			
			// Characteristics of Wrapper Classes.
			// 1. Wrapper class immutable.
			
			Integer i = 20;
			
			//System.out.println(System.identityHashCode(i));
			
			i = 50; // 
			
			//System.out.println(System.identityHashCode(i));
			
			Integer az = 200;
			Integer bz = 200;
			
			//System.out.println(az == bz);	// false
			
			
			Integer cz = 100;
			Integer dz = 100;
			
			//System.out.println(cz == dz); // true
			
			Integer num = 100;
			
			//System.out.println(num);
			
			num = 200;
			//System.out.println(num);
			
			
			System.out.println(Character.isDigit('5'));
			System.out.println(Character.isLetter('A'));
			System.out.println(Character.isLetterOrDigit('.'));

		}
		
}
