package Libary;

import java.util.ArrayList;
import java.util.List;

public class LIbary2 {

	// 책 리스트를 생성
	// 길이가 자동으로 늘어나면서 자료가 저장됩니다.
	//  <Book> 타입을 넣을거야
	private List<Book> booklist = new ArrayList<>();
	
	public LIbary2 () {
		
	}

	public LIbary2(List<Book> booklist) {
		// 초기화
		this.booklist = booklist;
	}
	
	public boolean addBook(String title, String author) {
		// 외부로부터 받아온 매개변수를 활용하여 책을 생성
		Book book = new Book(title, author);
		// 맨 마지막에 인덱스를 추가하고 객체를 저장
		return booklist.add(book);
		
	}
	public void removeBook(int index) {
		 Book book =  booklist.remove(index);
		 System.out.println("삭제되었습니다." + book.toString());
	}
	
	public void update(int index) {
		/*
		 * 1. 인덱스에 들어있는 책을 꺼내오기
		 * 2. 렌트여부 수정
		 * 3. 책 저장하기
		 */
		
		 Book book =booklist.get(index);
		 book.setIsRent(true);
		 booklist.set(index, book);
		
	}
	
	@Override
	public String toString() {
		int i = 0;
		// 책의 목록을 출력
		for(Book book: booklist) {
		System.out.println(i +" : " + book.toString());	
		i++;
		}
		return super.toString();
	}
}
