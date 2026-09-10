package com.java.practice.day56;

import java.util.function.*;

public class NonPrimitiveFunctionalInterface {
	
	public static void main(String[] args) {
		
		
		// Function functional interface family
		//=====================================================================================================
		
		// a. IntFunction<R> it takes primitive type and return nonprimitive type.
		
		IntFunction<Integer> sqr = x -> x * x;
		
		
		System.out.println(sqr.apply(5));
		
		// b. LongFunction<R> takes long return Long
		LongFunction<Long> getCube = y -> y * y * y ;
		
		System.out.println(getCube.apply(3));
		
		// c. DoubleFunction<R> takes double return Double
		
		DoubleFunction<Double> areaOfCircle = (x) -> 3.143 * x * x;
		
		System.out.println("Area of Circle: " + areaOfCircle.apply(5));	
		
		

		
		// d. ToIntFunction<T> it takes primitive and return non-premitive. T -> int
		
		ToIntFunction<Integer> a = z -> z * z;
		
		System.out.println("Sqaure" + a.applyAsInt(10));
		
		// e. ToLongFunction<T>
		
		ToLongFunction<Long> lng = l -> l * l * l;
		
		System.out.println(lng.applyAsLong(3L));
		
		ToDoubleFunction<Double> dbl = d -> d * 2;
		
		System.out.println(dbl.applyAsDouble(10.0));
		
		
		//=====================================================================
		// Consumer primitive IntConsumer or ObjIntConsumer
		// Supplier primtive IntSupplier alternate nothing
		// Predicate primtive IntPredicate, LongPredicate, DoublePredicate.
		
		//=============
		// Primitive Operator Family.
		// if both input and output are primitive then it used.
		// IntUnaryOperator int -> int
		// LongUnaryOperator
		// DoubleUnaryOperator
		// IntBinaryOperator((int, int) -> int) takes two inputs.
		
		
		
	}

}
