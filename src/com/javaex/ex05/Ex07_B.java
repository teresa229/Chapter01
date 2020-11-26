package com.javaex.ex05;

public class Ex07_B {

	public static void main(String[] args) { //배열의 복사 B
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB; 	//자료형 int[] 모양이 올꺼야... 변수만 생성
		arrB = arrA;	//주소값만 복사됨 같은 데이터를 바라본다.
						//같은 데이터를 바라본다.
						//실제 데이터가 복사되는 것은 아니다.
	
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		System.out.println("===========");
		arrA[1] = 100;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}
}
