package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름를 입력해주세요");
		System.out.print("이름:");
		
		String name = sc.nextLine();
		
		System.out.println(name); // 잘 입력되었는지 확인하기 작업.
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		System.out.println(age); // 잘 입력되었는지 확인하기 작업.
		
	    System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
	    */
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.nextLine();  // 임의로 문자열 받는 것을 넣어준다.
				
		System.out.println("이름를 입력해주세요");
		System.out.print("이름:");
	    String name = sc.nextLine();
		
	    System.out.println("당신의 나이는 " + age +" 당신의 이름은" + name +" 입니다.");
		
		sc.close();
	}
}
