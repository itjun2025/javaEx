package Libary;

public class Application {
	
	public static void main(String[] args) {
		LIbary2 lib = new LIbary2();
		
		// 책 추가
		lib.addBook("자바의정석1", "홍길동1");
		lib.addBook("자바의정석2", "홍길동2");
		lib.addBook("자바의정석3", "홍길동3");
		
		// 책 정보 출력
		lib.toString();
		
		System.out.println("삭제할 책 번호를 선택 해주세요");
		int i = 0;
		
		// 책 삭제
		lib.removeBook(i);
		
		// 책 정보 출력
		lib.toString();
		
		// 책대여 : book.isRent = true
		System.out.println("대여할 책 번호를 선택 해주세요");
		i = 0;
		lib.update(i);
		
		// 책 정보 출력
		lib.toString();
		// 검증 : 책 목록의 사이즈보다 큰 값이 입력되었을때 다시 입력 받을 수 있도록
		
		
		
		
		
		
	}
}
