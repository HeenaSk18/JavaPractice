package com.loops;

public class SimpleForLoop {

	public static void main(String[] args) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		hard coding ---> directly written

		for (int i = 1; i <= 5; i++)
//			intialization only once -- condition -- updation
//			repeat immediate next line
			System.out.println(i);
	
//	Reverse loop
	for(int i =5, j=1;i>=1;i--,j++) 
		System.out.println(i + " "+ j);
	}

}
