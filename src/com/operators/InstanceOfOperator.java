package com.operators;

public class InstanceOfOperator {

	public static void main(String[] args) {
//		instanceof ---> an object belong to a certain class or not ---> not work for primitive data type
//		String name = "Heena";
		StringBuilder name = new StringBuilder("Heena") ;
		if(name instanceof Object)
		{
			System.out.println("YES");
		}
		
		Integer number =10;// works on non-primitive datatype
		if(number instanceof Integer)
		{
			System.out.println("YEPP");
		}

	}

}
