package com.library;

import java.util.List;

import com.library.controller.LibraryController;
import com.library.dao.Bookdao;
import com.library.dao.MemberDao;
import com.library.vo.Book;
import com.library.vo.Member;

public class Application {

	public static void main(String[] args) {
		
//		MemberDao dao = new MemberDao();
		
		LibraryController lib = new LibraryController();
		lib.library();
		
//		로그인 테스트
//		System.out.println(dao.login("ADMIN", "1234"));
		
//		아이디체크 테스트
//		System.out.println(dao.idCheck("ADMIN"));
	
//		사용자 추가 insert 테스트		
//		Member member = new Member("user3","1234","사용자3",null,null,null);
//		dao.insert(member);
		
//      사용자 삭제 delete 테스트			
//		dao.delete("user3");
		
		
//		System.out.println("==============================================");
//		Bookdao dao1= new Bookdao();
//		
//		책 insert 테스트
//		Book book = new Book("바다사자2", "김순2");
//		dao1.insert(book);
		
//      책 delete 테스트
//		dao1.delete(5);

//		책 update (대여) 테스트
//		dao1.update(7, "Y");
		
//		getList 테스트
//		List<Book> list = dao1.getList();
//		
//		for(Book book1 : list) {
//			System.out.println(book1.toString());
//		}
//		
//		Book book = new Book("책3", "지은이3");
//		book.toString();
		
		

		
		
		
		
		
		
		
		
		
		
	}	
	}

