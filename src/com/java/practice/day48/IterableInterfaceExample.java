package com.java.practice.day48;

import java.util.*;

public class IterableInterfaceExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(Integer num : list) {
			
			System.out.println(num);
		}
		
//		
//		Iterator<Integer> it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}
