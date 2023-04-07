package 실습문제복습;

import java.util.function.BiConsumer;

public class A_Application {

	public static void main(String[] args) {
//		매개변수 생성자를 이용하여 3
//		개의 객체 생성 후 출력
//		setter 메소드를 이용하여 값
//		수정 후 출력
//		getter 메소드를 이용하여 부가
//		세 포함 상품 가격 출력
		A_Product product = new A_Product("asdasd", "갤럭시", "수원", 40000, 10.0);
		A_Product product2 = new A_Product("qweqw", "아이폰", "구로", 300000, 0.6);
		A_Product product3 = new A_Product("qwec", "LG폰", "광명", 700000, 0.5);
		
		System.out.println(product.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		
		System.out.println("==================================");
		
		product.setPrice(120);
		product2.setPrice(120);
		product3.setPrice(120);
		
		product.setTax(0.05);
		product2.setTax(0.05);
		product3.setTax(0.05);
		
		System.out.println(product.information());
		System.out.println(product2.information());
		System.out.println(product3.information());
		System.out.println("================================");
		
		product.sum();
		product2.sum();
		product3.sum();
		
		
		
	}
}
