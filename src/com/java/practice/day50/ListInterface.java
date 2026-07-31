package com.java.practice.day50;

import java.util.*;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list.addAll(list2);
		
		list.set(0, null);
		
		
		
		ListIterator<Integer> it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("At 0 index " + list.get(0));
		
		
 	}
	
	

}
