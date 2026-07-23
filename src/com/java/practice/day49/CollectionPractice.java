package com.java.practice.day49;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPractice {

	public static void main(String[] args) {
		
		/*
		 Question 1

			Create a Collection<Integer> and:
			
			Add 10, 20, 30, 40, 50.
			Print the collection.
			Print the size.
			
			Methods: add(), size()
		 */
		
		System.out.println("Question1:");
		
		Collection<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(Integer num : list) {
			
			System.out.println("list item: " + num);
		}
		
		System.out.println("Size: " + list.size());
		
		
		/*
		 
		 Create a Collection<String> and:

		Add 5 programming languages.
		Check whether "Java" exists.
		Check whether "Python" exists.

		Methods: contains()
		 
		 */
		
		System.out.println("Question2:");
		
		
		Collection<String> l2 = new ArrayList<>();
		
		l2.add("Java");
		l2.add("Python");
		l2.add("Web");
		l2.add("SQL");
		l2.add("C++");
		
		System.out.println("Java exists?: " + l2.contains("Java"));
		System.out.println("Python exists?: " + l2.contains("Python"));
		System.out.println("HTML exists?: " + l2.contains("HTML"));
		
		
		
		/*
		 * Create two collections:

			Add all elements of Collection B into Collection A.

			Print the result.
		 * */
		
		System.out.println("Question3:");
		
		Collection<Integer> listA = new ArrayList<>();
		Collection<Integer> listB = new ArrayList<>();
		
		listA.add(10);
		listA.add(20);
		listA.add(30);
		
		
		listB.add(100);
		listB.add(200);
		listB.add(300);
		listB.add(900);
		
		listA.addAll(listB);
		
//		for(Integer n : listA) {
//			System.out.println("ListA Items: " + n);
//		}
		
		Iterator<Integer> it = listA.iterator();
		
		while(it.hasNext()) {
			System.out.println("ListA Items: " + it.next());
		}
		
	}
}
