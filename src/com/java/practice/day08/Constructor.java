package com.java.practice.day8;

class Account
{
	int id;
	String name;
	long acc;
	String email;
	double bal;
	
	Account(int id, String name, long acc, String email)
	{
		this.id = id;
		this.name = name;
		this.acc = acc;
		this.email = email;
	}
	
	public void deposit(double amt) 
	{
		if(amt > 0)
		{
			bal += amt;
			System.out.println("Deposit Success!");
		}
		else
		{
			System.out.println("Invalid Ammount!");
		}
    }
	
	public void withdraw(double amt)
	{
		if(amt > 0)
		{
			bal -= amt;
			System.out.println("Withdraw Success!");
		}
		else
		{
			System.out.println("Invalid Ammount!");
		}
	}
	
	public void checkBal() 
	{
		System.out.println("Balance: " + bal);
	}
	
}


class Saving extends Account
{
	double roi = 0.5;
	
	Saving(int id, String name, long acc, String email)
	{
		super(id, name, acc, email);
	}
	
	public void Calculate()
	{
		bal = bal + bal * roi;
	}
	
}

class Current extends Account
{
	double minBal = 5000;
	
	Current(int id, String name, long acc, String email)
	{
		super(id, name, acc, email);
	}
	
	public void dispaly()
	{
		System.out.println("Minimum Balance Requaired" + minBal);
		
	}
}


public class Constructor {
	
	public static void main(String[] args)
	{
		Saving S1 = new Saving(101, "Aheamd", 111111, "ahemad@gmail.com");	
		Saving S2 = new Saving(102, "Raza", 222222, "raza@gmail.com");
		
		Current C1 = new Current(103, "Khan", 333333, "khan@gmail.com");
		
		System.out.println("S1 Name: " + S1.name);
		System.out.println("S2 Name: " + S2.name);
		System.out.println("C1 Name: " + C1.name);
		
		S1.deposit(1000);
		C1.checkBal();
		S1.withdraw(1);
		C1.checkBal();
		
	    S1.Calculate();
		System.out.print("Total Ammount + Interest of Saving Account S1:"); S1.checkBal();
		
		
	}
	
}
