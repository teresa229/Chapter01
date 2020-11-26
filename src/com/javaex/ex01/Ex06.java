package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		//자동형변환
		int num01 = 1;
		float num02 = 1.0f;
		float result01 = num01 + num02;
		System.out.println(result01);
		
		//자동형변환2
		long num03 = 12345l; //정수형 //마지막에 소문자 ㅣ을 넣어도 되지만, 대문자로 헷갈리지 않게 넣는다. 여기서는 사실 l을 넣지 않아도 되는 경우이기도 하다.
		float num04 = 1.1f;  //실수형
		
		float result02 = num03 + num04; 
		System.out.println(result02);
		
		////////////////////////////////
		
		//강제형변환
		int i = (int)1112.42323; //방규격을 int로 맞추어줌.
		System.out.println(i);
		
		float var01 = 12.5f;
		int var02 = (int)var01;
		
		//강제형변환: 확대변환
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v02);
		
		//강제형변환: 축소변환(정상)
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v04);
		
		//강제형변환: 축소변환(비정상) //망가지는 사례
		int v05 = 123023290;
		byte v06 = (byte)v05;
		System.out.println(v06);
		System.out.println(v05);
		
		//강제형변환: 실수 -->정수(소수점 이하 없어짐)
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//강제형변환: 정수-->실수()
		int v09 = 3424237; //정수
		double v10 = (double)v09;
		System.out.println(v10); //3424237.0 실수가 되었다.

}
}