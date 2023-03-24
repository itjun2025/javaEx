package com.kh.object.practice;


public class Ex03 {
	public static void main(String[] args) {
		int[]numbers = {5,4,3,2,1,};
		int lottoNum = 0;
		
		for(int num : numbers) {
			if (num == lottoNum) {
				
			}
			
		}
		// 배열을 정렬하고 싶어요!
		// 방을 바꾸기위해 새로운 변수를 선언하고 이용합니다.
		// 스트링의 인덱스도 0번부터 시작
		String str = "안녕하세요!";
		System.out.println("char :"+ str.length());
		
		// 문자열 끊기
		System.out.println(str.length());
		System.out.println(str.substring(0,2));
		System.out.println(str.substring(2,5));
		// 시작인덱스, 끝인덱스
		// 시작인덱스는 포함, 끝 인덱슨느 포함되지 않아요!
//		System.out.println(str.substring(6,7));
}
}
