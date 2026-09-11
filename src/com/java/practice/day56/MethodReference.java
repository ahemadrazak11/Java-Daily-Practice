package com.java.practice.day56;

import java.util.*;

import java.util.function.Function;

public class MethodReference {
	
	
	public static int sqaure(int x) {
		
		return x * x;
	}
	
	public static void main(String[] args) {
		
		
		//1. Reference to a Static Method
		
		
		// Lambda Expression
		Function<Integer, Integer> f1 = x -> MethodReference.sqaure(x);
		
		System.out.println("Square By Lambda Expression = " + f1.apply(5));
		
		// Method Reference
		
		Function<Integer, Integer> f2 = MethodReference::sqaure;
		
		System.out.println("Sqaure by Method Reference = " + f2.apply(10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 List<Integer> list = new ArrayList<>(List.of(10,50,30,90,40,60,70,20,80));
		
		Collections.sort(list, (l1, l2)-> l1 - l2); // the sort method accept list and one is Comaprator ka object.
		
//		for(Integer l : list) {
//			
//			System.out.println(l);
//			
//		}
		
//		list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out::println);
		
		
		*/
		
		
	}

}

