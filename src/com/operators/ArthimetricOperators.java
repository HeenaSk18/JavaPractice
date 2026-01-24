package com.operators;

public class ArthimetricOperators {// start of class
	// local variable is searching in stack then it will search other
	public static void main(String[] args) {// start main method
		// Mathematical Operations: +,-,*,/,%
		int number1 = 10;// declearation + intialization = memory allocation
		int number2 = 20; // type check of RHS along with LHS of datatype
		double result;// declearation
		result = number1 + number2;
		// class---referance(non-primitive datatype)--method
		System.out.println(result);// 30
		result = number1 - number2;
		System.out.println(result);// -10
		result = number1 * number2;
		System.out.println(result);// 200
		result = ((double) number1) / number2;// 0.5 //explicit typecasting
		System.out.println(result);// 0 (20/10=result 0.5 Q (int 0 getting double value))
		// implicit --- on its own
		result = 10 % 2; //0
		System.out.println(result);// 10

	}// end of main method

}// end of class
