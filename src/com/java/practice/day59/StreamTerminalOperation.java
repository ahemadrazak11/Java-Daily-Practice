package com.java.practice.day59;

import java.util.*;
import java.util.stream.Collectors;


public class StreamTerminalOperation {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10, 20, 30, 40);

		List<Integer> result = list.stream()
		        .filter(n -> n > 20)
		        .map(x -> x * 2)
		        .collect(Collectors.toList());

		System.out.println(result);
	}

}
