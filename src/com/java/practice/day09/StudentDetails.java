package com.java.practice.day09;

public class StudentDetails{

	int id;
	String name;
	int age;
	long mobile;
	static String college = "QSpider";
	
	public StudentDetails(int id, String name, int age, long mobile)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}
	
	public void PrintDetails()
	{
		
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.print("Age: " + age);
		System.out.println("Mobile: " + mobile);
		System.out.println("College: " + college);
		System.out.println("____________________");
		
	}
	
	public static void main(String[] args) {
		
		StudentDetails s1 = new StudentDetails(101, "Student1", 20, 9999);
		StudentDetails s2 = new StudentDetails(102, "Student2", 21, 8888);
		
		s1.PrintDetails();
		s2.PrintDetails();
		
				
	}
	
}
