package com.library1;

import java.util.ArrayList;
import java.util.List;

import Dao.DataBaseDao;
import Dao.FileDao;
import Dao.Dao;

public class Library {

	// 도서리스트	- 메모리= 프로그램종료시 사라짐
	private List<Book> bookList = new ArrayList<>();
	
	// data access object 데이터의 입출력
	private Dao dao = null;
	
	
	/**
	 * 생성자
	 */
	public Library(String confDao) {
		
		if ("db".equals(confDao)) {
			dao= new DataBaseDao();
		}else {
			dao = new FileDao();
		}
		// 책의 리스트를 조회 (파일또는 DB를 이용해서 조회)
		// 책을 생성해서 리스트에 담아줄게요
		// TODO : 일련번호가 겹치지 않았으면 좋겠다!
		
		// 데이터베이스를 이용 할 경우 번호를 기본키로 사용시 
		// 중벅된 번호는 입력이 안되므로 오류 발생
		bookList.add(new Book(1, "책1", "작가1", false));
		bookList.add(new Book(2, "책2", "작가2", false));
		bookList.add(new Book(3, "책3", "작가3", false));
		bookList.add(new Book(4, "책4", "작가4", false));
	}
	
	
	/**
	 * 신규도서 추가
	 * @param no
	 * @param title
	 * @param author
	 * @param isRent
	 * @return
	 */
 public boolean insertBook(int no, String title,
		 						String author, boolean isRent) {
	 // 리스트에 책을 추가합니다
	 Book book = new Book(no, title, author, isRent);
	 bookList.add(book);
	 dao.insertBook(book);
	 return true; 
	 
	 
 }
 
 /**
  * 책 삭제하기
  * @param index
  * @return
  */
 public boolean deleteBook(int index) {
	
	for(Book book : bookList) {
		if (index== book.getNo()) {
			return bookList.remove(book);
		
		}
	}
	System.err.println("일련번호를 찾을수가 없습니다.");
	return false;
}
 
 public boolean returnBook(int index) {
	for (Book book : bookList) {
		if (book.getNo()==index) {
			// 도서가 대여가능한 상태
			if (!book.isRent()) {
				System.out.println("반납가능한도서아닙니다 ");
				return false;
			}
			//  대여여부변경 = 책을정보를수정
			book.setRent(false);
			return true;
			
		}
	}
	System.err.println("도서를찾을수업습니다");
	return false;
}
 
 
 // 인덱스번호가 없는경우 메세지 처리후 flase 반환 
 // 대여하기
 
 
 
 	/**
 	 * 책 대여
 	 * 책의 일련번호를 매개변수로 받아서 isRent값을 수정 합니다.
 	 * @param index
 	 * @return
 	 */
 	public boolean rentBook(int index) {
 		
 		for(Book book : bookList) {
 			// 사용자가 입력한 일련번호가 존재하는 경우
 			if (book.getNo()==index) {
 				System.out.println("isrent :"+ book.isRent());
 				// 이미 대여중인 경우 대여불가
 				if (book.isRent()) {
					System.err.println("이미 대여중인 도서입니다.");
					return false;
				}
 				book.setRent(true);
 				
 				bookList.remove(book);
 				return true;
 				
 			}
 		}
 		System.err.println("일련번호에 해당하는 도서를 찾지 못했습니다.");
 		return false;
 	}
 
 	// 리스트정보를 출력합니다
 	public void info() {
		// 리스트를 돌변서
 		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
 		for(Book book :bookList) {
			// 책의 정보를 출력
			book.info();
		}
 		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
	}
 	
 	public static void main(String[] args) {
		
 		// 라이브러리 생성
 		Library lib = new Library("db");
 		// 도서 list 출력
 		lib.info();
 		// 신규 도서등록
 		lib.insertBook(5, "책5", "저자5", false);
 		lib.deleteBook(10);
 		// 도서대여
 		lib.rentBook(1);
 		// 도서 리스트 출력
 		lib.info();
 		//도서대여후출력
 		lib.rentBook(1);
 		lib.info();
 		
 		// 도서반납후출력
 		lib.returnBook(1);
 		lib.info();
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}
 
 
}
