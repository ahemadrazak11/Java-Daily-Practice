package com.java.practice.day52;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
	
	public static void main(String[] args) {
		
		Map<Boolean, String> booleanMap = new HashMap<>();
		booleanMap.put(true, "True Value");
		
		
		System.out.println(booleanMap);
		
		System.out.println("Value at key 'true' is => " + booleanMap.get(true));
		System.out.println("Value at key 'false' is => " + booleanMap.get(false));
	}

}
