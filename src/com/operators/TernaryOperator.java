package com.operators;

public class TernaryOperator {

	public static void main(String[] args) {
//		short-hand --> if else statement
//		(condition) ? expression1 : expression2
		int a = 100;
		int b = 120;
		int max =(a>b)?a : b;
		System.out.println(max);
		
		int number = 25;
		boolean isEven=(number%2==0)?true:false;
		System.out.println(isEven);

	}

}
