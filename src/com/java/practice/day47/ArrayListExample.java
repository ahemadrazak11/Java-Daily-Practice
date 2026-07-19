package com.java.practice.day47;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(); 
		// the list is works only on non primitive data type that's why we use wrapper classes.
		
		list.add(10); // the add method is used to add element in the ArrayList which is present in list object.
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Iterator<Integer> it = list.iterator();
		// iterator method used to iterate the ArrayList which returns Iterator<T> type of data.
		// which is present in the list opbject.
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(list);
	}
}
