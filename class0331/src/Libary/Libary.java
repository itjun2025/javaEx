package Libary;

import java.util.ArrayList;
import java.util.List;

public class Libary {
	
	// List는 인터페이스 이므로 객체생성 불가능
	// 그래서 구현체인 ArrayList 사용
 	private List<Book> booklist = new ArrayList<>();

	public Libary() {
		
	}
	
	public Libary(List<Book> booklist) {
		super();
		this.booklist = booklist;
	}
	
	/**
	 * 책 추가
	 * @param title
	 * @param author
	 */
	public void addbook(String title , String author) {
		Book book = new Book(title, author);
		booklist.add(book);
		
	}
	
	@Override
	public String toString() {
		for(Book book : booklist) {
		System.out.println(book.getTitle() +"/"+ book.getAuthor()+"/"+book.getIsRent());	
		}
		return super.toString();
	}
	
	
	
}
