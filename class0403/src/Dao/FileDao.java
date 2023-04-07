package Dao;

import java.util.List;

import com.library1.Book;

public class FileDao implements Dao  {

	@Override
	public List<Book> getBookList() {
		// TODO Auto-generated method stub
		System.out.println("신규 리스트 조회");
		return null;
	}

	@Override
	public int insertBook(Book book) {
		// TODO Auto-generated method stub
		System.out.println("신규도서등록");
		return 0;
	}

	@Override
	public int deleteBook() {
		System.out.println("도서삭제");
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBook(Book book) {
		System.out.println("도서정보업데이트");
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
