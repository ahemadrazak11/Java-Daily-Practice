package com.java.practice.day60;

import java.util.Optional;

public class OptionalClass {

	
	public static void main(String[] args) {
		
		Optional<String> str = getName();
		
		System.out.println(str.get());
		
	}
	
	
	public static Optional<String> getName(){
		
		return Optional.of("Ahemad Raza");
	}
}

