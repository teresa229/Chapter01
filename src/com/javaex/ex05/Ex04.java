package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		//방법 1
	/*	int[] intArray = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
	*/	
		
		//방법 2(간략하게)
		int[] intArray = new int[] {3,6,9};
		
		//방법 3(더 간략하게)
//		int[] intArray = {3,6,9};
		
		//intArray.length -->3
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
}
