package com.javaex.ex04;

import java.util.Scanner;

public class Ex10_move {

	//기본적으로 0이 언제 넣어서 종료가 될질 모르니 무한 반복이 될 것이다.
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("숫자를 입력하세요");
				int no = sc.nextInt();
				
				if(no==0) {
					System.out.println("종료");
					break;
					
				}else if(no%3==0){
					System.out.println("3의 배수입니다.");	
				}else {
					System.out.println("3의 배수가 아닙니다.");
				}
			}
				
		
			sc.close();
		}
}
