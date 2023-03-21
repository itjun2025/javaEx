package PmClass;

public class arrayEx7 {              // 1차원 배열 string 타입

	public static void main(String[] args) {

		String[] names = {"홍길동","가나다","마바사","다시마","너구리"};
		
		//(타입 변수명 : 배열) {}
		for(String bob : names) {
			
			System.out.println("이름 : " + bob);
		}
		
		
	}

}
