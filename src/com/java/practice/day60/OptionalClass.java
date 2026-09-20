package com.java.practice.day60;

import java.util.Optional;

public class OptionalClass {

	
	public static void main(String[] args) {
		
		Optional<String> str = getName();
		
		System.out.println(str.get());
		
		
		// Three ways to create Optional Object
		
		//1
		
		Optional<String> a = Optional.of("Raza"); // it will throw NullPointerException if value is null
		
		//2
		
		Optional<String> b = Optional.ofNullable(null);
		System.out.println(b.orElse("raza"));
		
		//3
		Optional<String> c = Optional.empty();
		
		System.out.println(c.orElseGet(() -> "Khan"));
		
	}
	
	
	public static Optional<String> getName(){
		
		return Optional.of("Ahemad Raza");
	}
}

