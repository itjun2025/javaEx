package AmClass;

public class Exeption {

	public static void main(String[] args) {

		String str = null;

		// 참조변수가 null값을 가지고 있을때
		// 참조변수로 부터 객체접근연산자(.)을 이용해서 접근할때 발생하는 오류

		try { // 오류가 발생할거같은 코드를 try 코드블럭 안에 넣는다
			str.toString();
			print(str);

		} catch (Exception e) {
			// 오류가 발생했을때 나오는 메세지 입력
			System.out.println("오류가 발생하였습니다");
		}
		// 예외처리
		// 프로그램이 정상적으로 종료될 수 있도록 처리해줍니다.
		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}
	// static 메인메서드에 바로 실행가능하게 해준다
	public static void print(String str) throws Exception {
		// Exception - 최상위 오류
		throw new Exception("강제오류발생");
		
		
	}
}
