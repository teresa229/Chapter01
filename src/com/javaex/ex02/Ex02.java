package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// System.in을 읽어죠. sc는 임의의 문자로 정해줌 : 준비단계
		
		System.out.println("이름을 입력해 주세요");
		System.out.print("이름:"); // 줄바꾸지 않아야 하므로 print로 설정
		
		//주머니 만들어 주는 과정
		
		//String name = "황일영"
		String name = sc.nextLine();  //자료형을 결정해 주어야 한다. 글자이니 String. sc안에 있음
		
		System.out.println("당신의 이름은" + name + "입니다.");
		
		
		sc.close(); //연결을 끊어준다.
	
	}
	}
