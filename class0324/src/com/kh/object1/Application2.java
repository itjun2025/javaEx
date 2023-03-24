package com.kh.object1;

import com.kh.object.practice.Book;

public class Application2 {


	// 할인된 가격 = 가격 – (가격 * 할인율)
	
	public static void main(String[] args) {
		// 기본생성자를 이용하여 첫 번째 Book 객체 생성
		// 객체가 가진 필드 값 출력 확인
		Book java = new Book();
		System.out.println(java.information());
	
		// 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		// 객체가 가진 필드 값 출력 확인
		Book java1  =  new Book("자바의정석", 20000, 0.2, "윤상섭");
		System.out.println(java1.information());
		
		System.out.println("\n======================================\n");
		System.out.println("수정된 결과 확인");
		
		// 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		 java.setTitle("C언어");
		 java.setPrice(30000);
		 java.setDiscounRate(0.1);
		 java.setAuthor("홍길동");
		 
		 // 수정된 내용 출력 확인
		 System.out.println(java.information());
		 System.out.println("\n============================\n");
		 
		 
		 // 각 객체의 할인율을 적용한 책 가격을 계산해서 출력 (메소드 만들기)
		 java.sale();
		 java1.sale();
		 
			
	}
}
