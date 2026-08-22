package com.java.practice.day55;

import java.util.*;

public class ComparableInterface {
	
	public static void main(String[] args) {
		
		List<Student> s = new ArrayList<>();
		
		s.add(new Student(103, "Abcd"));
		s.add(new Student(101, "Efgh"));
		s.add(new Student(102, "Ijkl"));
		s.add(new Student(105, "wea"));
		
		System.out.println("============= Before Sorting By ID ===========");
		for(Student s1 : s) {
			System.out.println(s1);
		}
		
		Collections.sort(s);
		
		System.out.println("============= After Sorting By ID ===========");
		
		for(Student s1 : s) {
			System.out.println(s1);
		}
		
		
		
		
		
		
		
	}

}


class Student implements Comparable<Student>{
	
	int id;
	String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Student other) {
		
		return this.id - other.id;
		
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}