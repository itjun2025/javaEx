package com.kh.object.practice;

public class Product {
	// 1. 필드
	private String id; // 상품 아이디
	private String name; // 상품명
	private String site; // 생산지
	private int price; // 가격
	private double tax; // 부가세비율

	// 2. 생성자
	public Product() {
	}
	// 일일히 쓰지 않고 만드는 방법 -> 마 우, source, generate constructor using fields
	public Product(String id, String name, String site, int price, double tax) {

		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
	}

	// 3. 메서드
	/**
	 * 모든 필드의 정보를 출력합니다.
	 * 
	 * @return
	 */
	public String information() {
		// 참조타입일 경우에 null,""
//		 return null;
		return getId() + " " + getName() + " " + getSite() + " " + getPrice() + " " + getTax();

	}

	// 마지막. 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력하는 메소드 만들기
	// 실제가격 = 가격 + (가격 * 부가세율)
	/**
	 * 가격을 계산하고 출력합니다
	 */
	public void sum() {
		System.out.println("상품명 = " + getName());
		int res = (int) (getPrice() + (getPrice() * getTax()));
		System.out.println("부가세 포함 가격 =" + res + " 원");
	}

	// 4. getter, setter 만들기
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPrice() {
		return price;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
