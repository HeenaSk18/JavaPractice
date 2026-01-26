package com.array;

public class Demo {

	public static void main(String[] args) {
		int x = 10;
//		System.out.println(x);
		int marks[] = new int[3];
//		created --- array --- heap memory -- default value -- Zero 
//		reference point memory address eg.--777 --- hashCode unique identification number
//		System.out.println(marks);// [I@5ca881b5 --- hashCode
//		System.out.println(marks[0]);//0
//		System.out.println(marks[1]);//0
//		System.out.println(marks[2]);//0
//		System.out.println(marks[3]);//0
//		System.out.println(marks[4]);//0
		System.out.println(marks.length);
		
		marks[0]=8;
		marks[1]=7;
		marks[2]=6;
		for(int index=0;index<=marks.length-1;index++) {
			System.out.println(marks[index]);
		}
		
		
	}

}
