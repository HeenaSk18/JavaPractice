package com.string.demo;

import java.util.Arrays;

public class StringMethodsPart2 {

	public static void main(String[] args) {
		String data= "Hello World Hi how are you ?";
		
//		split() --- convert string to string array -- regex --> regular expression
//		String a[]="Hello" "World"
		
		String  words[]=data.split(" ");
		
		for (String temp : words) {
			System.out.println(temp);
		}
		
		System.out.println(Arrays.toString(words));//[Hello, World, Hi, how, are, you, ?]
	}

}
