package com.library.service;

import java.util.List;

import com.library.dao.Bookdao;
import com.library.vo.Book;

public class BookService {
	Bookdao dao = new Bookdao();
	
	
	/**
	 * 책 리스트를 조회합니다.
	 * @return
	 */
	public List<Book> getList(){
		List<Book> list = dao.getList();
		
		for(Book book : list) {
			
			System.out.println(book); // tostring생략됨
		}
			
		return list;
	}

	/**
	 * 도서 정보 입력
	 * @param title
	 * @param author
	 */
	public void insert(String title, String author) {
			Book book = new Book(title, author);
			int res = dao.insert(book);
			if (res>0) {
				System.out.println(res + "건 입력 되었습니다.");
			}else {
				System.err.println("입력중 오류가 발생했습니다.");
				System.err.println("관리자에게 문의해주세요.");
			}
	}

	public void delete(int num) {
		
			int res = dao.delete(num);
			if(res>0) {
				System.out.println(res + "건 삭제되었습니다.");
			} else {
				System.err.println("삭제할 도서가 없습니다.");
				System.err.println("관리자에게 문의해주세요.");
			}
		}

	public void rentBook(int bookNo) {
			
			String rentYN = dao.getRentYN(bookNo);
			if ("Y".equals(rentYN)) {
				System.out.println("이미 대여중인 도서입니다.");
			}else if ("".equals(rentYN)) {
				System.out.println("없는 도서번호 입니다.");
			}
			
			// 대여처리
			int res = dao.update(bookNo, "Y");
			
			if(res>0) {
				System.out.println(res + "건 대여되었습니다.");
			} else {
				System.err.println("대여할 도서가 없습니다.");
				System.err.println("관리자에게 문의해주세요.");
			}
	}

	public void returnBook(int bookNo) {
		int res = dao.update(bookNo, "N");
		if(res>0) {
			System.out.println(res + "건 반납되었습니다.");
		} else {
			System.err.println("반납할 도서가 없습니다.");
			System.err.println("관리자에게 문의해주세요.");
		}
		
	}

//	public void returnBook(int bookNo) {
//		int res = dao.returnBook(bookNo);
//		
//	}
		
	}	

