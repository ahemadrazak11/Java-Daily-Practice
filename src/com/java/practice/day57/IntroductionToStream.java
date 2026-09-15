package com.java.practice.day57;

import java.util.*;
import java.util.stream.Stream;

public class IntroductionToStream {
	
	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));
		
		
		
		// ways to use Stream
		
		//1 Collection
		
		 list.stream().filter(x -> x > 20).map(x -> x * 2).forEach(System.out::println);
		 
		 System.out.println("==================================================");
		 
		 
		 
		 //2 Collection
		 Stream<Integer> s = list.stream()
				 						.filter(x -> x > 20)
				 						.map(x -> x * 3);
				 						
				 		s.forEach(System.out::println);
	}
	
	

}
