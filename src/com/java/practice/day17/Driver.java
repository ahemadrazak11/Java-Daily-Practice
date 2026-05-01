package com.java.practice.day17;


//Dependent object

class Engine{
	
	private int hp;
	
	Engine(int hp)
	{
		this.hp = hp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
}

// Depending Object
class Car
{
	
	String name;
	double price;
	
	Engine e = new Engine(650);
	
	

	public Car(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}
	
	public void PrintInfo()
	{
		System.out.println("Car Name: " + getName());
		System.out.println("Car Price: " + getPrice());
		System.out.println("Engine No.: " + getE());
		System.out.println("Engine HP: " + getE().getHp());
	}
	
	
}

public class Driver {

	public static void main(String[] args)
	{
		Car c1 = new Car("BMW", 72.786);
		
		c1.PrintInfo();
		
		
		new Car("Audi", 313);
	}
}
