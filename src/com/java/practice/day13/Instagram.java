package com.java.practice.day13;

//Create a class called Instagram and declared the data members like username and password 
//make all data member as private and generate getters and setters.

public class Instagram {
	
	private String name;
	private int pass;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		
		this.name = name;
	}
	
	
	public int getPass()
	{
		return pass;
	}
	
	public void setPass(int Pass)
	{
		this.pass = Pass;
	}
	
	public static Instagram CreateConstructor()
	{
		return new Instagram();
	}
	
	public static void main(String[] args)
	{
		Instagram I1 = CreateConstructor();
		
		I1.setName("Ahemad Raza");
		I1.setPass(123);
		
		System.out.println("Username: " + I1.getName());
		System.out.println("Password: " + I1.getPass());
	}

}
