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
		}
}
