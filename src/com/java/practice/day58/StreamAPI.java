package com.java.practice.day58;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		
		// 1. Find Even Number by stream
		
		System.out.println("==================	Even	=======================");
		
		List<Integer> evenList = list.stream()
									 .filter(x -> x % 2 == 0)
									 .toList();
		
					 evenList.forEach(System.out::println);
					 
		// 2. Find Odd number by stream
		System.out.println("====================	Odd	=====================");
					 
		Stream<Integer> oddStream = list.stream()
										.filter(x -> x % 2 != 0);
		
						oddStream.forEach(System.out::println); 
						//here we used the stream and stream get closed means we can not use it again if use then get Exception.
						
						//oddStream.forEach(System.out::println); // through an exception
		
		System.out.println("=======================	Square ==================");
		
		List<Integer> getSquare = list.stream()
									  .map(x -> x * x)
									  .toList();
		
		getSquare.forEach(System.out::println);
		
		
		System.out.println("=======================	Reverse List Assigned to another list ==================");
		
		
		List<Integer> reverseList = List.copyOf(list.reversed());
		
		reverseList.forEach(System.out::println);
		
		
		List<Integer> sortedList = reverseList.stream()
											  .sorted()
											  .toList();
		
		System.out.println("=======================	Sorted List By Stream ==================");
		
					sortedList.forEach(System.out::println);
				
		System.out.println("=======================	Dublicates removed List By Stream ==================");
					
		List<Integer> duplicateList = new ArrayList<>(List.of(1,1,2,3,4,5,5,4,10,11,22,20,19,13,14,11,10,18,6,7,8,9));
		
		List<Integer> uniqueList = duplicateList.stream()
												.distinct()
												.sorted()
												.toList();
		
		uniqueList.forEach(System.out::println);
	}

}
