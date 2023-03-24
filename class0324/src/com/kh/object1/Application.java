package com.kh.object1;

import com.kh.object.practice.Product;

public class Application {

	public static void main(String[] args) {

		// 5. 생성자 호출

		// 매개변수 생성자를 이용하여 3개의 객체 생성 (위의 사용데이터 참고)
		Product product1 = new Product("ssgont9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product product2 = new Product("lgxnote5", "LG스마트폰", "경기도평택", 780000, 0.7);
		Product product3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);

//		System.out.println(product1.getId()+ " " + product1.getName()
//		+ " " + product1.getSite()+ " "+ product1.getPrice()+" "+ product1.getTax()); 
		// ----> 일일히 하기 번거로워서 메소드로 만듬

		// 6. 객체가 가진 필드 값 출력 확인
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());

		System.out.println("\n====================================\n");

		// 7. 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		product1.setPrice(1200000);
		product2.setPrice(1200000);
		product3.setPrice(1200000);

		product1.setTax(0.05);
		product2.setTax(0.05);
		product3.setTax(0.05);

		// 8. 객체가 가진 필드 값 출력 확인
		System.out.println(product1.information());
		System.out.println(product2.information());
		System.out.println(product3.information());

		System.out.println("\n====================================\n");

		// 9. 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// 실제가격 = 가격 + (가격 * 부가세율)

		product1.sum();
		product2.sum();
		product3.sum();
		

	}
}
