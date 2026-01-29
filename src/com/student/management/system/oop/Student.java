package com.student.management.system.oop;

public class Student {// start class
	//Instance variable -- inside class -- non static -- heap memory
	String name;
	int age;
	int rollNumber;
	double marksObtainedInEnglish;
	double marksObtainedInMaths;
	double marksObtainedInScience;
	String grade;
//	1) variable created inside method is a local varaible
//	2) local variables are created in stack memory
//	3) local variables are never intialized with default value implicilty -- exciptly value to added

//  variable created inside the non-static we call it instance variable
//	Instance variable are intialized with default value --- heap memory -- implicitly

//	task --- functionality --- student object can calculate total marks
	public void calculatedTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		System.out.println("Total Marks Obtained " + totalMarks);
	}

}// end class
