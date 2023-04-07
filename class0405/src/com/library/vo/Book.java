package com.library.vo;

public class Book {
	
	// 일련번호
	private int no;
	// 책 제목
	private String title;
	// 작가
	private String author;		
	// 대여여부
	private boolean isRent;
	
	//생정자
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
		
		
	}
	
	
	@Override
	public String toString() {      //object가 가지고있는 상속 메서드
		// TODO Auto-generated method stub
		return getNo() +" "+ getTitle()+" "+getAuthor()+" "+isRent;
	}
	
	public String info() {
		String str = "";
		if (isRent) {
			str= "대여중";
		}
		return  getNo() +" "+ getTitle()+" "+getAuthor()+" "+isRent;
	}
	
	// getter setter
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isRent() {
		return isRent;
	}
	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}		
	
	
}
