package com.kh.object.practice;

public class Book {

	// 1. 필드
	private String title; // 도서명
	private int price; // 가격
	private double discounRate; // 할인율
	private String author; // 저자명

	// 2. 생성자
	public Book() {

	}

	public Book(String title, int price, double discounRate, String author) {
		super();
		this.title = title;
		this.price = price;
		this.discounRate = discounRate;
		this.author = author;
	}

	// 3. 메소드
	public String information() {
		//		return null;
		return getTitle() + " " + getPrice() + " " + getDiscounRate() + " " + getAuthor();
	}

	// 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
	// 할인된 가격 = 가격 – (가격 * 할인율)
	public void sale() {
		System.out.println("도서명 =" + getTitle());
		int res = (int) (getPrice() - (getPrice() * getDiscounRate()));
		System.out.println("할인된 가격 =" + res + "원");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscounRate() {
		return discounRate;
	}

	public void setDiscounRate(double discounRate) {
		this.discounRate = discounRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
