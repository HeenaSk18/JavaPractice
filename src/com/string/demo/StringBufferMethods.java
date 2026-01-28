package com.string.demo;

public class StringBufferMethods {

	public static void main(String[] args) {
		String str = "Hello World";// string intern pool --- effiect memory
//		immutable cannot modification
		String str1 = new String("Hello World");
//		heap memory create this object

		StringBuffer sb = new StringBuffer("Hello World");// heap memory this also created object -- new keyword
//		StringBuffer/String belong java.lang package -- existing object can modification can done
		
//		length of string
//		System.out.println(str.length()); //length of string
//		System.out.println(sb.length());
		
//		concat
//		System.out.println(str+"123");//+
//		System.out.println(str.concat("1234"));//concat()
		
//		System.out.println(sb.append(123));
//		stringbuffer --- append -- syschorzied --- thread safe -- performance is slow
		
//		charAt()
//		System.out.println(str.charAt(0));
//		System.out.println(sb.charAt(0));
//		comman method in both string and stringbuffer
		
		
//		System.out.println(str);
		
//		indexOf() --- particular of index of character
//		System.out.println(str.indexOf('e'));//1 
//		System.out.println(str.indexOf("ello"));//1 -- pick only start of string as of output
		
//		System.out.println(sb.indexOf("ello"));//1 
//		comman this both
		
//		lastindexOf() -- last indexOf
		
//		System.out.println(str.lastIndexOf('l'));
		
//		System.out.println(sb.lastIndexOf("l"));
//		overload -- multiple ways to calls
//		-- stringbuffer -- indexof in string mostly
		
//		isEmpty()
//		System.out.println(str.isEmpty());
//		System.out.println(sb.isEmpty());
//		both same work
//		StringBuffer sb1 = new StringBuffer();
//		System.out.println(sb1.isEmpty());
		
//		reverse
//		System.out.println(sb.reverse());

//		insert(int offset, String)
		System.out.println(sb);
		System.out.println(sb.insert(5, " Java"));
//		substring inject without create object 
		
//		deleteChartAt
//		System.out.println(sb.deleteCharAt(4));
//		delete character from chartat
//		System.out.println(sb.delete(0, 4));
//		delete range indext start till where index 
		
//		replace -- range start index -- end index -- substring
		System.out.println(sb.replace(0, 5, "Hi"));

//		capacity --- 
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());//16
//		System.out.println(sb.length());
		sb.append("This is a sample text that i am adding to the String buffer");
		System.out.println(sb.length());
		System.out.println(sb.capacity());//11(Hello World)+16=27 -- hold character 
//		How is the capacity calculated in String buffer
//		new capacity = (oldCapacity*2)+2 --- memory alocation
//		 array list will be used
		
	}

}
