package AmClass;

public class A_TryCatch {
	public static void main(String[] args) throws Exception {
			
		A_TryCatch a =new A_TryCatch();
		a.method1();
		a.method3();
	}
	/**
	 * try-catch
	 * 
	 * try{
	 *    	// 예외가 발새할 소지가 있는 코드
	 * } catch(Exception e){
	 * 		// try 블럭에서 예외가 발생시 실행을 멈추고 catch블럭으로 이동하여
	 * 			예외처리 코드를 실행	
	 * } finally{
	 * 
	 *		// 생략이 가능하며
	 *		// 예외가 발생하거나 예외가 발생하지 않았을경우 모두 실행한다
	 *		// 보통 자원을 반납하는 문장이 작성
	 * }
	 * @throws Exception 
	 */
	public static void method3() throws Exception {
		method2();
	}
	
	public void method1() {
			// 오류가 발생할 소지가 있는 메서드를 try catch 문으로 감싸
			// 오류 처리를할 수 있다
			// ==> 프로그램이 강제 종료되지 않고 계쏙해서 실행될 수 있도록 처리
			// 예외처리 2. 메서드를 호출한 곳으로 오류를 떠넘긴다 => 강제종료의 위험이 있다
			// 예외처리 1. try catch 문으로 처리하기
		try {
			System.out.println("method2()호출전");
			method2();
			System.out.println("method2()호출후");
		} catch (Exception e) {
//			e.printStackTrace();  오류가 나오는 문장을 출력한하는 의미
			System.out.println("method2() 호출 도중 오류 발생");
		}finally {
			// 필수 블럭은 아님
			// 무조건 실행 (오류발생, 오류미발생)
			System.out.println();
		}
	}
			// 메소드를 호출한 곳으로 예외처리를 미룸
	public static void method2() throws Exception {
		System.out.println("method2()호출 중에 예상치 못한 예외가 발생...");
		throw new Exception("강제로 예외를 발생 시켰습니다");
	}
}
