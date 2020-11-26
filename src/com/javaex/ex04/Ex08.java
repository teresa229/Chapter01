package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
	/*	for(int yline=1; yline<=6; yline++) {
			
			for(int xline=1; xline<=yline; xline++) {
			System.out.print("*");
			}
			System.out.println("");
		}
	*/
		
		//혼자 다른 계산 해봄.. 결과는 같은 데 맞는 상황인지 확인이 필요하다...sos
			for(int yline=1; yline<=6; yline++) {
			for(int xline=0; xline<yline; xline++) {
				System.out.print("*");
				}
				System.out.println("");
			}
			
			
	}
	
}
