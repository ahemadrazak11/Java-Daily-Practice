package com.java.practice.day56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparator {
	
	public static void main(String[] args) {
		
List<Student> list = new ArrayList<>();
		
		list.add(new Student(10, "Ahemad", 50));
		list.add(new Student(20, "Raza", 10));
		list.add(new Student(5, "Khan", 40));
		list.add(new Student(15, "Qureshi", 60));
		
		Comparator<Student> c1 = new SortByRoll();
		
		
		System.out.println("Sort By Roll Number.");
		Collections.sort(list, c1);
		
		for(Student s1 : list) {
			
			System.out.println(s1.rollNo + " " + s1.name + " " + s1.marks);
		}
		
		System.out.println("================================================");
		
		Comparator<Student> c2 = new SortByName();
		
		Collections.sort(list, c2);
		
		System.out.println("Sort By Name.");
		
		for(Student s1 : list) {
			
			System.out.println(s1.rollNo + " " + s1.name + " " + s1.marks);
		}
		
		System.out.println("================================================");
		
		Comparator<Student> c3 = new SortByMarks();
		Collections.sort(list, c3);
		System.out.println("Sort By Marks.");
		for(Student s1 : list) {
			
			System.out.println(s1.rollNo + " " + s1.name + " " + s1.marks);
		}
		
		
	}

}


class Student{
	
	int rollNo;
	String name;
	int marks;
	
	Student(int rollNo, String name, int marks){
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
}


class SortByRoll implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.rollNo - s2.rollNo;
	}
}


class SortByName implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.name.compareTo(s2.name);
	}	
}


class SortByMarks implements Comparator<Student>{
	
	@Override
	public int compare(Student s1, Student s2) {
		return s1.marks - s2.marks;
	}
}