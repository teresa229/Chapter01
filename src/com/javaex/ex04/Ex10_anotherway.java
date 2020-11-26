package com.javaex.ex04;

import java.util.Scanner;

public class Ex10_anotherway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		boolean action =true;
		
		while(action) {  //true를 action으로 바꾼다.
			System.out.println("숫자를 입력하세요");
			int no = sc.nextInt();
			
			if(no==0) {
				System.out.println("종료");
				action = false; //action(true)일 때는 밑의 공식으로 내려간다. 3의 배수인가? 3의 배수가 아닌가?
			//	break;    break는 이쪽까지만 작동하고 이쪽에서 끝나버리지만, action(false)이면 다시 상단의 while로 올라간다.(눈에는 보이지 않지만)
				
			}else if(no%3==0){
				System.out.println("3의 배수입니다.");	
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
			
	
		sc.close();
	}
	
	
	
	
}
