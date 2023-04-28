package com.library.service;

import com.library.dao.RentDao;

public class rentService {

	RentDao dao = new RentDao();
	
	
	public String getRentYN(int no){
		String rentYN = dao.getRentYN(no);
		
			return rentYN;
		
		
	}
	/**
	 * 도서대여
	 * 
	 * 대여 테이블에 데이터를 입력 합니다.
	 * @param no : 도서번호
	 * @param id : 아이디
	 */
	public void rentBook(int no, String id) {
		 // 대여가능여부체크
		String rentYN = dao.getRentYN(no);
		if ("Y".equals(rentYN)) {
			System.out.println("이미대여중인도서입니다");
			return;
		}
		int res = dao.insert(id, no);
		
			System.out.println(res + "건 대여되었습니다");
		
	}
	
	/**
	 * 도서반납
	 * 
	 * 반납일과 대여여부를 업데이트 합니다.
	 * @param no : 도서번호
	 */
	public void returnBook(int no) {
		// 반납가능여부 체크
		String rentYN = dao.getRentYN(no);
		if ("N".equals(rentYN)) {
			System.out.println("이미대여중인도서입니다");
			return;
		}
		int res = dao.update(no);
		
			System.out.println(res + "건 반납되었습니다");
	}
}
