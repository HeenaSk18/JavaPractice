package com.operators;

public class BitwiseOperators {

	public static void main(String[] args) {
//		Binary digits ---> Bits --- base 2 ---> 1=8 bits ---> 1nibbles
//		AND(&) ---> if both the bits are then result is 1 else it will be zero
//		OR(|) ---> if one of the bit is 1 the result 1 if both bits are zero the result is 0
//		EX-OR(Exclusive OR)(^) ---> if the both are bits are same then the result is 0 else it will be 1 
//		Complement(~) ---> to store -ve number ---> flip all the digits 
//		Left Shift Operator(<<) ---> 5 << 1 --> position left shift ((0101)1010))=10
//		Right Shift Operator(>>) ---> 5 << 1 --> position right shift

		int number1 =5;
		int number2 =3;
		int result=number1 & number2;
		System.out.println(result);//1
		 result=number1 | number2;
		System.out.println(result);//7
		result=number1 ^ number2;
		System.out.println(result);//6
		System.out.println(~number1);//-6
		System.out.println(5<<1);//10
		System.out.println(5>>1);//2
		
	}

}
