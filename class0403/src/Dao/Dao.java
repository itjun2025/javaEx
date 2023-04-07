package Dao;
import java.util.List;

import com.library1.Book;

public interface Dao {

	
	List<Book> getBookList(); 
	
	
	// 신규도서 등록
	int insertBook( Book book);
	
	// 도서삭제
	int deleteBook();
	
	// 도서정보 업데이트
	int updateBook(Book book);

}
