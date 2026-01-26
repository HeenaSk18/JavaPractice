package com.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {

//		int a[] = new int[3];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;

//		for(int index=0;index<a.length;index++) {
//			System.out.println(a[index]);
//		}

//		for (int temp : a) // readability -- line of code
//		{
//			System.out.println(temp);
//		}
		int b[][] = new int[4][2];
		
//		.length talks about rows --- total of rows
		System.out.println(b[0].length);

		for(int rowindex=0;rowindex<b.length;rowindex++)
		{
			for(int colindex=0;colindex<b[0].length;colindex++)
			{
//				System.out.println(rowindex + " " + colindex);
				System.out.print(b[rowindex][colindex]+" ");
			}
			System.out.println(" ");// print on the next line
			
		}
		
	}

}
