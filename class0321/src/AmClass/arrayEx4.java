package AmClass;

import java.util.Iterator;
import java.util.Scanner;

public class arrayEx4 {

	public static void main(String[] args) {
		// new 연산자로 배열을 생성하는 방법
		// string 타입의 배열을 만들어 주세요 총길이는 10 으로
		// 타입[] 변수명 = new 타입[길이]; 길이 - 변수명.lenght
		// 타입에 맞게 기본값으로 초기화 되어 값이 입력된다
		// 정수 0, 실수 0.0, false, 객체 null
		// 배열의 방길이는 변하지 않는다! = 줄이거나 늘릴 수 없다
		String[] names = {"",""};
		int[] score;
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 방을 만들까요:");
		int index = scan.nextInt();
		score = new int[index];
		
		names[0] = "홍길동";
		names[1] = "가나다";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			
		}
	}

}
