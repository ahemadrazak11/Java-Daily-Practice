package com.java.practice.day23;

public class ObjectClassMethods {

	int id;
	String name;
	
	public ObjectClassMethods()
	{
		
	}
	
	
	public ObjectClassMethods(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	//toString method overriding
	
	public String toString()
	{
		return "[ ID: " + id + " Name: " + name + "]";
	}
	
	//equals method overriding
	public boolean equals(Object o)
	{
		ObjectClassMethods s = (ObjectClassMethods) o;
		
		if(this.id == s.id && this.name.equals(s.name))
		{
			return true;
		}
		return false;
	}
	
//	//hashCode method overriding
//	public int hashCode()
//	{
//		return id + (int)Integer.parseInt(name);
//	}
	

	public static void main(String[] args)
	{
		ObjectClassMethods Obj1 = new ObjectClassMethods(101, "Ahemad");
		
		ObjectClassMethods Obj2 =new ObjectClassMethods(102, "Ahemad");
		
		System.out.println(Obj2.equals(Obj1)); // false
		
		System.out.println(Obj1.toString()); // [ ID: 101 Name: Ahemad]
		System.out.println(Obj2.toString()); // [ ID: 102 Name: Ahemad]
		
		
	}
}
