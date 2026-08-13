package com.java.practice.day54;

import java.util.*;

public class ArrayDequeStack {
	
	public static void main(String[] args) {
		
		Deque<Integer> stack  = new ArrayDeque<>();
		
		System.out.println("LIFO");
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.addFirst(40);
		stack.addFirst(50);
		
		for(Integer i : stack) {
			System.out.println(i);
		}
		
		System.out.println("Top Element Return: " + stack.peek()); // only return the top element of stack.
		
		System.out.println("Top Element Return and  Remove" + stack.pollFirst()); // return the top element of stack and remove
		
		System.out.println("Top Element Return and Remove" + stack.poll()); // return the top element of stack and remove
		System.out.println("Top Element Return and Remove" + stack.poll());
		System.out.println("Top Element Return and Remove" + stack.poll());
		System.out.println("Top Element Return and Remove" + stack.poll());
		
		
		
		
		System.out.println("Stack is Empty: " + stack.isEmpty());
		
		System.out.println("Return the Top Element: " + stack.peek());
		System.out.println("Return the Top Element: " + stack.peekFirst());
		System.out.println("Top Element Return and Remove: " + stack.poll()); // return null because stack is empty.
		System.out.println("Top Element Return and Remove: " + stack.removeFirst()); // exception.
	}

}
