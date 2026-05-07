package com.java.practice.day22;

public class EqualsMethod {

	int id;
	String name;
	public EqualsMethod(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Object O)
	{
		EqualsMethod e = (EqualsMethod) O;
		if((this.id == e.id) && this.name.equals(e.name))
		{
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args)
	{
		EqualsMethod eq1 = new EqualsMethod(101, "Ahemad");
		
		EqualsMethod eq2 = new EqualsMethod(101, "Ahemad Raza");
		
		System.out.println(eq1.equals(eq2));
	}
}