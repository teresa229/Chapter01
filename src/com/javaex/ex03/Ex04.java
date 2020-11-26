package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int pay; //급여 : 미리 선언하는 경우, 변수를 필요에 의해 선언, 상단에 표시해 준다.
		int time; //근무시간 : 15번줄을 분리해서 선언하는 경우
		int unit = 10000; //올해 시급 10000원이 바뀔 수 있으니.. unit이라는 이름을 넣어서 정리해준다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간:");
		
		time = sc.nextInt(); //(응용 버전 : 공식으로 정리해주는 경우)

		if(time>8) {
			pay = 8*unit + (time-8)*((int)(unit*1.5)); 	
		}else{
			pay = time*unit;
		}
		System.out.println("임금은 " + pay + "원 입니다."); 
		
/*		
//같은 문제 다른 경우 1	: 값(pay)이 비어있을 경우 생기는 문제 해결법	
		public static void main(String[] args) {
			
			int pay = 0; 
			
			Scanner sc = new Scanner(System.in);
			System.out.print("근무시간:");
			
			int time = sc.nextInt(); 
		
		if(time>8) {
			pay = 8*10000 + (time-8)*12000;

		}else {
			pay = time*10000;
		}
		
		System.out.println("임금은 " + pay + "원 입니다."); //가로밖으로 빼면 pay에 대한 조건이 없어 빨갛게 표현된다. 그래서 9번 줄 선언.
		                                              //if에서 걸리는 것이 없을 경우 pay가 비어있는 상태가 된다.공간에 들어갈 pay가 없음.
		                                              //그래서 int pay =0;
		
//같은 문제 다른 경우 2	 : 실수와 정수가 맞지 않아 생기는 문제 해결법
		int pay;
		int time;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간:");
		
		time = sc.nextInt(); //(응용 버전 : 공식으로 정리해주는 경우)

		if(time>8) {
		//	pay = 8*10000 + (time-8)*12000;
		//	pay = 8*10000 + (time-8)(10000*1.5;)  //(10000*1.5;) => (정수*실수) => (실수 공식) 다른 int는 바꾸기 어려우니 이 부분만 정수로 바꾼다.
			pay = 8*10000 + (time-8)*((int)(10000*1.5)); 	
		}else {
			pay = time*10000;
		}
		System.out.println("임금은 " + pay + "원 입니다."); 
		
*/		
		
		sc.close();
	}
	
}
