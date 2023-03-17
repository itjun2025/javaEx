package com.jungang;

public class Ex01 {

	public static void main(String[] args) {
		//변수의 선언과 초기화
		// int : 정수를 저장
		// double : 실수를 저장
		//정수형 변수 value를 선언
		int value;
		
		// 컴파일 오류
		// 변수를 선언하고 초기화 하지 않은경우 오류 발생
		//int res = value +10;
		
		//변수 초기화 -> 메모리에 변수가 생성되었다
		value = 10;
		
		int res = value +10;
		
		// print -> 옆으로 출력 , println -> 다음줄에 출력
		System.out.println("결과를 출력합니다");
		System.out.print(res);
		System.out.println("감사합니다");
		
		
		
	}

}
