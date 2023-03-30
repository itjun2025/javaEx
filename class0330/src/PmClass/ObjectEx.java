package PmClass;

public class ObjectEx {

		
	/**
	 * - API 는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다
	 * - 자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음을 말한다.
	 * 	 (라이브러리라고도 한다)
	 * @param args
	 */
		public static void main(String[] args) {
			String str = ""; // -> Object
			print(str);
			System.out.println("===================");
			int num = 0; // -> Integer -> object
			// int 타입은 기본타입이므로 object 타입으로 변환되지 못합니다.
			// int 타입의 객체형태로 변환해야 합니다
			// ==> Wrapper클래스인 Integer타입으로 자동 형변환되어져서 들어간다

			// int -> Integer
			// double -> Double
			// 기본타입 : 값 자체를 저장
			// 참조타입 : 주소를 저장한다
			// . : 주소접근연산자
			
			 
			print(num);
			System.out.println("====================");
			ObjectEx objEx = new ObjectEx();
			print(objEx);
			
		
		}
		
		// 참조타입의 최상위 계층 -> Object
		// 부모타입으로 자동형변환
		public static void print(Object obj) {
			// object클래스에 toString이 정의되어 있지만
			// 메서드의 오버라이딩에 의해서
			// String 클래스, Integer 클래스에 정의되어 있는 메서드가 호출된다
			
			// obj.toString() = 클래스이름@16진수주소값을 반환
			System.out.println(obj.toString());
			
			// 두객체가 가지고있는 주소값이 같은지 비교
			// 주소가 같으면 true 다르면 false
			obj.equals(new Object());
		}
}
