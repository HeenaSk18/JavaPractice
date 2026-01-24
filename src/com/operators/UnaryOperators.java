package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
//		int a; // declartion
//		a = +5; // assignment positive number --- redundant - no one use it
//		int b;
//		b = -a; // -5 --> -a operator ---> 1 operand ---> Unary operators
		// type check
//		System.out.println("a " + a); // concatenation
//		System.out.println("b " + b);
		// primitive datatype is reserved keyword

//		int c;
//		c = ++a;
//		c = --a;
//		System.out.println("c " + c);
//		System.out.println("a " + a);
		// pre --> pre increament ++i (increament first then use it)
		// post --> post increament i++

//		int c;
//		c = a++;
//		c = a--;
//		System.out.println("c " + c);
//		System.out.println("a " + a);
		// pre --> post decreament --i
		// post --> post decreament --i (use first then increament it)
	
		boolean isStatus = false;
		isStatus = !isStatus; // ! works opposite
		System.out.println(isStatus);
		
	
	}

}
