package com.java.practice.day45;

public class StringBulderStringBuffer {

	public static void main(String[] args) {
		
		
		// String
		String str1 = "Ahemad";
		String str2 = "Ahemad";
		System.out.println("String str1 == String str2 ==> " + (str1 == str2)); // true
		//both poiting to the same refrence object because String created in string constant pool.
		
		
		//StringBulder
		StringBuilder strA = new StringBuilder("Ahemad");
		StringBuilder strB = new StringBuilder("Ahemad");
		System.out.println("StringBuilder strA == strB ==> " + (strA == strB)); //false
		// both pointing to the different object reference.
		
		
		//StringBuffer		
		StringBuffer strB1 = new StringBuffer("Raza");
		StringBuffer strB2 = new StringBuffer("Raza");
		System.out.println("StringBuffer strB1 == strB2 ==> " + (strB1 == strB2)); // false
		// both poiting to the different object reference.
		
		// equals() method.
		System.out.println("strA.equals(strB2)" + strA.equals(strB));// false
		System.out.println("strA.equals(strB2)" + strB1.equals(strB2));// false
		// IMP -> StringBuilder does not override the equals method of object class.
		
		strA.append(" Raza");
		System.out.println("After append( Raza): " + strA);
		
		System.out.println("strA.capacity(): " + strA.capacity());
		System.out.println("strA.length(): " + strA.length());
		System.out.println("Reverse method: " + strA.reverse());
		
	}

}
