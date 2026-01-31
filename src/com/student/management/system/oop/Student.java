package com.student.management.system.oop;

import java.util.Objects;

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

	public Student(String name, int age, int rollNumber, double marksObtainedInEnglish, double marksObtainedInMaths,
			double marksObtainedInScience, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
		this.marksObtainedInEnglish = marksObtainedInEnglish;
		this.marksObtainedInMaths = marksObtainedInMaths;
		this.marksObtainedInScience = marksObtainedInScience;
		this.grade = grade;
	}

//  special method inside the class -- same name of the class
//	the job intialization instance variable during object create
//	construct don't have return type
//	only calls once -- object creation only once -- updation can update again and again
//  job of constructor is to assign -- first time intialization
//	job of setter is to updation
//	differents type of constructor -- 
	public String getName() {
//		getter -- retrive the value of instance variable
		return name;
	}

//   getter + setter = validation can do
	public void setName(String name) {
//		setter -- parameter initalize a value passing to instance variable
		this.name = name;
//		this keyword use to diiferent with local variable with same name of instance variable 
//		mutual class -- setter is meat for updation
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 21 && age >= 10) {
			this.age = age;
		} else {
			System.err.println("Invalid Student Age");
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 1) {
			this.rollNumber = rollNumber;
		} else {
			System.err.println("Invalid Roll Number");
		}
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish < 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.err.println("Invalid Marks for English");
		}
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		if (marksObtainedInMaths >= 0 && marksObtainedInMaths < 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.err.println("Invalid Marks for Maths");
		}
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience < 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
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

	@Override
	public int hashCode() {
		return Objects.hash(age, grade, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience, name,
				rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}

//	s1.equals(s2) -- passing object reference -- always be object reference
//	this -- current instance -- s1.equal(s1) -- its own -- return true
//	if non-primitive -- null the -- return false -- s1.equal(null)
//	getClass() --class type - s1 type -- student class s2 also same -- true or different then false
//	each instance variable value of other object will compare s1 name s2 name compare objects
//	if matching correctly then true or else false
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", marksObtainedInEnglish="
				+ marksObtainedInEnglish + ", marksObtainedInMaths=" + marksObtainedInMaths
				+ ", marksObtainedInScience=" + marksObtainedInScience + ", grade=" + grade + "]";
	}
//	special method comes from object class -- prints/retruns String value
//	one line description of the objects instance variable

}// end class
