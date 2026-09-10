package com.java.practice.day56;

import java.util.*;

public class MethodReference {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(10,50,30,90,40,60,70,20,80));
		
		Collections.sort(list, (l1, l2)-> l1 - l2); // the sort method accept list and one is Comaprator ka object.
		
//		for(Integer l : list) {
//			
//			System.out.println(l);
//			
//		}
		
//		list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out::println);
		
		
		
	}

}
