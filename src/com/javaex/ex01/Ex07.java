package com.javaex.ex01;

public class Ex07 {

    public static void main(String[] args) {

        double v01 = 5/4; // 정수/정수= 정수  - '/'나누기 표시
        //double v01 = int 5/ int 4; -> int인 1 //1--> 1.0
        //정확하게 적는다면  double v01 = (double)(5/4); //1-->1.0
        
        System.out.println(v01);     

        double v02 = (double)5 / 4 ; //5를 강제형인 double로 바꾸겠다.->5.0  5.0/5
        //test로 확인해본다.
        //System.out.println((double)5 / 4 );
        // = 5.0 / 4 -> 1.25
        System.out.println(v02);   

        double v03 = 5 / (double)4 ;  // 5:자동형변환 / 4.0:강제형변환 -> 1.25
        System.out.println(v03);     

        double v04 = (double)5 / (double)4 ;  // double형 나누기 double형 // 5.0/4.0 -> 1.25
        System.out.println(v04);    

        int v05 = (int)1.3 + (int)1.8 ;  // 1:정수 + 1:정수
        System.out.println(v05);    
        
        int v06 = (int)(1.3 + 1.8); // 1.3 + 1.8 -> 3.1  3.1을 int로 바꾸면 3이 된다.
        System.out.println(v06);
        }

}
