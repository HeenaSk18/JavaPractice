package com.student.management.system.oop;

public class Student {// start class
	// Instance variable -- inside class -- non static -- heap memory
//	all the instance variable always mark private keyword
	private String name;
	private int age;
	private int rollNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInMaths;
	private double marksObtainedInScience;
	private String grade;

//	1) variable created inside method is a local varaible
//	2) local variables are created in stack memory
//	3) local variables are never intialized with default value implicilty -- exciptly value to added

//  variable created inside the non-static we call it instance variable
//	Instance variable are intialized with default value --- heap memory -- implicitly

	public String getName() {
//		getter -- retrive the value of instance variable
		return name;
	}
//   getter + setter = validation can do
	public void setName(String name) {
//		setter -- parameter initalize a value passing to instance variable
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<21 && age>=10) {
		this.age = age;
		}
		else {
			System.err.println("Invalid Student Age");
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if(rollNumber>=1) {
		this.rollNumber = rollNumber;
		}
		else 	{
			System.err.println("Invalid Roll Number");
		}
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if(marksObtainedInEnglish>=0 && marksObtainedInEnglish<100) {
		this.marksObtainedInEnglish = marksObtainedInEnglish;
		}
		else {
			System.err.println("Invalid Marks for English");
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		if(marksObtainedInMaths>=0 && marksObtainedInMaths<100) {
		this.marksObtainedInMaths = marksObtainedInMaths;
		}
		else {
			System.err.println("Invalid Marks for Maths");
		}
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if(marksObtainedInScience>=0 && marksObtainedInScience<100) {
		this.marksObtainedInScience = marksObtainedInScience;
		}
		else {
			System.err.println("Invalid Marks for Science");
		}
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// task --- functionality --- student object can calculate total marks
	public void calculatedTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		System.out.println("Total Marks Obtained " + totalMarks);
	}

}// end class
