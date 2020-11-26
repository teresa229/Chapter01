package com.javaex.ex02;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		String str = "굿모닝";
		char c = '한';
		String s = "한";
		
		String name = "황일영";
		
		String str2 = " 랑 "; //없어서 임의로 만들어 줌.
		
		System.out.println("============");
		
		
		System.out.println("안녕하세요."); //커서가 생긴다.
		System.out.println(str);
		
		System.out.print("안녕");
		System.out.print("하세요!");
		System.out.println("11/11");
		
		System.out.println("============");
		
		System.out.println(2+5);
		System.out.println(i+i);
		
		System.out.println(i+d); //이것으로도 성립이 된다.
		
		double result = i+d;     //원리: double로 자동으로 바뀐 실수 + double = double 형
		System.out.println(result);
		
		System.out.println(str+str); //문자열 str에다  + 문자열 str의 결과 = 문자열 문자열(붙이는 것으로 정해진 규칙, 숫자처럼 더해지지 않지만 붙이기)
		System.out.println(str+str+str); //3번까지도 더 해진다.
	//	System.out.println(str*2);   //곱하기는 되지 않는다.
		
		System.out.println("============");
		
		System.out.println(str+i); // i숫자를 '글자'취급해 버린다.
		System.out.println(str+d); // 실수도 글자 취급해버린다.
		
		String result01 = str+d;   // 문자 + 숫자 -> 결과는 문자
		System.out.println(str+d);
		
	//굿모닝 랑 2345 //-> 띄어쓰기 표현하고 싶다(?)
		System.out.println(str + str2 + i); //방법 1) srt2를 만들어서
		System.out.println(str + " 랑 " + i);//방법 2) 랑의 빈공간을 읽어낸다.

		System.out.println("============");
		
	//char
		System.out.println(c);
        System.out.println(c+c); //코드값을 읽어버림.. 한의 코드를 읽어서 코드끼리 합해버린다.
		System.out.println(c+s); //char 문자열 + 숫자 -> 문자열로 계산해 버린다.
		
		System.out.println("============");
		
	//제이름은 황일영입니다.
		System.out.println(name); //메모리 공간의 이름이 나온다. 공간에서 찾아준다.
		System.out.println("name");	//name이라는 문자열이다.
		System.out.println("제이름은  name 입니다."); //변수가 글자 안에 있으면 글자가 되어버린다.
		System.out.println("제이름은 " + name + " 입니다."); // 문자열 + 어떤 위치의 값 + 문자열
		
		System.out.println("============");
		
	//안녕"하"세요 만들어보자.
		String var01 = "하";
		System.out.println("안녕" + var01 + "세요");    //" "따옴표는 안 생긴다.
		System.out.println("안녕" + "var01" + "세요");  //var01을 읽어낸다.
	//	System.out.println("안 ""+ var01 + " 세요"");// 변수가 아니라 글자가 되어버린다.
		
		System.out.println("안녕\"하\"세요"); // [ \" ] 하나의 세트로 정해진 규칙
		
	//안녕\하\세요
	//	System.out.println("안녕\하\세요"); //기계는 [\] 한개만 있으면 규칙을 넣다 말았다고 생각한다.  
		                                 //규칙 [\]시작해서 [\]하나 더 넣어준다. \\,\"
		System.out.println("안녕\\하\\세요");
		
	//안녕    하세요  (tab 기능)
		System.out.println("안녕\t하세요");
				
	//줄바꿈
		System.out.println("안녕\n하세요");
		System.out.println("안녕\n하\n세요");
	//줄바꿈 같은 표현
		System.out.println("안녕");
		System.out.println("하");
		System.out.println("세요");
	}

}
