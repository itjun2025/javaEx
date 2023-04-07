package Dao;

import java.util.ArrayList;
import java.util.List;

import Vo.Book;

public interface Dao {

	List<Book> getList();
	
	boolean listToFile(List<Book>list);
	
}
