package com.library.controller;

import java.util.Scanner;

import com.library.service.BookService;
import com.library.service.MemberService;
import com.library.vo.BookVo;
import com.library.vo.MemberVo;


/**
 * 사용자의 요청을 입력 받습니다.
 * 요청에 맞는 서비스 로직을 호출 합니다.
 * @author user
 *
 */
public class LibraryController {
	
		BookService bookService = new BookService();
		MemberService memberService = new MemberService();
		
		public void start() {
			System.out.println("===============");
			System.out.println("도서관에 오신걸 환영 합니다.");
			System.out.println("===============");
			
			while(true) {
				
				
				// 로그인 요청
				
				MemberVo memberVo = login();
				
				bookService.getlist();
				
				if ("Y".equalsIgnoreCase(memberVo.getAdminYN())) {
					//관리자 계정
					adminMenu();
					
				}else {
					//사용자 계정
					userMenu();
				}
			}
			
		}
		
		public void adminMenu() {
			
			int res = 0;
			outter :
			while(true) {
				
				
				System.out.println("관리자 메뉴 ==========");
				System.out.println("1. 도서등록 2. 도서삭제"
						+ "3. 사용자등록 4. 사용자삭제 "
						+ "0. 이전메뉴 q. 종료");
				
				System.out.println("메뉴를 입력해주세요");
				int menu = getInt();
				// 일련번호
				int bookNo = 0;
				String id = "";
				String author = "";
				switch (menu) {
				case 1:
					// 도서등록
					System.out.println("도서일련번호를 입력해주세요");
					bookNo = getInt();
					System.out.println("도서명을 입력해주세요");
					String title = getString();
					System.out.println("작가를 입력해주세요");
					author = getString();
					
					bookService.insertBook(new BookVo(bookNo, title, author, "N"));
					break;
				case 2:
					// 도서삭제
					System.out.println("삭제할 도서의 일련번호를 입력해주세요");
					bookNo = getInt();
					bookService.deleteBook(bookNo);
					
					
					break;
				case 3:
					// 사용자등록
					System.out.println("아이디를 입력해주세요");
					id = getString();
					System.out.println("비밀번호를 입력해주세요");
					String pw = getString();
					System.out.println("이름을 입력해주세요");
					String name = getString();
					System.out.println("관리자계정은 Y를 입력해주세요");
					String adminYNStr = getString();
					String adminYN = adminYNStr.equalsIgnoreCase("y")?"Y":"N";
					
					//new MemberVo(id, pw, name, name)  방법 1.
					//insertMember(id,pw,name);			방법 2.
					MemberVo memberVo = new MemberVo(id, pw, name, adminYN);
					memberService.insertMember(memberVo);
					break;
				case 4:
					// 사용자삭제
					System.out.println("삭제할 아이디를 입력해주세요");
					id = getString();
					
					memberService.deleteMember(id);

					
					break;
				case 0:
					
					
					break outter;
					
				default:
					System.err.println("메뉴를 확인 후 다시 입력해주세요");
					break;
				}
			}
			
			
			
		}
		
		public void userMenu() {
			System.out.println("사용자 메뉴 ============");
			
			while(true) {
				
				System.out.println("1. 도서대여 2. 도서반납 0. 이전메뉴 q. 종료");
				
				int menu = getInt();
				int bookNo = 0;
				switch (menu) {
				case 1:
					System.out.println("대여할 도서의 일련번호를 입력해주세요.");
					bookNo = getInt();
					bookService.rentBook(bookNo);
					break;
				case 2:
					System.out.println("반납할 도서의 일련번호를 입력해주세요.");
					bookNo = getInt();
					bookService.returnBook(bookNo);
					
					break;
				case 0:
					
					return;
				default:
					System.err.println("메뉴를 확인후 다시 선택 해주세요");
					break;
				}
			}
			}
		
		
		/**
		 * 로그인
		 * ID/PW를 입력받아서 로그인 처리
		 * 로그인 성공할때까지 반봅
		 * @return
		 */
		public MemberVo login() {
			
			while(true) {
				
				System.out.println("아이디를 입력해주세요");
				String id = getString();
				System.out.println("비밀번호를 입력해주세요");
				String pw = getString();
				
				MemberVo memberVo =  memberService.login(id, pw);
				if (memberVo != null) {
					// 로그인 성공
					return memberVo;
				}
			}
			
			
		}
		
		public static Scanner scan = new Scanner(System.in);
		
		public static String getString() {
			String str = scan.next();
			
			
			
			if (str.equalsIgnoreCase("q")) {
				// q,Q가 입력되면 종료
				System.exit(0);
				
			}
			
			return str;
		}
		
		public static int getInt() {
			int i = 0;
			while(true) {
				
				try {
					
					String str = scan.next();
					
					if (str.equalsIgnoreCase("q")) {
						// q,Q가 입력되면 종료
						System.exit(0);
					}
					
					i =	Integer.parseInt(str);
					return i;
				}
				catch (Exception e) {
					System.err.println(e.getMessage());
					System.err.println("숫자 입력중 오류가 발생하였습니다.");
					// TODO: handle exception
				}
			}
				
		}
}
