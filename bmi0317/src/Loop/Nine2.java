package Loop;

import java.util.Iterator;

public class Nine2 {

	public static void main(String[] args) {
		
		// 가장큰 둘레의 for 문 - 2단~9단
		for (int m = 1; m < 10; m++) {
			System.out.println("\n===" + m + "단 ====\n");
			
			// 그 안에 포함 되어있는 for문 -
			for (int i = 1; i < 10; i++) {
				
				System.out.println(m + " X " + i + " = " + (m*i));
				
			}
			
			System.out.println( m +" 단을 종료합니다");
		}
		System.out.println("2~9단까지의 구구단을 종료합니다");
	}
}
