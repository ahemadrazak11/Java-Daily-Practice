package com.java.practice.day20;


class Account{
	
	private String name;
	private long accno;
	private double bal;
	
	public Account(String name, long accno)
	{
		this.name = name;
		this.accno = accno;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
}


// Transaction Class

class Transaction{
	
	public void deposit(double amt, Account ref)
	{
		if(amt > 0)
		{
			ref.setBal(ref.getBal() + amt);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdraw(double amt, Account ref)
	{
		if(amt <= ref.getBal() && amt > 0)
		{
			ref.setBal(ref.getBal() - amt);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	
	public void checkBal(Account ref)
	{
		System.out.println("Balance: " + ref.getBal());
	}
}


// interface BankUser

interface BankUser
{
	public void transaction(double amt, Account ref, int choice);
}

// ATM Class

class Atm implements BankUser{
	
	Transaction t = new Transaction();
	
	@Override
	public void transaction(double amt, Account ref, int choice)
	{
		if(choice == 1)
		{
			t.deposit(amt, ref);
			System.out.println("Deposite By ATM");
		}
		else if(choice == 2)
		{
			t.withdraw(amt, ref);
			System.out.println("Withdraw By ATM");
		}
		else if(choice == 3)
		{
			t.checkBal(ref);
			System.out.println("Balanced Checked By ATM");
		}
	}
}

// PhonePay Class

class PhonePay implements BankUser{
	
	Transaction t = new Transaction();
	
	@Override
	public void transaction(double amt, Account ref, int choice)
	{
		if(choice == 1)
		{
			t.deposit(amt, ref);
			System.out.println("Deposite By PhonePay");
		}
		else if(choice == 2)
		{
			t.withdraw(amt, ref);
			System.out.println("Withdraw By PhonePay");
		}
		else if(choice == 3)
		{
			t.checkBal(ref);
			System.out.println("Balanced Checked By PhonePay");
		}
	}
}

// GPay Class

class Gpay implements BankUser{
	
	Transaction t = new Transaction();
	
	@Override
	public void transaction(double amt, Account ref, int choice)
	{
		if(choice == 1)
		{
			t.deposit(amt, ref);
			System.out.println("Deposite By GPay");
		}
		else if(choice == 2)
		{
			t.withdraw(amt, ref);
			System.out.println("Withdraw By GPay");
		}
		else if(choice == 3)
		{
			t.checkBal(ref);
			System.out.println("Balanced Checked By GPay");
		}
	}
	
}




// Service Transaction class

class ServiceTransaction{
	
	public static BankUser Login(int pin)
	{
		if(pin == 1111)
		{
			return  new Atm();
		}
		else if(pin == 2222)
		{
			return new PhonePay();
		}
		else if(pin == 3333)
		{
			return new Gpay();
		}
		else
		{
			System.out.println("Invalid Pin...");
			return null;
		}	
	}
}



public class Main {

	public static void main(String[] args)
	{
		Account A1 = new Account("Ahemad", 1234);
		
		BankUser u1 = ServiceTransaction.Login(1111);
		
		u1.transaction(5000, A1, 1);
		u1.transaction(0, A1, 3);
		u1.transaction(1000, A1, 2);
		
        BankUser u2 = ServiceTransaction.Login(2222);
		
		u2.transaction(6000, A1, 1);
		u2.transaction(0, A1, 3);
		u2.transaction(2000, A1, 2);
		
		BankUser u3 = ServiceTransaction.Login(3333);
		
		u3.transaction(6000, A1, 1);
		u3.transaction(1, A1, 2);
		u3.transaction(0, A1, 3);
	}
	
}










