package com.java.practice.day39;

import java.util.*;
import java.util.stream.Stream;

public class MapFunction {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		List<Integer> sqrList = list.stream().map(data -> data*data).toList();
		
		System.out.println(sqrList);
	}
}
