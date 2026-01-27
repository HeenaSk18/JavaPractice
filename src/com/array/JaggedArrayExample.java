package com.array;

import java.util.Arrays;

public class JaggedArrayExample {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		for (int temp : a) {
			System.out.println(temp);
		}
//		static method -- utitlies method / class created handling --- manupluted array
//		Array is inbuild method --- lang.java
		System.out.println(Arrays.toString(a));
//		printing string formate --- toString -- pass referemce (a)

		int b[][] = new int[2][2];
		b[0][0] = 100;
		b[0][1] = 200;
		b[1][0] = 300;
		b[1][1] = 400;
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));

		int j[][] = new int[2][];
		j[0] = new int[] { 10, 20, 30 };
		j[1] = new int[] { 10 };
		
		System.out.println(j.length);
		for(int rowIndex=0;rowIndex<j.length;rowIndex++) {
			for(int colIndex=0;colIndex<j[rowIndex].length;colIndex++)
			{
				System.out.print(j[rowIndex][ colIndex]+ " ");
			}
			System.out.println(" ");
		}
	}

}
