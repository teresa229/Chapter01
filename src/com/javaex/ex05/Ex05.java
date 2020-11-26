package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		int num = 3;
		
		int num2 = num;
		
		num2 = 7;
		System.out.println(num); //3
		System.out.println(num2);//7
		
		num = 100;               //상황 3-->100 으로 변경한다.
		System.out.println(num); //100  으로 바뀐다
		System.out.println(num2);//7
	}
}
