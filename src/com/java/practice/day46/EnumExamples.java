package com.java.practice.day46;



// enum is also known as enumeration. it is a type where we can list the fixed contant values.
// We can also declare variable and methods in enum.
// we can not create object of the enum out side the enum blocks because by defult it constructor is private.
// enum methods are => values() return all contants, valueOf() => it convert String into enum
// ordinal() => it returns the position of the constant means index.
// name => it returns the name of the constant.

public class EnumExamples {
	
	public static void main(String[] args) {
		
		Status status = Status.SEEN;
		Status status1 = Status.PENDING;
		System.out.println(status);
		System.out.println(status1);
		
		System.out.println();
		System.out.println();
		
		
		// parameterized constructor and variable in enum
		int smallPrice = PizaPrice.SMALL.price;
		int mediumPrice = PizaPrice.MEDIUM.price;
		int largePrice = PizaPrice.LARGE.price;
		System.out.println("smallPrice " + smallPrice);
		System.out.println("mediumPrice " + mediumPrice);
		System.out.println("largePrice " + largePrice);
		
		System.out.println();
		System.out.println();
		
		// enum implements the interfaces and following method can be called.
			Dog.DOG.Eating();
		 Dog.DOG.Sound();
		
		
		
	}

}



// enum with default constructor.

enum Status{
	
	DELIVER,
	PENDING,
	SEEN;
	
	Status() {
		
	}
}



// enum with parameterized constructor. and enum constructors are by default private we can not call out side the class.

enum PizaPrice{
	
	SMALL(100),
	MEDIUM(200),
	LARGE(300);
	
	int price;
	
	PizaPrice(int price){
		this.price = price;
	}
}



interface Animal{
	void Eating();
	void Sound();
}


enum Dog implements Animal{
	
	DOG;
	
	@Override
	public void Eating(){
		System.out.println("Dogs are eating");
	}
	
	@Override
	public void Sound() {
		System.out.println("Dogs are barking.");
	}	
	
}





