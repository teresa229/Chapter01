package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자:");    //메모리에 올라가고, 11,12는 출력하고, 14로 끝난다.
		
		//메모리에 공간 마련하기
		int num = sc.nextInt(); //정수를 받는 형식, '안녕하세요' 같은 것은 오류가 난다. 숫자만 들어가게 준비됨.
		
	//	System.out.println(num);
		
		System.out.println("입력한 숫자는 " + num + " 입니다.");
		
		sc.close();
	}
}
