package com.java.practice.day39;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
		
		List<Integer> evenList = list.stream().filter(data -> data%2 == 0).toList();
		
		Integer sum = list.stream().filter(data -> data%2 == 0).map(data -> data*data).reduce((a, b) -> a+b).orElse(0);
		
		System.out.println(list);
		System.out.println(evenList);
		System.out.println(sum);
	}
	
}
