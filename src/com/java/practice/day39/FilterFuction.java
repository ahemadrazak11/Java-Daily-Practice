package com.java.practice.day39;

import java.util.*;
public class FilterFuction {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
		
		List<Integer> evenList = list.stream().filter(data -> data%2 == 0).toList();
		
		System.out.println(evenList);
	}
}
