package Loop;

import java.util.Iterator;

public class LoopFor {

	public static void main(String[] args) {

		// 반복문 - for문
		// for (초기식; 조건식; 증감식){코드블럭}
		// 초기식 -> 조건식 -> 코드블럭 -> 증감식 -> 조건식 ~~~
		// 1~100 까지의 합을 구해봅시다
 
		int sum = 0; //          i = i + 2 처럼 변경사용 가능
		for (int i = 1; i <= 100; i++) {
			System.out.println("for문" + i);

			sum += i;
			//sum = sum + 1;
		}
		System.out.println("1부터 100까지의 합은 " + sum + " 입니다.\n");
		
		
		// while 문 
		int i = 0;
		// i = 0,1,2,3,4
		while (i++ < 5) {
			System.out.println("while 출력" + i);
			
		}
	}
}
