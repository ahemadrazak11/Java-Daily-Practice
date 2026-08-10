package com.java.practice.day53;

import java.util.*;



public class SetMethods {
	
	public static void main(String[] args) {
		
		Set<String> str = new HashSet<>(); 
		
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("E");
		
		System.out.println(str); 
		// this line print the all values present in side the set 
		// instead of reference because Set Override the toString() method.
		
		System.out.println("the size of Set is: " + str.size());
		
		System.out.println("is empty of not: " + str.isEmpty());
		
		System.out.println("str contains A or not: " + str.contains("A"));
		
		System.out.println("str contains Z or not: " +  str.contains("Z"));
		
		Iterator<String> it = str.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
