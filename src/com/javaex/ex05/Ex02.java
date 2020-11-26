package com.javaex.ex05;

public class Ex02 {
	public static void main(String[] args){
	
		int[] intArray = new int[5];
	
		intArray[0] =3; //무조건 0부터 나온다.
		intArray[1] =6;
		intArray[2] =9;
		intArray[3] =12;
		intArray[4] =55;  //3.14같은 수는 안됨. "한"은 가능:문자형이 되어서
		
	/*	System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]); //출력할 때 편해진다. 1000개가 넘어가면~어렵잖아
	*/
		for(int i=0; i<=4; i++) {
			System.out.println(intArray[i]);
		}
		
	}
}
