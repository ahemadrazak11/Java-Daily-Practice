package com.java.practice.day54;

import java.util.*;

public class QueueInterface {
	
	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDequeStack<>();
		
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		System.out.println(q);
	}

}

/*
output:

[10, 20, 30, 40]
10
10
20
[30, 40]

*/
	
	