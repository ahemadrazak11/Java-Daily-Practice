package com.java.practice.day51;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExamples {

	public static void main(String[] args) {
		
		LinkedList<String> str = new LinkedList<>();
		
		str.add("Ahemad");
		str.add("Raza");
		str.add("Khan");
		str.add("Ibrahim");
		str.add("Khan");
		
		str.addFirst("Qureshi");
		
		str.addLast("Rasul Khan");
		
		str.removeFirst();
		
		str.removeLast();
		
		ListIterator<String> it = str.listIterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("LinkedList First Element: " + str.getFirst());
		
		System.out.println("LinkedList Last Element: " + str.getLast());
		
	}
}
