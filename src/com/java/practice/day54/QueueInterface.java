package com.java.practice.day54;

import java.util.*;

public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDeque<>(5);
		
		q.add(100);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		
		
		
		System.out.println(q.add(70));
		System.out.println(q.peek());
		System.out.println(q.poll());
	}

}
