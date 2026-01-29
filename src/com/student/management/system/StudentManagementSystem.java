package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {
//	global variable -- make them public static
	public static String studentName[] = new String[100];
	public static int studentAge[] = new int[100];
	public static double[] marksObtainedInEnglish = new double[100];
	public static double[] marksObtainedInScience = new double[100];
	public static double[] marksObtainedInMaths = new double[100];
	public static String[] studentGrade = new String[100];
	public static int[] studentRollNumber = new int[100];
	public static Scanner scanner = new Scanner(System.in);
	public static int index = 0;

	public static void main(String[] args) {
//		store the information of Student
//		String studentName[] = new String[100];
//		int studentAge[] = new int[100];
//		double[] marksObtainedInEnglish = new double[100];
//		double[] marksObtainedInScience = new double[100];
//		double[] marksObtainedInMaths = new double[100];
//		String[] studentGrade = new String[100];
//		int[] studentRollNumber = new int[100];

//		stack created -- local varibale never intialized with default values --> have explicity default values
//		studentName = null; --- intialized

//		Reading values from the terminal or console
//		Scanner scanner = new Scanner(System.in);

//		option -- is taking user in console/terminal
		int option;
		System.out.println("Student Management System");

		while (true) {
			System.out.println("1. Add a Student");
			System.out.println("2. Print Student Details");
			System.out.println("3. Print All Student Details");
			System.out.println("4. Exit");

			System.out.println("Enter an Option [1-4]");
			option = scanner.nextInt();
//		value from user 

			switch (option) {
			case 1:
				addStudent(); // static method can call another static method
				break;

			case 2:
				printStudentInformation(); // static method can call another static method
				break;

			case 3:
				printAllStudentInformation(); // static method can call another static method
				break;

			case 4:
				exitApp(); // static method can call another static method
				break;

			}
		}
//		System.out.println("Student Name: " + studentName);
//		output -- show --- hashcode

//		System.out.println("Student Name: " + studentName[0]);
//		System.out.println("Student Age: " + studentAge[0]);
//		System.out.println("Student RollNumber: " + studentRollNumber[0]);

//		System.out.println("Marks Obtained: ");
//		System.out.println("English: " + marksObtainedInEnglish[0]);
//		System.out.println("Maths: " + marksObtainedInMaths[0]);
//		System.out.println("Science: " + marksObtainedInScience[0]);
//		System.out.println("Student Grade: " + studentGrade[0]);
//		data over here is hardcoded --- String studentName="Heena";

	}

	private static void exitApp() {
		System.out.println("Exiting from the App...");
		System.exit(0);
	}

	private static void printAllStudentInformation() {
//		System.out.println("printAllStudentInformation");
		for(int i =0;i<index;i++) {
			System.out.println("=================================");
			
			System.out.println("Student Name: " + studentName[i]);
			System.out.println("Student Age: " + studentAge[i]);
			System.out.println("Student RollNumber: " + studentRollNumber[i]);

			System.out.println("Marks Obtained: ");
			System.out.println("English: " + marksObtainedInEnglish[i]);
			System.out.println("Maths: " + marksObtainedInMaths[i]);
			System.out.println("Science: " + marksObtainedInScience[i]);
			System.out.println("Student Grade: " + studentGrade[i]);
			
			System.out.println("=================================");

		}

	}

//	local variable -- belong to that method

	private static void printStudentInformation() {
		System.out.println("printStudentInformation");
		System.out.println("Enter the index");
		int userIndex = scanner.nextInt();

		System.out.println("Student Name: " + studentName[userIndex]);
		System.out.println("Student Age: " + studentAge[userIndex]);
		System.out.println("Student RollNumber: " + studentRollNumber[userIndex]);

		System.out.println("Marks Obtained: ");
		System.out.println("English: " + marksObtainedInEnglish[userIndex]);
		System.out.println("Maths: " + marksObtainedInMaths[userIndex]);
		System.out.println("Science: " + marksObtainedInScience[userIndex]);
		System.out.println("Student Grade: " + studentGrade[userIndex]);
	}

	public static void addStudent() {
		System.out.println("Enter the student Name");
		studentName[index] = scanner.next();
//		next() --- string value

		System.out.println("Enter the student Age");
		studentAge[index] = scanner.nextInt();
//		nextIn() --- integer value

		System.out.println("Enter the student RollNumber");
		studentRollNumber[index] = scanner.nextInt();
//		nextIn() --- integer value

		System.out.println("Enter marks for English");
		marksObtainedInEnglish[index] = scanner.nextDouble();
//		nextDouble() --- double value

		System.out.println("Enter marks for Maths");
		marksObtainedInMaths[index] = scanner.nextDouble();
//		nextDouble() --- double value

		System.out.println("Enter marks for Science");
		marksObtainedInScience[index] = scanner.nextDouble();
//		nextDouble() --- double value

//		can not read single character with scanner class: 
//		in string format and then convert string to char! charAt(0);

//		studentGrade
		double totalMarkObtained = marksObtainedInEnglish[index] + marksObtainedInMaths[index]
				+ marksObtainedInScience[index];
		double percentageObtained = totalMarkObtained / 3.0;
//		percentageObtained = sum (english+science+maths)/3.0 --- formula

		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[index] = "C";
		} else if (percentageObtained >= 65) {
			studentGrade[index] = "D";
		} else {
			studentGrade[index] = "F";
		}
		index = index + 1;
//		index++;
		System.out.println("Student info stored successfully!");
	}

}
