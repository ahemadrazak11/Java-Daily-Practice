package com.java.practice.day52;

import java.util.*;

public class SetAndMap {
	
	public static void main(String[] args) {
		
		
		Set<String> str = new HashSet<>();
		
		str.add("Ahemad");
		str.add("Raza");
		str.add("Khan");
		str.add("A");
		str.add("B");
		str.add("Z");
		str.add("ZZ");
		for(String s : str) {
			System.out.println(s);
		}
		
		
		
		Map<Integer, String> i = new HashMap<>();
		i.put(1, "Ahemad");
		i.put(2, "Raza");
		System.out.println(i);
		
		
		
		
		
		
		
		
}
	
}
	