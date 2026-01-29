//package com.student.management.system;
//
//import java.util.Scanner;
//
//public class StudentManagementSystemOldCode {
//
//	public static void main(String[] args) {
////		store the information of Student
//		String studentName;
//		int studentAge;
//		double marksObtainedInEnglish;
//		double marksObtainedInScience;
//		double marksObtainedInMaths;
//		String studentGrade;
//		int studentRollNumber;
////		stack created -- local varibale never intialized with default values --> have explicity default values
////		studentName = null; --- intialized
//		System.out.println("Student Management System");
//
////		Reading values from the terminal or console
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Enter the student Name");
//		studentName = scanner.next();
////		next() --- string value
//
//		System.out.println("Enter the student Age");
//		studentAge = scanner.nextInt();
////		nextIn() --- integer value
//
//		System.out.println("Enter the student RollNumber");
//		studentRollNumber = scanner.nextInt();
////		nextIn() --- integer value
//
//		System.out.println("Enter marks for English");
//		marksObtainedInEnglish = scanner.nextDouble();
////		nextDouble() --- double value
//
//		System.out.println("Enter marks for Maths");
//		marksObtainedInMaths = scanner.nextDouble();
////		nextDouble() --- double value
//
//		System.out.println("Enter marks for Science");
//		marksObtainedInScience = scanner.nextDouble();
////		nextDouble() --- double value
//
//		
////		can not read single character with scanner class: 
////		in string format and then convert string to char! charAt(0);
//
//		
////		studentGrade
//		double totalMarkObtained = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
//		double percentageObtained = totalMarkObtained / 3.0;
////		percentageObtained = sum (english+science+maths)/3.0 --- formula
//
//		if (percentageObtained >= 95) {
//			studentGrade = "A+";
//		}
//		else if (percentageObtained >=90) {
//			studentGrade= "A";
//		}
//		else if (percentageObtained >=85) {
//			studentGrade= "B+";
//		}
//		else if (percentageObtained >=80) {
//			studentGrade= "B";
//		}
//		else if (percentageObtained >=75) {
//			studentGrade= "C+";
//		}
//		else if (percentageObtained >=70) {
//			studentGrade= "C";
//		}
//		else if (percentageObtained >=65) {
//			studentGrade= "D";
//		}
//		else {
//			studentGrade= "F";
//		}
//		System.out.println("Student Name: " + studentName);
//		System.out.println("Student Age: " + studentAge);
//		System.out.println("Student RollNumber: " + studentRollNumber);
//
//		System.out.println("Marks Obtained: ");
//		System.out.println("English: " + marksObtainedInEnglish);
//		System.out.println("Maths: " + marksObtainedInMaths);
//		System.out.println("Science: " + marksObtainedInScience);
//		System.out.println("Student Grade: " + studentGrade);
////		data over here is hardcoded --- String studentName="Heena";
//
//		
//	}
//
//}
