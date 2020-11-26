package com.javaex.ex04;

public class Ex10 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			if(i%2==0 && i%3==0) {
				continue;
				//break;
			}	
			
			System.out.println(i);	
		}
		System.out.println("종료"); //계속 연산할 수 있지만 할 것이 없어서 "종료"끝나는 것이다.
	}
}		


