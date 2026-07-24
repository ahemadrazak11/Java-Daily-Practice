package com.java.practice.day49;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 Create a Student Collection:
  		 class Student {
		
		    int id;
		
		    String name;
		
		}
		
		Perform these operations:		
		Add 5 students.		
		Display all students.		
		Check whether a student exists.		
		Remove one student.		
		Print the total number of students.		
		Clear the collection.		
		Check whether it is empty.
		 */
		
		
		Collection<Student> student = new ArrayList<>();
		
		Student s1 = new Student(101, "Ahemad");
		Student s2 = new Student(102, "Raza");
		Student s3 = new Student(103, "Khan");
		Student s5 = new Student(105, "Abcd");
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		for(Student s : student) {
			System.out.println(s);
		}
		
		System.out.println("s1 student is present in a list or not: " + student.contains(s1));
		System.out.println("s5 student is present in a list or not: " + student.contains(s5));
		
		student.remove(s2);
		
		System.out.println("After Removing Student s2 from list.");
		for(Student s : student) {
			System.out.println(s);
		}
		
		System.out.println("Total Number of Student" + student.size());
		
		student.clear();
		
		System.out.println("Studetn Collection is Empty or Not: " + student.isEmpty());
		
	}

}

class Student{
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	int id;
	String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
