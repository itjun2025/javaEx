package com.library.vo;

import java.util.ArrayList;
import java.util.List;

import com.library.dao.Dao;
import com.library.dao.DataBaseDao;
import com.library.dao.FileDao;

public class Library {
	
	// 책 목록 필드로
	// 필드로 선언시 클래스 내부에서 자유롭게 이용이 가능하다 -> 전역변수
	List<Book> list = null;
	
	// 인터페이스를 타입으로 선언 -> 인터페이스의 구현체를 이용해 생성
	Dao dao = new FileDao();
	
	// 생성자 특징 1. 클래스명과 같은이름 2. 반환타입이 없다
	 public Library() {
		 // 리스트 초기화
		 list =	dao.getList();
		 System.out.println(toString());
	}
	 public Library(String daoType) {
		if (daoType.equals("DB")) {
			dao = new DataBaseDao();
		}
		 
		 // 리스트 초기화
		 list =	dao.getList();
		 System.out.println(toString());
	}
	 
	 @Override
	public String toString() {
		 System.out.println("책 목록 ===========lib");
		 String info = "";
		 for(Book book : list) {
			info += book.toString()+ "\n";
		 }
		return info;
	}
	 
	 // 1. 책의 정보를 받아서 
	 // 2. 리스트에 등록후
	 // 3. 파일로 출력합니다.
	 public boolean insertBook(int no, String title , String author, boolean isRent) {
		
		 // 0. 일련번호 중복 체크
		 for(Book book : list) {
			 if (book.getNo()==no) {
				System.err.println("일련번호가 중복되었습니다.\n확인후 다시 입력해주세요");
				return false;
			}
			 System.out.println("책이 등록 되었습니다.");
			 System.out.println(toString());
			 
		 }
		 
		 // 1. 책을 생성
		 Book book = new Book(no, title, author, isRent);
		 
		 // 2. 리스트에 등록
		 list.add(book);
		 
		 // 3. 리스트를 파일로 출력
	 boolean res = dao.listToFile(list);
	 
	 	 // 4. 파일에 정상적으로 등록이 되지 않은경우
	 	 // 리스트에서 제거
	 	 if (!res) {
		list.remove(book);
		System.err.println("책이 등록되지 않았습니다.\n 관리자에게 문의해주세요");
		return false;
	}
	 	 System.out.println("책이 등록 되었습니다.");
		return true;
	}
	 
	 /**
	  * 책의 일련번호를 입력받아서 리스트에서 삭제합니다.
	  * 리스트를 파일로 출력합니다.
	  * @param no
	  * @return
	  */
	public boolean deleteBook(int no) {
		for(Book book : list) {
			if (book.getNo() == no) {
				// 삭제
				list.remove(book);
				//리스트를 파일로 출력
				Boolean res =  dao.listToFile(list);
				if (!res) {
					// 파일로 출력이 실패할 경우 책을 다시 리스트에 추가합니다.
					list.add(book);
					System.err.println("파일 출력도중 오류 발생하였습니다.");
					return false;
				}
				System.out.println("정상적으로 삭제되었습니다.");
				System.out.println(toString());
				return true;
			}
		}
		System.err.println("일치하는 일련번호가 없습니다.");
		return false;
		
	}

		/** 
		 * 일련번호에 해당하는 책을 찾는다
		 * 책의 상태가 렌트가 가능한 상태 (isRent = false)라면 렌트 (isRent =true)
		 * 렌트가 가능한 상테가 아니라면 메세지 처리
		 * 리스트를 파일로 출력 
		 * @param no
		 * @return
		 */
	public boolean rentBook(int no) {
		for(Book book : list) {
			
			// 일련번호에 해당하는 책을 찾는다
			if (book.getNo()==no) {
				if (!book.isRent()) {
					// 렌트 상태로 변경
					book.setRent(true);
					
					
					
					// 파일로 출력
					Boolean res =  dao.listToFile(list);
					// 데이터베이스 업데이트
					int i = dao.update(no);
					
					if (i>0) {
						System.out.println("처리되었습니다.");
					}else {
						System.out.println("처리도중 오류가 발생하였습니다.");
						book.setRent(false);
					}
					if (!res) {
						book.setRent(false);
						System.err.println("파일로 출력하는데 실해했습니다.");
					}
					System.out.println("정상적으로 도서가 대여처리 되었습니다.");
					System.out.println(toString());
					return true;
				}
				
			}
			
		}
		System.err.println("일련번호를 찾을 수 없습니다.");
		return false;
	}

		
	/**
	 * 일련번호에 해당하는 도서를 찾는다
	 * 도서가 대여중이라면 반납처리
	 * 아니면 (반납가능한 도서가 아닙니다)메세지 처리
	 * @param no
	 * @return
	 */
		public boolean returnBook(int no) {
			for(Book book : list) {
				if (book.getNo()==no) {
					if (book.isRent()) {
						// 반납처리
						book.setRent(false);
						dao.listToFile(list);
						// DB 업데이트 로직 호출
						dao.update(no);
						System.out.println("반납되었습니다");
						return true;
					}else {
						System.err.println("반납가능한 도서가 아닙니다");
					}
				}
			}
			System.out.println("일련번호에 해당하는 책이 없습니다.\n일련번호를 남겨주세요");
			return false;
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
