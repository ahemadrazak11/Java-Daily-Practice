package com.java.practice.day56;


import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class PreDefineFunctionalInterface {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> getSquare = x -> x * x; // this lambda expression is the override of apply method which is present in the Function Interface.
		
//		System.out.println(getSquare.apply(5));
//		System.out.println(getSquare.apply(6));
		
		
		Consumer<Integer> print = x -> System.out.println(x); // the consumer take the input but does not return the output. it has accept(T t) method.
		
//		print.accept(10);
//		print.accept(190);
		
		Supplier<Double> randomVal = () -> Math.random();
		
//		System.out.println(randomVal.get());
//		System.out.println(randomVal.get());
//		System.out.println(randomVal.get());
		
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
//		System.out.println(isEven.test(2));
//		System.out.println((isEven.test(5))? "Number is Even" : "Number is Odd");
//		System.out.println((isEven.test(50))? "Number is Even" : "Number is Odd");
		
		List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 40, 50));
		
//		for(Integer i : list) {
//			System.out.println(i);
//		}
		
		Consumer<Integer>  j = x -> System.out.println(x);
		
		list.forEach(j); // the forEach() take the Consumer Interface as an Argument we can pass lambda expression for that or pass the refrence variable.
	} 

}

