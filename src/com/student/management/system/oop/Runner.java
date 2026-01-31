package com.student.management.system.oop;

public class Runner {

	public static void main(String[] args) {

		Student s1 = new Student("Altaf", 18, 5, 56, 66, 76, "B");
		System.out.println(s1);

		Student s2 = new Student("Heena", 15, 15, 59, 76, 79, "A");
		System.out.println(s2);

//		 with the help of toString() helps to print in terminal
//		 if not there toString() then it will be print hashcode in terminal

//		s1.setName("Heena");
//		s1.setAge(15);
//		s1.setRollNumber(3);
//		s1.setMarksObtainedInEnglish(65);
//		s1.setMarksObtainedInMaths(-98);
//		s1.setMarksObtainedInScience(85);
//		s1.setGrade("A");

//		System.out.println(s1.getName());
//		System.out.println(s1.getAge());
//		System.out.println(s1.getRollNumber());
//		System.out.println(s1.getMarksObtainedInEnglish());
//		System.out.println(s1.getMarksObtainedInMaths());
//		System.out.println(s1.getMarksObtainedInScience());
//		System.out.println(s1.getGrade());
//		s1.calculatedTotalMarks();
	}

}
//		Constructor will be called
//		job of constructor intialize instance variable 
//		

//		======================
//		System.out.println(s1);//com.student.management.system.oop.Student@24d46ca6

//		System.out.println(s1.name);//null//instance will list will come s1.name
//		System.out.println(s1.age);//0
//		System.out.println(s1.grade);//null

//		s1.name="Heena";
//		s1.age=21;
//		s1.rollNumber=1;
//		s1.marksObtainedInEnglish=58;
//		s1.marksObtainedInMaths=65;
//		s1.marksObtainedInScience=50;
//		s1.grade="B";

//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.rollNumber);
//		System.out.println(s1.marksObtainedInEnglish);
//		System.out.println(s1.marksObtainedInMaths);
//		System.out.println(s1.marksObtainedInScience);
//		System.out.println(s1.grade);
//		s1.calculatedTotalMarks();

//		==========================
//		object create -- instance variable -- invalid assign to this
//		some validation and access this use

//		int x = 10;
//		declaration -- local variable -- stack memory -- primitive variable -- store value
//		method is push into stack -- pointer is call Top

//		int y[] = new int[3];
//		array created in heap memory -- indexes [0,1,2] -- intialized with default value is Zero
// 		reference variable y[] -- created method -- stack -- hashcode of the array in heap memory
//		whenever access the value via indexes

//		Student s1 = new Student();
//		Student -- datatype -- user defined datatype --> non-primitive datatype
//		s1 -- reference varibale -- not object --- store the hashcode of the object

//		s1 = new Student();
//		new Student -- object
//		whenever created object -- 
//		1) class is loaded into memory -- Student class
//		2) instance variables are created -- inside class non-static -- heap memory
//		3) constructor is called -- dummy constructor by java and excuted

//	}

//}
