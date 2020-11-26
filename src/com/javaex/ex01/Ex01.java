package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		int myAge ;
		myAge = 25;
		System.out.println(myAge);
		
		myAge = 26;
		System.out.println(myAge);
		
		
		//정수형
		//자료형(int를 정확하게 써야한다)
		int var01 = 3;
		double var02 = -3.0;
		
		//메모리 크기 확인
		//byte var04 = 12345678;
		//short var03 = 12345678;
		//int var05 = 12345678;
		long var06 = 12345678;
		System.out.println(var06);
		
		//long형
		int var07 = 2147483647;
//		int var08 = 2147483648; //int의 범위보다 큰 값
//		long var081 = 2147483648; //long형에 대입이 안됨?
		long var082 = 2147483648l; //long형에 대입이 안됨? -> l기호를 붙여야 함
		long var09 = 2147483647;
		long var091 = 2147483647l;
		
	}
	
}
