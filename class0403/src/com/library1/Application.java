package com.library1;

import java.util.Scanner;

public class Application {
	
	private static final Application app = null;
	// 인스턴스멤버 -> 생숭후사용할수있다
	// 래퍼런스변수명으로 사용할수 있다
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 인스턴스 멤버는 생성후 사용이 가능
		// scan.next(); -> 오류
		// 생성후 사용해야 합니다
		// app.scan.next();
		Application app = new Application();
	
		// 도서관 생성
		Library lib = new Library("file");
		
		
		//로그아웃처리시 다시 실행
		//로그인 처리
		System.out.println("아이디를 입력해주세요.");
		String id = app.getString();
		
		if ("admin".equalsIgnoreCase(id)) {
			while(true) {
			// 관리자
			// 도서목록 출력
			lib.info();
			// 메뉴확인
			System.out.println("1. 도서등록 2. 도서삭제 0. 로그아웃 q. 프로그램 종료");
			System.out.println("메뉴를 입력 해주세요");
			int menu =app.getInt();
			
			switch (menu) {
			case 1:
		
					
				// 도서등록
				System.out.println("일련번호를 입력해주세요");
				int menu1 = app.getInt();
				int no =0;
				System.out.println("제목을 입력해주세요");
				String title = app.getString();
				System.out.println("작가를 입력해주세요");
				String author = app.getString();
				
				lib.insertBook(menu1, id, id, false);
				break;
			case 2:
				// 도서삭제
				System.out.println("삭제할 책의 일련번호를 입력해주세요");
				no = app.getInt();
				lib.deleteBook(no);
				break;
				case 0:
					System.out.println("로그아웃 되었습니다");
					app.getInt();
					
					
					
					break;
					
				default:
					System.out.println("메뉴 확인 후 다시 입력해주세요");
				}
			}
			
		}
		else {
			app.memberMenu(lib);
		
			}
		}
		
	}
	
	private void memberMenu(Library lib) {
		
		// 사용자
		// 메뉴별로 작업수행
		
		while(true) {
			//도서목록 출력
			lib.info();
			
			//메뉴 확인
			System.out.println("1. 도서대여 2. 도서반납 q. 시스템종료");
			System.out.println("메뉴를 입력해주세요");
			int menu = getInt();
			
			
			if(menu==1) {
				System.out.println("도서번호를 입력해주세요.");
				int index = getInt();
				lib.rentBook(index);
			}else if (menu==2) {
				System.out.println("도서번호를 입력해주세요.");
				lib.returnBook(menu);
			}else if (menu==0) {
				break;
			}
			else {
				System.err.println("메뉴를 확인해주세요");
			}
			
		
	}
	
	
	/**
	 * 사용자로부터 숫자를 입력 받습니다.
	 * @return
	 */
	public int getInt() {
		int i = 0;
		
		while(true) {
			
			try {
			String str = scan.next();
			
			if (str.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
			i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("입력중 오류가 발생했습니다");
				System.out.println("숫자를 입력해주세요");
			}
		}
		return i;
	}
	
	
	/**
	 * 사용자로부터 문자를 입력받습니다
	 * @return
	 */
	public String getString() {
		
		String res = "";
		
		while(true) {
			
			try {
				res = scan.next();
				// 숫자인 경우 다시 받아올 수 있도록
			try {
				// 숫자로 변환 합니다.
				Integer.parseInt(res);
				// 숫자로 변환 되면 입력을 다시 받아올 수 있도록 합니다.
				System.out.println("문자를 입력해주세요");
				continue;
			} catch (Exception e) {
				// TODO: handle exception
				
			}
				
				if (res.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				}
				break;
				
			} catch (Exception e) {
				System.err.println("입력중 오류가 발생했습니다");
				System.out.println("문자를입력해주세요");
			}
		}
		return res;
	}
}
