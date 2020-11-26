package com.javaex.ex05;

public class Ex08 { // 121페이지 문제

	public static void main(String[] args) {
		
		int[] arrA = new int[]{10, 20, 30};
		int[] arrB = new int[]{15, 20, 33};
		
		if(arrA.length == arrB.length) { //두 배열의 갯수가 같니?
			for(int i=0; i< arrA.length; i++) { //세부비교
				if(arrA[i] != arrB[i]) {
				System.out.println(i+"번째 값이 다릅니다.");
				}
			}		
		}else {
			System.out.println("배열의 크기가 다릅니다");
		}
		
	}
}
