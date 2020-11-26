package com.javaex.ex01;

public class Ex04 {

	public static void main(String[] args) {
		
		char ch01 = 'A'; //따옴표 안에 한글자만 넣을 수 있다. 대문자 소문자 상관없음. basic
		System.out.println(ch01);
		
		char ch02 = '한';
				System.out.println(ch02);
				
		//비교 --코드표에서 65를 찾아서 A가 나온 것이다. 오류가 안나오기 때문에 조심해야한다.
		char ch03 = 65;
		System.out.println(ch03); //글자는 다옴표
		
		//문자열
		String str = "안녕하세요"; //반드시 첫글자 대문자
		System.out.println(str);
		
		char str01 = '안'; //한글자일 때는 char을 사용해도 되지만, 여러 글자가 오면 사용할 수 없다.
		String str02 = "안"; //한글자 이상이면 반드시 String을 사용해야 한다. 암기해버리기.
		System.out.println(str01);
		System.out.println(str02);
			
		
	}

}
