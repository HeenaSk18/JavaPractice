package com.string.demo;

public class StringDemo {

	public static void main(String[] args) {

		int x = 10;
//		primitive datatype -- directly store value

		String name = "heena";
//		String literals --- create in String Intern Pool 

//		String name2 = "Heena";
//		is heena literal is persent? --- same literal will reference variable 

		String name2 = "heena";//99155643
		int y = 10;
		System.out.println(x == y);
//		comparsion of two primitive will check on value --- o/p ---> true

		System.out.println(name == name2);
//		name --- reference variable 
//		comparsion of two -- bases of hashcode ---> o/p false ---> because of hashcode address reference code
		System.out.println(name.equals(name2));
//		value is checking here ---> equals method is case sensitive
//		to do equals string ---> use equals / equalsignore --- o/p --- false
		System.out.println(name.equalsIgnoreCase(name2));
//		the case will ignore and --> true
		
		
//		equal --- check --- casing sensitive
//		equalignore --- case -- insensitive
		
		System.out.println(name.hashCode()); //99155643
		System.out.println(name2.hashCode()); //69602971
	}

}
