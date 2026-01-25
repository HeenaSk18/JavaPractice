package com.operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		int a =10;
		int b =20;
//		a=a+b; //compound assignment--> readability ---> a+=b
//		System.out.println(a);//30
		a +=b;
		System.out.println(a);//30
		a -=b;
		System.out.println(a);//10
		a *=b;
		System.out.println(a);//200
		a /=b;
		System.out.println(a);//10
		a %=b;
		System.out.println(a);//10
	}

}
