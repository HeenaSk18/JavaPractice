   package com.cal;

public class CalculatorApp {
//		main method can call is due to static 
		public static void main(String[] args) {// starting point
//		methods --> perform only one task
		double number1;
		int number2;

		number1 = 100;// 10.0
		number2 = 5;// 5
		double result;

//		double result = number1 + number2;
//		System.out.println(result);
//		result variable will return 
//		calculateSum();// Method Calling
//		within method --- within class ---> search will happen
		result = calculateSum(number1, number2);// Method Calling
// 		one method to another with help of there name ---> when there are public static
		System.out.println(result);

		result = calculateSubOfTwoNumbers(number1, number2);
		System.out.println(result);

		result = calculateDivisionOfTwoNumbers(number1, number2);
		System.out.println(result);
		
		result = calculateOfMultiplicationTwoNumbers(number1, number2);
		System.out.println(result);
		
	}// end of main

	public static double calculateOfMultiplicationTwoNumbers(double number1, int number2) {
		double result;
		result = number1 * number2;
		return result;
	}

	public static double calculateDivisionOfTwoNumbers(double number1, int number2) {
		double result;
		result = number1 / number2;
		return result;
	}

//	    result = number1-number2;
//		System.out.println(result);//5.0
		private static double calculateSubOfTwoNumbers(double number1, int number2) {
		double result;
		result = number1 - number2;
		return result;
	}

//		public static void calculateSum(); //method definition
//		interface & abtract class we define the methods
//  		static method can call another static method
		public static double calculateSum(double number1, int number2) { // method declaration
//		double result = 10+5; --- directly value passed here in result variable
		double result = number1 + number2;
//		System.out.println(result);//15.0
		return result;
//		value from will return --- variable type change ( void to double)

//		---------------------------------------------------------
//		 method --- verb --- 1 task --- line of code --- project maintance -- kT to
//		 someone when you hae smaller method
//		 methods always return something --- most of all method have to return
//		
	}

}
