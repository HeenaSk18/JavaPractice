package com.loops;

public class SimpleWhileLoop {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
//		while loop
		int number = 1;
		while(number<=5) {
			System.out.println(number);
			number=number+1;
		}
		
		int i=1;
		while(true) {
			if(i==5) {
				break; //exit from the loop
			}
			System.out.println("Hello I am in loop");
			i++;
		}
		
	}

}
