package com.java.practice.day54;

import java.util.*;

public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDeque<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		
		q.peek();
		
		System.out.println(q.peek());
	}

}
