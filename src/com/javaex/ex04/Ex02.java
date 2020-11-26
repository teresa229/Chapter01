package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해 주세요");
		System.out.print("단:");
		
		//단 입력
		int dan = sc.nextInt();
		
		int i=1;         //초기값
		          //(0으로쓰는 것이 보통이지만 j값을 고민해보았지만,j와 i가 같으니 i를 0으로 설정해준다)
		
		while( i <= 9) { //조건식  //i<10; 경계값 주의할 것
			System.out.println( dan + "*" + i + "=" + dan*i);
			i++;         //증감식
		}
		
		sc.close();
	}

}
