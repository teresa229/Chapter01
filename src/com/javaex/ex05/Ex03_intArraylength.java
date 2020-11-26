package com.javaex.ex05;

public class Ex03_intArraylength {

	public static void main(String[] args) {
		
		int[] lottoNums = new int[6]; //6개의 방이 필요하다.
		
		
		for(int i=0; i<= lottoNums.length; i++) {
			lottoNums[i] = (int)(Math.random()*45)+1;
		}
		
		//lottoNums.length --> 배열의 갯수 --> 6
		for(int i=0; i<lottoNums.length; i++) {
			System.out.println(lottoNums[i]);
		}
		
		//ArrayIndexOutOfBoundsException -->lottoNums[6]
	//	for(int i=0; i<=lottoNums.length; i++) {
	//		System.out.println(lottoNums[i]); //i 0~5
	//	}
	}
}
