package com.javaex.ex04;

public class Ex09 {
	
	public static void main(String[] args) {

//예제1 : 몇번이 될줄 모르니 무한 반복이라 break를 걸어줌.
/*		int num = 1;  //초기값을 0이 아닌 1로 해주어야 한다. 0이면 6의 배수 14의 배수 모두를 성립해 버린다.
		
		while(true){

			if(num%6==0 && num%14==0) {
				System.out.println(num);
				break;
			}
			num++;
		}
		//가장 가까운 반복문을 끝내라고 알려주는 break;
	}
}
*/

//예제2 1부터 100까지의 수 중에 성립하는 결과를 찾아라.(범위가 정해져서 횟수를 좀 잡을 수 있을 때)
		for(int no = 1; no<=100; no++) {
			if(no%6==0 && no%14==0) {
				System.out.println(no);
				break;
			}
		}
		}
	}