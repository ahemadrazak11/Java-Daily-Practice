package com.java.practice.day19;

/*

                         +----------------------------+
                         |        BankAccount         |  <<abstract>>
                         +----------------------------+
                         | - accountNumber : int      |
                         | - holderName   : String    |
                         | - balance      : double    |
                         +----------------------------+
                         | + deposit(amount: double)  |
                         | + withdraw(amount: double) |
                         | + display()                |
                         | + calculateInterest() : double <<abstract>> |
                         +----------------------------+
                                      ▲
                 ┌────────────────────┼────────────────────┐
                 │                                         │
   +---------------------------+        +---------------------------+
   |     SavingsAccount        |        |     CurrentAccount        |
   +---------------------------+        +---------------------------+
   | - interestRate : double   |        | - overdraftLimit : double |
   +---------------------------+        +---------------------------+
   | + calculateInterest()     |        | + calculateInterest()     |
   | + withdraw(amount)        |        | + withdraw(amount)        |
   +---------------------------+        +---------------------------+

                                      ▲
                                      |
                         +----------------------------+
                         |       Transaction          |  <<interface>>
                         +----------------------------+
                         | + transfer(amount: double, |
                         |   from: BankAccount,       |
                         |   to: BankAccount)         |
                         +----------------------------+

                                      ▲
                                      |
                         +----------------------------+
                         |     BankService            |
                         +----------------------------+
                         | + transfer(...)            |
                         +----------------------------+

                                      ▲
                                      |
                         +----------------------------+
                         |           User             |
                         +----------------------------+
                         | - name : String           |
                         +----------------------------+
                         | + performTransaction()    |
                         +----------------------------+
*/




abstract class BankAccount{
	
	private int accountNumber;
	private String holderName;
	private double balance;
	
	
	
	
	
	public abstract void  withdraw(double amount);
	
	public abstract double calculateInterest();
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			
			System.out.println("Deposit Suucess: " + amount);
		}
		else
		{
			System.out.println("Invalid Amount...");
		}
	
	}
	
	public void display()
	{
		System.out.println("Balance: " + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}


class SavingsAccount extends BankAccount
{
	private double interestRate = 5.0 ;
	
	SavingsAccount(double balance)
	{
		setBalance(balance);
	}
	
	@Override
	public void  withdraw(double amount)
	{
		if(amount > 0 && amount <= getBalance())
		{
			
			setBalance(getBalance() - amount);
			System.out.println("Withdrawn " + amount + " from SavingsAccount");
			
		}
		else
		{
			System.out.println("Invalid Amount..");
		}
	}
	
	@Override
	public double calculateInterest()
	{
		return (getBalance() * interestRate) / 100;
	}
}




class CurrentAccount extends BankAccount{
	
	private double overdraftLimit = 5000;
	
	CurrentAccount(double amount)
	{
		setBalance(amount);
	}
	
	@Override
	public void  withdraw(double amount)
	{
		
		if(amount > 0 && (getBalance() - amount) >= -overdraftLimit)
		{
			
			setBalance(getBalance() - amount);
			System.out.println("Withdrawn " + amount + "from CurrentAccount");
		}
		else
		{
			System.out.println("Invalid Amount..");
		}
	}
	
	@Override
	public double calculateInterest()
	{
		return 0;
	}
}


interface Transaction
{

	void transfer(double amount, BankAccount from, BankAccount to);
}

class BankService implements Transaction
{
	@Override
	public void transfer(double amount, BankAccount from, BankAccount to)
	{
		from.withdraw(amount);
		to.deposit(amount);
		
		System.out.println("Transaction Completed: " + amount);
	}
}

class User{
	
	private String name;
	
	
	
	void performTransaction(Transaction t, BankAccount from,  BankAccount to, double amount)
	{
		t.transfer(amount, from, to);
	}
	
}


public class MainBank {

	public static void main(String[] args)
	{
		BankAccount s1 = new SavingsAccount(5000);
		
		BankAccount c1 = new CurrentAccount(10000);
		
		Transaction tr = new BankService();
		
		User u1 = new User();
		
		u1.performTransaction(tr, s1, c1, 1000);
		
		s1.display();
		c1.display();
	
	}
	
	
}
