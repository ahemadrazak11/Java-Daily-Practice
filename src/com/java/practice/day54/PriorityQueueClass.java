package com.java.practice.day54;

import java.util.*;


public class PriorityQueueClass {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}

}
