package com.student.management.system.oop;

public class Emp {
	private String name;
	
	private Emp(String name) {
		this.name = name;
		
	}
	public static Emp createEmpAccount(String name) {
		Emp e1 = new Emp(name);
		return e1;
	}
//	created object only within that class -- eg singleton design pattern
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
