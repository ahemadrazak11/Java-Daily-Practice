package com.java.practice.day60;

import java.util.*;



public class ParallelStreamExample {

	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
		
		list.parallelStream()
			.forEach(System.out::println); // it print as per thread reach ordered not maintaned
		System.out.println("====================================================");
		list.parallelStream()
		.forEachOrdered(System.out::println); // it will maintained the ordered.
		
	}
}
