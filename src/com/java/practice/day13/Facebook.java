package com.java.practice.day13;
import java.util.Scanner;

public class Facebook {

	private String name;
	private String username;
	private int pass;
	
	// get set name
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	// get set username
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	// get set pass
	public void setPass(int pass)
	{
		this.pass = pass;
	}
	
	public int getPass()
	{
		return pass;
	}
	
	
	
	public static Facebook createCnst()
	{
		return new Facebook();
	}
	
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		Facebook[] arr = new Facebook[3];
		
		for(int i = 0; i<3; i++)
		{
		     arr[i] = createCnst();
		     // set details for the object
		     
		     System.out.print("Enter the the name: ");
		     arr[i].setName(s1.nextLine());
		     System.out.println(" ");
		     
		     System.out.print("Enter the the username: ");
		     arr[i].setUsername(s1.nextLine());
		     System.out.println(" ");
		     
		     System.out.println("Enter the the password: ");
		     arr[i].setPass(s1.nextInt());
		     s1.nextLine();
		}
		
		
		for(int i = 0; i<5; i++)
		{
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getUsername());
			System.out.println(arr[i].getPass());
			System.out.println("-----------------------------");
		}
	}
}
