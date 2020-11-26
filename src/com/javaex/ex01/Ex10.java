package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		//논리연산자
		int a = 5;
		int b = 7;
		
		//&&
		System.out.println("&&연산자");
		System.out.println(true&&true);  //T&&T --> T
		System.out.println(true&&false); //T&&F --> F
		System.out.println(false&&true); //F&&T --> F
		System.out.println(false&&false);//F&&F --> F
		System.out.println();
		
		//|| (원래 세로선 2개로 한줄.폰트마다 다르다.) OR연산자
		System.out.println("||연산자");
		System.out.println(true||true);  //T||T --> T
		System.out.println(true||false); //T||F --> T
		System.out.println(false||true); //F||T --> T
		System.out.println(false||false);//F||F --> F
		System.out.println();

		//응용
		System.out.println("응용");
		System.out.println((a>b)&&(a<b)); //5>7-->F 5<7-->T  F&&T --> F
		System.out.println((a>b)&&(a>b)); //5>7-->F 5>7-->F  F&&F --> F
		System.out.println((a>b)||(a<b)); //5>7-->F 5<7-->T  F||T --> T
		
		System.out.println("! 연산자");
		System.out.println( (a>b) );  //5>7-->F
		System.out.println( !(a>b) ); //!F -->T
		System.out.println( !(a<b) ); //!T -->F
		
		
	//	System.out.println( !a>b);      "!5"는 있을수없기 때문에 오류이다. 문법 자체가 잘못되었다.
	//	System.out.println(a>b||a<b); //5>7-->F 5<7-->T  F||T --> T 30번째줄 가로를 지웠을 경우
	
	}
}
