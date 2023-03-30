package com.kh.object1;

import com.kh.object.practice.StaticSample;

public class Application2 {

	public static void main(String[] args) {
		
		// StaticSample 의 value 필드 값을 초기화
		
		// 정적멤버 접근 :
		// 클래스명.필드명 - 필드가 pricate 접근제한자 이므로 직접 접근 안됨
		// 클래스명. 메서드명
		StaticSample.setValue("Java");
		System.out.println("value :"
								+StaticSample.getValue());
		
		StaticSample.toUpper();
		System.out.println("대문자로 변경 :"
								+StaticSample.getValue());
		
		// 2번째 인덱스 값을 3으로 변경
		StaticSample.setChar(2, 'j');
		//인덱스는 0부터 시작되므로 3번째 값을 변경
		System.out.println("3번째 값을 j로 변경"
								+StaticSample.getValue());
		
		StaticSample.valueConcat("QPOWERWORHOP");
		System.out.println("문자열 연결:" 
								+StaticSample.valueConcat("QPOWERWORHOP"));
		
		
	}
}
