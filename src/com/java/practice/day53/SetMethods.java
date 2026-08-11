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
		str.add("Ahemad");
		str.add("Raza");
		
		System.out.println(str); 
		// this line print the all values present in side the set 
		// instead of reference because Set Override the toString() method.
		
		System.out.println("the size of Set is: " + str.size());
		
		System.out.println("is empty of not: " + str.isEmpty());
		
		System.out.println("str contains A or not: " + str.contains("A"));
		
		System.out.println("str contains Z or not: " +  str.contains("Z"));
		
		
		System.out.println("=============== the iteration through the for each loop ==================");
		
		for(String s : str) {
			System.out.println(s);
		}
		
		System.out.println("=================================");
		
		System.out.println("=============== the iteration through the iterator() method ==================");
		
		Iterator<String> it = str.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("=================================");
		
		// In Set only one null value allowed because interanlly it use the Map.
		// Map is stored the data in key value paire. In Map for Set the Key consider as a Set value and it should be unique.
		// when we try to add multiple null values it get replace with existing null values that's why not getting errror.
		str.add(null); 
		str.add(null);
		
		
	}

}
