package com.library.vo;

public class Book {

	private int no;		// 도서 일련번호
	private String title;	// 도서명
	private String rentyn;	// 도서대여여부
	private String author;	// 작가
	
	// 도서를 추가할 경우 도서명과 작가명만 일고 있으면 생성 가능 no 는 시퀀스 이용
	public Book(String title,String author) {
		
		this.title = title;
		this.author = author;
		// 신규도서이므로 N
		this.rentyn = "N";
	}
	
	
	// 생성자
	public Book(int no, String title, String rentyn, String author) {
		super();
		this.no = no;
		this.title = title;
		this.rentyn = rentyn;
		this.author = author;
	
		}
	
	@Override
	public String toString() {
		String rentYNStr = "";
		
		// 도서가 rentYN = Y(대여중)인경우 "대여중" 으로 표시
		if ("Y".equals(getRentyn())) {
			rentYNStr = "대여중";
		}		return getNo()	
				+ " " + getTitle()
				+ " " + getAuthor()
				+ " " + rentYNStr; }
	
		
	// getter : 객체의 필드 값을 반환하는 메소드입니다. 주로 필드 값을 읽어올 때 사용됩니다.
	// setter : 객체의 필드 값을 설정하는 메소드입니다. 주로 필드 값을 변경할 때 사용됩니다.

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRentyn() {
		return rentyn;
	}
	public void setRentyn(String rentyn) {
		this.rentyn = rentyn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
