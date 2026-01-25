package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
//		&&-->AND-->both condition should be True
//		||-->OR---> anyone condition should be True ---> (condition1) || (condition2)--> true
//		!-->NOT--> inversion/opposite on the condition be true ---> false
		
		System.out.println((5>4) && (5<2));//false
		System.out.println((5>4) || (5<2));//true
		System.out.println(!((5>4) || (5<2)));//false
	}

}
