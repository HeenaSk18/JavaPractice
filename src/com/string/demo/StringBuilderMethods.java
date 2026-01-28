package com.string.demo;

public class StringBuilderMethods {

	public static void main(String[] args) {
//		mutual --- performance -- fast/high -- non sychronized --- not thread safe
//		signle threaded application --- modification -- manipulate string --- loop
		StringBuilder sb = new StringBuilder("hello");
//		heap memory 
		//1) append()
//		sb.append(" World:); // Hello World
		
//		2) insert(index,char)
//		sb.insert(5,',') //Hello , World
		
//		3) delete(start, endindex)
//		sb.delte(5,6)// Hello World
		
//		4) reverse()
//		sb.reverse() --- dlrow olleH
		
//		5) capacity()
//		16 -- 16+5=21
		
//		6) sb.length()=11
		
	}

}
