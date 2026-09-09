package com.java.practice.day56;

import java.util.*;

public class SortByAnynomusClass {
	
	public static void main(String[] args) {
		
		List<StudentClass> list = new ArrayList<>();
		
		list.add(new StudentClass(1, "A", 55));
		list.add(new StudentClass(5, "C", 44));
		list.add(new StudentClass(4, "B", 40));
		list.add(new StudentClass(2, "D", 66));
		list.add(new StudentClass(3, "E", 75));
		
		
//		Collections.sort(list, new Comparator<StudentClass>(){
//			
//			@Override
//			public int compare(StudentClass s1, StudentClass s2) {
//				
//				return s1.rollNo - s2.rollNo;
//			}
//		});
		
		
//		for(StudentClass s : list) {
//			
//			System.out.println(s.rollNo + " " + s.name + " " + s.marks);
//		}
		
		Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));
		
		// printing using for each loop with lambda expression.
		list.forEach((n) -> System.out.println(n.rollNo + " " + n.name + " " + n.marks));
	}
	
	

}


class StudentClass{
	
	int rollNo;
	String name;
	int marks;
	
	
	public StudentClass(int rollNo, String name, int marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		
	}
}