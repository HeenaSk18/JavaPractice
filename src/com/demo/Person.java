package com.demo;

public class Person {
	private String name;// instance variables
	private int id;

	public Person() {
//		default Constructor
		System.out.println("Default Constructor for Person Class");
	}

	public Person(String name, int id) {
//		Parameterized Constructor
		this(); // Constructor Chaining -- // default constuctor of person class -- other
				// constructor calling 
//		Constructor call must be the first statement in a constructor
		System.out.println("Parameterized Constructor");
		this.name = name;
		this.id = id;
	}

	public Person(Person other) {
		this.name = other.name;
		this.id = other.id;
	}
//	value of the use to current object -- copy constructor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
