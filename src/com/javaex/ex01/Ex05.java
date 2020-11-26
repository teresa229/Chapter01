package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
	
		final double pi = 3.14;
		
		//일반적인 경우
		double result01 = pi*5*5; 
		System.out.println(result01);
		
		//pi값을 변경하는 경우
		//pi = 3.141519; //상수로 정의되면 오류발생
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//상수정의 --> 보통 대문자로 표기
		final double PI = 3.15;
		double result03 = PI*5*5;
		System.out.println(result03);
		
	}
}
