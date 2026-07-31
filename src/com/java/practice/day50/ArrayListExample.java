package com.java.practice.day50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		
		for(Integer num : list) {
			
			System.out.println(num);
		}
		
		System.out.println("list size: " + list.size());
		
		
		System.out.println("After Updating,");
		
		list.add(2, 100);
		list.set(0, null);
		list.set(3, 500);
		list.remove(2);
		
		
		
		for(Integer num : list) {
			
			System.out.println(num);
		}
		
		System.out.println("list size after updating: " + list.size());
		
		System.out.println("Index of 50 is : " + list.indexOf(50));
		System.out.println("first index of 40 is : " + list.indexOf(40));
		System.out.println("lat index of 40 is : " +list.lastIndexOf(40));
		
		
		System.out.println("Elements Printed By For Each Loop");
		
		for(Integer l : list) {
			System.out.println(l);
		}
		
		System.out.println("Elements printed by for loop");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Element printed by using iterator,");
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Elements printed by using ListIterator forward direction.");
		
		ListIterator listIt = list.listIterator();
		
		while(listIt.hasNext()) {
			System.out.println(listIt.next());
		}
		
		System.out.println("Elements printed by using ListIterator backward direction.");
		
		while(listIt.hasPrevious()) {
			System.out.println(listIt.previous());
		}
	}
	

}
