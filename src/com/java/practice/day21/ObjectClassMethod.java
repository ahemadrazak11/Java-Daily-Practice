package com.java.practice.day21;

public class ObjectClassMethod {

	int ram;
	int rom;
	
	// Constructor Overloading
	
	ObjectClassMethod()
	{
		
	}
	
	ObjectClassMethod(int ram, int rom)
	{
		this.ram = ram;
		this.rom = rom;
	}
	
	// m1() method can access by using Object name with dot (.) method name.
	public void m1()
	{
		System.out.println("This is M1 method of MyObjectClassMethod");
	}
	
	// Obeject Class method toString() is Override.
	@Override
	public String toString() {
		
		return "[ RAM : " + ram + " , " + " ROM : " + rom + " ]";
	}

	
	public static void main(String[] args)
	{
		ObjectClassMethod[] ObjArr = new ObjectClassMethod[4];
		
		ObjArr[0] = new ObjectClassMethod(10, 20);
		
		ObjArr[1] = new ObjectClassMethod(30, 40);
		
		ObjArr[2] = new ObjectClassMethod(50, 60);
		
		ObjArr[3] = new ObjectClassMethod(70, 80);
		
		for(int i = 0; i < ObjArr.length; i++)
		{
			System.out.println(ObjArr[i]);
		}
		
		new ObjectClassMethod().m1();
		
	}
}
