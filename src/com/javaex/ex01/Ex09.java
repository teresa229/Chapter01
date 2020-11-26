package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//관계연산자
		int n1 = 5;
		int n2 = 3;
		System.out.println(n1<n2);  //5<3 --> false
		System.out.println(n1>n2);  //5>3 --> true
		
		System.out.println(n1<=n2); //5<=3 -> false
		System.out.println(n1<=n2); //3<=3 -> true
		
		System.out.println(n1>=n2); //5>=3 -> true
		System.out.println(n1>=n2); //3>=3 -> true
		
		System.out.println(n1==n2); //5==3 -> false
		System.out.println(n1!=n2); //5!=3 -> true 같지 않니? 다르니?의미다. 그래서 맞는 공식이다.
		
		//등호는 모두 오른쪽에 있다.
		
		boolean result = n1 != n2;
		boolean result01 = (n1 != n2);
		System.out.println(result01);
}
}