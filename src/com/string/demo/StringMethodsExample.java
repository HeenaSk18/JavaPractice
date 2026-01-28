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

//		Method 3: length() Check
//		difference length --> property/atribute and check size of array   
//		- VS -   
//		length() --> size of String method -- total number of characters present

//		System.out.println(data.length());
//		return value integer formate / number of characters present in the String

//		Method 4: trim()
//		heading/tail = start/end white space ---> trim
		data = data.trim();
//		System.out.println(data.length());

//		Method 5 and 6: toLowerCase() and toUpperCase(); 
//		this works only alphabits only not for number -- 123
		data = data.toLowerCase();
		System.out.println(data.toLowerCase());// apple123
		System.out.println(data.toUpperCase());// APPLE123

//		Method 7:  String Concat! Joining of Multiple String
		System.out.println(data + "abc");// apple123abc

		System.out.println(data.concat("abc"));// apple123abc

//		Method 8: charAt() --- individual character
		System.out.println(data.charAt(4));// e

//		Method 9: contains() --- certain character/substring present or not
		System.out.println(data.contains("123"));// true

//		Method 10: isEmpty() --- String empty or not
		String data3 = " ";
		String data4 = null;
		System.out.println(data4.isEmpty());//empty string --- NullPointerException
		System.out.println(data3.isEmpty());
		System.out.println(data.isEmpty());// false

//		String is datatype and join with become String -- concat -- automatically become string
//		String default -- null string
	}

}
