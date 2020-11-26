package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		//초기화, 조건식, 증감식
		
		int i = 0;                            //초기화
		 
		while(i<5) {                          //반복조건
			System.out.println("I like java"+i);//반복영역
			
			i++;                              //증감식(탈출조건) 
		}
		
		// i=0 0<5-->true 출력  0-->1            //반복구간
		//     1<5-->true 출력  1-->2
		//     2<5-->true 출력  2-->3
		//     3<5-->true 출력  3-->4
		//     4<5-->true 출력  4-->5
		//     5<5-->false
	}

}
