package com.string.demo;

public class StringMethodsExample {

	public static void main(String[] args) {
		String data = "  apple123  ";
		String data2 = "Apple";
//		Equals and EqualIgnoreCase
//		System.out.println(data.hashCode());//63476538
//		System.out.println(data2.hashCode());//93029210
//		Method 1: equal --- equalignorecase
//		System.out.println(data==data2);
//		checking reference hashcode check
//		System.out.println(data.equals(data2));
//		case sensitive comparision
//		System.out.println(data.equalsIgnoreCase(data2));
//		case ignore check string equal or not

//		Method 2: Length() Check
//		difference length --> property and check size of array   
//		- VS -   
//		length() --> size of String method

//		System.out.println(data.length());
//		return value integer formate / number of character present in the String

//		Method 3: trim()
//		heading/tail = start/end white space ---> trim
		data = data.trim();
//		System.out.println(data.length());

//		Method 4 and 5: toLowerCase() and toUpperCase(); 
//		this works only alphabits only not for number -- 123
		data = data.toLowerCase();
		System.out.println(data.toLowerCase());// apple123
		System.out.println(data.toUpperCase());// APPLE123

//		Method 6:  String Concat! Joining of Multiple String
		System.out.println(data + "abc");// apple123abc

		System.out.println(data.concat("abc"));// apple123abc

//		Method 7: charAt() --- individual character
		System.out.println(data.charAt(4));// e

//		Method 8: contains() --- certain character/substring present or not
		System.out.println(data.contains("123"));// true

//		Method 9: isEmpty() --- String empty or not
		String data3 = " ";
		String data4 = null;
		System.out.println(data4.isEmpty());//empty string --- NullPointerException
		System.out.println(data3.isEmpty());
		System.out.println(data.isEmpty());// false

	}

}
