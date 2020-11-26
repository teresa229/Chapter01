package com.javaex.ex01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//실수형
		double var01 = 3.14;
		System.out.println(var01);
		
		float var02 = 3.14f; //float형은 f를 써야한다.
		System.out.println(var02);
		
		double var03; //메모리에 공간을 잡아준 것이다. var03이라는 이름으로~
		float var04;
		
		var03=0.123456789012345678;//결과값에 차이가 생긴다. double이 더 정확하다.
		var04=0.123456789012345678f;
		
		System.out.println(var03);
		System.out.println(var04);
		
		//변수표현 : 결과는 25로 같지만, 엄연히 다른 방법이다.
		int var11; //"2 호흡"에 가는 방법이다. 값이 완성되지 않은 상태에서 공간을 만들어주는 경우 사용. var11이 임의의 값이며 변수라고 부른다.
		var11 = 25;
		System.out.println(var11);
		
		int var12 = 25; //"1 호흡"에 가는 방법이다.
		System.out.println(var12);
		
		System.out.println(var11);
		System.out.println(var12);
		
		/////////////
		//변수 선언 -->값대입
		/*
		int v01;
		int v02;
		int v03;
		*/
		
		//공간 3개 만들때
		int v01, v02, v03;
		
		v01 = 23;
		v02 = 24;
		v03 = 25;
		
		System.out.println(v01);
		System.out.println(v02);
		System.out.println(v03);
		
		//변수 선언 +값대입
		//v01 = 3; -->기존 v01 값을 변경
		//int v01 = 3 --> 변수명 v01이 2개가 되서 오류
		/*
		int v04 = 3;
		int v05 = 4;
		int v06 = 5;
		*/
		
		// 3개 한꺼번에 적을 때
		int v04 = 3, v05= 4, v06 = 5;
		
		
		System.out.println(v04);
		System.out.println(v05);
		System.out.println(v06);
	
	
	}
}
