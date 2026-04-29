package com.java.practice.day16;


// write java program and achieved abstraction.

class Cat implements Animal{
	
	@Override
	public void Voice()
	{
		System.out.println("Cat Voice...");
	}
	
	@Override
	public void Speed()
	{
		System.out.println("Cat Speed...");
	}
}

class Dog implements Animal{
	
	@Override
	public void Voice()
	{
		System.out.println("Dog Voice...");
	}
	
	@Override
	public void Speed()
	{
		System.out.println("Dog Speed...");
	}
}


public class Driver {
	
	//  helper function for Cat object and return reference.
	public static Cat catObject()
	{
		return new Cat();
	}
	
	// helper function for dog object and return reference.
	public static Dog dogObject()
	{
		return new Dog();
	}

	public static void main(String[] args)
	{
		Animal c1 = catObject();
		
		c1.Speed();// go to animal and the take implementation from Cat implementation class.
		c1.Voice();
		
		Animal d1 = dogObject();
		
		d1.Speed(); // go to animal and take implementation from Dog implementation class
		d1.Voice();
	}
}
