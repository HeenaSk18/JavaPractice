package com.student.management.system.oop;

public class Runner {

	public static void main(String[] args) {
		int x = 10;
//		declaration -- local variable -- stack memory -- primitive variable -- store value
//		method is push into stack -- pointer is call Top

		int y[] = new int[3];
//		array created in heap memory -- indexes [0,1,2] -- intialized with default value is Zero
// 		reference variable y[] -- created method -- stack -- hashcode of the array in heap memory
//		whenever access the value via indexes


		Student s1;
//		Student -- datatype -- user defined datatype --> non-primitive datatype
//		s1 -- reference varibale -- not object --- store the hashcode of the object
		
		s1 = new Student();
//		new Student -- object
//		whenever created object -- 
//		1) class is loaded into memory -- Student class
//		2) instance variables are created -- inside class non-static -- heap memory
//		3) constructor is called -- dummy constructor by java and excuted
		
		Student s2 = new Student();

	}

}
