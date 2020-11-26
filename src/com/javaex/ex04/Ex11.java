package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		
/* "1에서 20까지의 수에서 2의배수와 3의배수를 제외한 숫자를 출력하세요" 
 */
		
//continue 문 사용 		
/*		for(int i=1; i<20; i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
		System.out.println(i);
		}
*/		
//for 문 사용
/*		for(int i =1; i<=20; i++) {
			
			if(i%2==0 || i%3==0) {
				//비어있으니 좀 어색하다.
			}else {
				System.out.println(i);
			}
		}
*/
//다른 표현
		for(int i =1; i<=20; i++) {
			
			if(!(i%2==0 || i%3==0)) {
				System.out.println(i);
			}
		
		}
	}
}
