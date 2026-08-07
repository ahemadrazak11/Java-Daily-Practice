package com.java.practice.day52;

import java.util.*;

public class SetExamples {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println("Set Values => " + set);
		
		System.out.println("=====================");
		System.out.println("HashSet is not maintaining the insertion order.");
		System.out.println("=====================");
		
		for(Integer s : set) {
			
			System.out.println(s);
		}
		
		Set<Integer> set2 = new LinkedHashSet<>();
		
		set2.add(100);
		set2.add(200);
		set2.add(300);
		set2.add(400);
		set2.add(500);
		
		System.out.println("=====================");
		System.out.println("LinkedHashSet is maintaining the insertion order.");
		System.out.println("=====================");
		
		for(Integer s: set2) {
			System.out.println(s);
		}
 	}

}
