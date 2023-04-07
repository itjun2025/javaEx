package Dao;

import java.util.List;

import com.library1.Book;

public class DataBaseDao implements Dao {

	@Override
	public List<Book> getBookList() {
		System.out.println("DB-리스트 조회");
		return null;
	}

	@Override
	public int insertBook(Book book) {
		System.out.println("도서정보입력");
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
		System.out.println("도서정보 업데이트");
		// TODO Auto-generated method stub
		return 0;
	}

}
