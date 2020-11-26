package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자"); //""문자열을 의미한다.
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(a*b);
		
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("=======");
		System.out.println(7.0/2.0); //정수형 나누기랑 비교 (double/double)로 계산한 경우
		System.out.println(7.0%2.0);
		System.out.println("=======");
		
		//부호연산자
		int var01 = -3;
		System.out.println(var01);
		System.out.println(-var01); //(-(-2));
		System.out.println(+var01); //(-(+2)); 그대로 있다.
		System.out.println("=======");
		
		//증감연산자
		System.out.println(a);
		System.out.println(++a); //a도 변한것일까? ++a만 나온 것일까? 확인해보니 실제 변수 a값이 변경된다.
		System.out.println(a); //a의 값이 바뀌는 것이다. 7에서  ++이 붙으며 8로 바뀐다. 7-->8출력.
		
		System.out.println(b);
		System.out.println(--b);// 실제 변수 b값이 변경된다. 2-->1 출력
		System.out.println(b);
		
		System.out.println("=======");
		System.out.println(a);
		System.out.println(a++); // 올리는 것 같은데 출력상에서 달라진 것은 없다.
		System.out.println(a); //a=8. 8을 출력하고 나서 9로 바뀐다. 다시 찍어보면 9가 나온다.
		
		//앞에 있으면 다른 것부터 하게 된다.
		//뒤에 붙으면 다른 일하고 붙는다.
		
		System.out.println(b);
		System.out.println(b--);
		System.out.println(b);
		
		++b; //올리라는 의미//앞에 println이 있지 않으니
		System.out.println(b);

		b++;
		System.out.println(b);// b앞에 붙이나 뒤에 붙이나 바로 올라간다. 다른 일을 할 것이 없으므로..++b = b++
		
	}
	
}
