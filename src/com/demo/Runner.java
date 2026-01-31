package com.demo;

public class Runner {

	public static void main(String[] args) {

//		Person p1= new Person();//default constructor
		Person p1 = new Person("Heena", 7);// Parameterized Constructor
		p1.setId(1);
		p1.setName("Heena");
//		1) Default Constructor
//		2) Parameterized Constructor
//		3) Copy Constructor
//		4) Constructor Chaining --> one constructor calls another constructor
//		with "this" and "supper" keyword
//		5) Private Constructor -- singleton class -- The constructor Emp(String) is not visible -- create object outisde class -- create inside class
//		constructor is public to create otherside class -- 
//		 static method can access outside class provide with public
		Person copyPerson = new Person(p1);
		System.out.println("Copy Constructor");
		System.out.println(copyPerson.getName());
		System.out.println(copyPerson.getId());
		
		
		
		
	}

}
