package com.student.management.system.oop;

public class Runner2 {
	public static void main(String[] args) {
		
//		Emp emp = new Emp("Raj");
		Emp e1 =Emp.createEmpAccount("Shaikh");
		System.out.println(e1.getName());
	}
}
