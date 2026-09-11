package com.java.practice.day56;

import java.util.*;

import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReference {
	

	public static int getSqaure(int x) {
		
		return x * x;
	}
	
	
	public void greeting(String name) {
		
		System.out.println("Hello " + name);
	}
		
	
	public static void main(String[] args) {
		
		
		// Method Reference To Static Method.
		
		
		//Lambda Expression
		Function<Integer, Integer> f1 = x -> MethodReference.getSqaure(x);
		System.out.println(f1.apply(5));
		
		//Method Reference
		Function<Integer, Integer> f2 = MethodReference::getSqaure;
		System.out.println(f2.apply(3));
		
		
		
		// Method Reference To Non-Static Method.
		
		// first we have to create the object of a particular class the we can access there instance method.
		
		MethodReference d = new MethodReference();
		
		// the work is taking argument and returning nothing like Argument -> void then use Consumer Interface.
		
		
		// Lambda Expression
		Consumer<String> c1 = x -> d.greeting(x);
		
		c1.accept("Ahemad");
		
		// Method Reference.
		Consumer<String> c2 = d::greeting;
		
		c2.accept("Raza");
		
		
		
		
		// Method reference to instance method of an arbitarary object.
		
		Function<String, String> f3 = x -> x.toUpperCase();
		
		System.out.println(f3.apply("abcd"));
		
		
		Function<String, String> f4 = String::toUpperCase; // here we tell the the compiler to use this method not call here it will call when needed.
		
		System.out.println(f4.apply("raza khan")); // actually here we call this method.
		
		
		
		// Method Reference to Constructor.
		
		// Here We have to use Spplier Interface to create an object because the Supplier take nothing as an argument and return somthing.
		
		
		// lambda Expression for Zero argument constructor.
		Supplier<Car> getCar = () -> new Car();
		// lambda Expression for parameterized argument constructor.
		
		
		// it takes String and return Car type of Object
		Function<String, Car> getCar1 = (x) -> new Car(x);
		
		getCar.get();
		
		getCar1.apply("BMW");
		
		
		
		
	}
}


class Car{
	
	
	// Zero Argumetn Constructor.
	public Car(){	
		System.out.println("Car Object is Created.");
	}
	
	
	// Parameterized Constructor.
	public Car(String carName) {
		System.out.println(carName + "Object is Created.");
	}
}
