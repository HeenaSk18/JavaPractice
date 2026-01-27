package com.string.demo;

public class StringMethodsPart3 {

	public static void main(String[] args) {
		String data= "Hello World";
		
		String result=data.substring(1, 5);
//		substring is overloaded method
		System.out.println(result);//ello
//		in string intern pool two memory is created one of data="hello world"
//		and result=ello as output so it create in intern pool
		
//		replace() --- return string back
		String replaceData=data.replace('l', 'L');
		System.out.println(replaceData);//HeLLo WorLd

//		indexOf()
		char c =data.charAt(4); //return character
		System.out.println(c);
		
		int indexOfCharacter=data.indexOf('o');//return the index of first occurence
		System.out.println(indexOfCharacter);//4
		int LastindexOfCharacter=data.lastIndexOf('o');//return the index of last occurence
		System.out.println(LastindexOfCharacter);//7
	
		
	}

}
