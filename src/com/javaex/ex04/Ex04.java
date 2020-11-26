package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		
		for(i = 1; i<=10; i++){
			sum = sum + i; //검증해 볼 것
		}
		System.out.println("1부터 "+ i + "까지의 합은 " + sum +"입니다."); //i는{} 안에서만 적용되어 에러가 된다.
                                                                   //상단(8번째 줄) int i; {}밖에 정의해준다.
		}
}
