package com.library.controller;
/**
 * 도서대여 시스템
 * 
 * ▶ 사용자로부터 입력을 받아서 
 * 		사용자 용렃에 알맞는 서비르로직을 호출 합니다.
 * 
 * ▶ 로그인
 * 	- 관리자
 * 		메뉴 : 도서등록, 도서삭제, 사용자등록, 사용자 삭제 
 * 	- 사용자
 * 		메뉴 : 도서대여, 도서반납, 도서대여현황
 * 	
 * @author user
 *
 */

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.service.rentService;
import com.library.vo.Member;

public class LibraryController {

	Scanner scan= new Scanner(System.in);
	
	// 서비스 멤버로 등록
	MemberService memberService = new MemberService();
	BookService bookService = new BookService();
	rentService rentService = new rentService();
	
	/**
	 * 도서관리 시스템 시작
	 */
	public void library() {
		System.out.println("=================");
		System.out.println(" 도서관리시스템 v1.0 ");
		System.out.println("=================");
		
		
		while(true) {
			
			// 로그인 메서드 실행문
			Member member = login();
			
			if (member.getAdminyn().equalsIgnoreCase("Y")) {
				// 관리자 메뉴 실행
				adminMenu();
			}else {
				// 사용자 메뉴 실행
				userMenu(member.getId());
				
			}
		}
		
	}
	
	/**
	 * 관리자 메뉴
	 */
	private void adminMenu() {
		
		while(true) {
			bookService.getList();
			System.out.println("======= 관리자 메뉴 =======\n");
			System.out.println("1. 도서등록  2. 도서삭제 "
					+ "3. 사용자등록 4. 사용자삭제 "
					+ "0. 로그아웃 Q. 종료"); //enter치면 + 됨
			System.out.println("\n========================");
			System.out.println("메뉴를 선택해주세요");
			
			int menu = getInt();
			
			switch (menu) {
			case 1: 
				// 도서등록 
				// 사용자로부터 입력받기 - 도서명, 작가명 
				// Controller -> service -> dao -> data처리
				System.out.println("도서명을 입력해주세요");
				String title = getString();
				System.out.println("작가명을 입력해주세요");
				String author =  getString();
				
				bookService.insert(title,author);
				break;
			case 2:
				// 도서 삭제
				System.out.println("삭제할 도서번호를 입력해주세요");
				int num = getInt();
				bookService.delete(num);
				break;
			case 3:
				// 사용자 등록
				System.out.println("==== 사용자 등록 ====");
				
				while(true) {
					System.out.println("아이디를 입력해주세요");
					String id = getString();
					boolean idcheck = memberService.idCheck(id);
					if (idcheck) {
						break;
					}
					
					
				
				
				System.out.println("비밀번호를 입력해주세요");
				String pw = getString();
				System.out.println("이름을 입력해주세요");
				String name = getString();
				System.out.println("관리자 계정이면 Y를 입력해주세요");
				String str = getString();
				String adminYN = str.equalsIgnoreCase("Y")?"Y":"N";
//				System.out.println("한번더 Y를 입려해주세요");
//				String str = getString();
//				String status = str.equalsIgnoreCase("Y")?"Y":"N";
//				
				
				memberService.insert(id,pw,name,adminYN);
				}
				break;
			case 4:
				// 사용자 삭제
				System.out.println("삭제할 아이디를 입력해주세요");
				String delid = getString();
				
				memberService.delete(delid);
				break;
			case 0:
				// 로그아웃
				break;
				
			default:
				System.out.println("메뉴를 확인 후 다시 입력해주세요.");
				break;
			}
		}
		
	}
	
	/**
	 * 사용자 메뉴
	 */
	private void userMenu(String id) {
		
		while(true) {
			// 책 목록 출력
			bookService.getList();
			System.out.println("사용자 메뉴 ===================");
			System.out.println("1. 도서대여 2. 도서반납 0. 로그아웃 4. 종료");
			System.out.println("============================");
			System.out.println("메뉴를 입력해주세요.");
			
			int menu = getInt();
			int bookNo=0;
			
			switch (menu) {
			case 1:
				// 도서대여
				System.out.println("대여 할 도서번호를 입력해주세요.");
				bookNo = getInt();
				rentService.rentBook(bookNo, id);
				break;
			case 2:
				// 도서 반납
				System.out.println("반납 할 도서번호를 입력해주세요");
				bookNo = getInt();
				rentService.returnBook(bookNo);
				break;
			case 0:
				
				break;

			default:
				break;
			}
			
		}
	}






	/**
	 * 로그인 메서드
	 * @return
	 */
	public Member login() {
		
		// 로그인
		while(true) {
			System.out.println("로그인");
			System.out.println("id를 입력해주세요");
			String id =  getString();
			System.out.println("pw를 입력해주세요");
			String pw =  getString();
			
			Member member = memberService.logIn(id,pw);
			// 로그인 성공 - member 객체를 반환
			if (member != null) {
				return member;
			}
			
		}
	}
	
	
	/**
	 * 사용자의 입력을 받아 문자열을 반환합니다.
	 * 문자가 입력될때까지 반복
	 *q,Q 가입력되면 종료
	 * @return
	 */
	private String getString() {
		String str = "";
		
		while(true) {
			
			str = scan.next();
			
			if (str.equalsIgnoreCase("q")) {
				System.out.println("프로그램 종료합니다.");
				System.exit(0); // 0은 종료를 의미
			}
			return str;
		}
		
	}
 
	/**
	 * 사용자의 입력을 받아 숫자를 반환합니다
	 * 숫자가 입력될떄까지 반복
	 * q,Q 가입력되면 종료
	 * @return
	 */
	private int getInt() {
		int i = 0;
		
		while(true) {
			
			try {
				i = scan.nextInt();
				return i;
			} catch (Exception e) {
				String str = scan.next();
				// q,Q 가 입력된 경우 정상 종료
				if (str.equalsIgnoreCase("q")) {
					System.out.println("프로그램 종료합니다.");
					System.exit(0);
				}
				System.err.println(str +"은 입력 불가능 합니다.");
				System.err.println("숫자를 입력해주세요!!!!!");
			}
		}
		
//		return i;
		
	}
}
