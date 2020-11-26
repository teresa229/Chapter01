package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num; //사용자  입력값
		int sum= 1;
		
		System.out.println("숫자를 입력하세요[0이면 종료]");

/*		
		do {		
			num = sc.nextInt(); //무조건 받아야 하는 숫자이므로 do 안으로~
			sum = num + sum;
			System.out.println("합계: "+ sum);
		}while(num != 0);  //(!(num==0)) //true면 do{}공식을 해결하려한다. num이 0이면 false라 끝나버린다.	
		
		System.out.println("종료");
*/
		
		
//다른 표현
		while(true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: "+ sum);	
			if(num == 0)
			break;
		}
		System.out.println("종료");
		
	sc.close();
	}
}
