package com.cal;

public class Cal {

	public static void main(String[] args) {

		int numberOne = 10;
		int numberTwo = 20;
		int numberThree = 40;

		addNumbers(numberOne, numberTwo); // Method Calling
		addNumbers(numberOne, numberTwo, numberThree);
		addNumbers(23.5, 10);
//		on the base of count of parameter decide to calls --- sequence of datatype
//		method overloading --- within the class --- static, return, visibility role not
//		improve readability of framework --- easis of remembers --- e.g -> json,xl,read =read methods are
	}

	private static void addNumbers(int numberOne, int numberTwo) {
		System.out.println(numberOne + numberTwo);
	}
	
	private static void addNumbers(double numberOne, int numberTwo) {
		System.out.println(numberOne + numberTwo);
	}
	
	private static void addNumbers(int numberOne, int numberTwo, int numberThree) {
		System.out.println(numberOne + numberTwo + numberThree);
	}
}
