package Vo;

import java.util.List;

import Dao.Dao;
import Dao.FileDao;

public class Library {

	List<Book>list = null;
	
	Dao dao = new FileDao();
	
	// 생성자
	public Library() {
		list = dao.getList();
		System.out.println(toString());
	}
	
	// 메소드
	@Override
	public String toString() {
		System.out.println("책목록==============");
		String info="";
		for(Book book : list) {
			info = info + book.toString()+"\n";
		}
		return info;
	}
	
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		for(Book book : list) {
			if (book.getNo()==no) {
				System.out.println("일련번호 중복");
				return false;
			}
			System.out.println("책이 등록되었습니다");
			System.out.println(toString());
		}
		Book book = new Book(no, title, author, isRent);
		
		list.add(book);
		
		boolean res = dao.listToFile(list);
		if (!res) {
			list.remove(book);
			System.out.println("책이등록되지 않았습니다.");
			return false;
		}
		System.out.println("책이 등록되었습니다");
		return true;
	}
	
	
	
	
	
	
}
