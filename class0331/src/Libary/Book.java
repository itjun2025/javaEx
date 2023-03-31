package Libary;

public class Book {

	private String title;			// 책제목
	private String author;			// 작가
	private Boolean isRent = false;			// 대여여부  false -> 초기값이다 
	
	
	@Override
	public String toString() {
		String str = "";
		if (isRent) {
			 str = "대여중";
		}
		return getTitle() + "/" + getAuthor() + "/" + str ;
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
		
		
		
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
	public Boolean getIsRent() {
		return isRent;
	}
	public void setIsRent(Boolean isRent) {
		this.isRent = isRent;
	}
	
	
}
