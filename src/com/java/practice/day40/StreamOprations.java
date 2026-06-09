package com.java.practice.day40;

import java.util.*;

public class StreamOprations {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(1, 10, 5, 6, 6, 8, 8));
		
		List<Integer> s = list.stream().sorted().toList();
		
		List<Integer> customSort = list.stream().sorted((a, b) -> b - a).toList();
		
		Integer sum = list.stream().mapToInt(data -> data).sum();
		
		// IntSummaryStatistics
		
		System.out.println(list);
		System.out.println(s);
		System.out.println(customSort);
		System.out.println(sum);
	}
}
