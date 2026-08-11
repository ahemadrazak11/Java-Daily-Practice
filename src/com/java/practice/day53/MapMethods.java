package com.java.practice.day53;

import java.util.*;

public class MapMethods {

		public static void main(String[] args) {
			
			Map<Integer, String> hashMap = new HashMap<>();
			
			Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
			
			Map<Integer, String> treeMap = new TreeMap<>();
			
			hashMap.put(101, "A");
			hashMap.put(102, "B");
			hashMap.put(103, "C");
			
			 System.out.println(hashMap.entrySet());
			 System.out.println(hashMap.replace(101, null));
			 System.out.println(hashMap.entrySet());
			 
			 
			 System.out.println(hashMap.containsValue(null));
			 System.out.println("============ hashMap Elements using entrySet() ==============");
			 
			 for(Map.Entry<Integer, String> entry : hashMap.entrySet())
			 {
				 System.err.println(entry.getKey() + "=>" + entry.getValue());
			 }
			 
			 System.out.println("==================== HashMap ========================");
			 
			 hashMap.put(101, "Ahemad");
			 hashMap.put(102, "Raza");
			 hashMap.put(103, "Khan");
			 
			 System.out.println("entrySet() Method");
			 System.out.println(hashMap.entrySet()); // it return the all the key and value present in the Map.
			 
			 
			 System.out.println("===================== LinkedHashMap =======================");
			 
			 linkedHashMap.put(200, "Abcd");
			 linkedHashMap.put(300, "Hijk");
			 linkedHashMap.put(400,"Xyz");
			 linkedHashMap.put(500, null);
			 // In Map one null key is allowed but we can store multiple null values.
			 // IF try to put null value the existing one replace by another null values at the same place.
			 linkedHashMap.put(null, null);
			 linkedHashMap.put(null, null);
			 
			 System.out.println(linkedHashMap);
			 
			System.out.println("================= Iteration through the entrtySet() =================");
			
			for(Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
				System.out.println(entry.getKey() + "=>" + entry.getValue());
			}
			 
			 
			 
			 
			 
		}
}
