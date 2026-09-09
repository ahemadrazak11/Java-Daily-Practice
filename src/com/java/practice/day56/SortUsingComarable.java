package com.java.practice.day56;

import java.util.*;

public class SortUsingComarable {
	
	public static void main(String[] args) {
		
		List<Student1> list = new ArrayList<>();
		
		list.add(new Student1(10, "Ahemad", 50));
		list.add(new Student1(20, "Raza", 10));
		list.add(new Student1(5, "Khan", 40));
		list.add(new Student1(15, "Qureshi", 60));
		
		Collections.sort(list);
		
		for(Student1 s1 : list) {
			System.out.println(s1.roll +" "+ s1.name +" " + s1.marks);
		}
	}

}


class Student1 implements Comparable<Student1>{
	
	int roll;
	String name;
	int marks;
	
	Student1(int roll, String name, int marks){
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public int compareTo(Student1 s) {
		
		return this.marks - s.marks;
	}
}