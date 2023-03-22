package AmClass;

public class Calculator {
	
		// 필드
		// 접근제한자를 붙이지 않으면 default
		private String name; 
		// private : 외부로부터 제안을 두는 접근제한자
		
		
		// 생성자의 특징 2가지
		// 1. 클래스의 이름과 동일한 이름을 가지고 있다
		// 2. 반환 타입이 없다!!
		// 정수의 합계를 구하는 메서드 두수를 입력받아 두수의 합을 반환
		// 생성자 : new 연산자를 만나서 객체가 생성될때 실행됩니다.
		// 생성자가 없어도 자동 실행된다 - 컴파일러가 자동으로 생성자를 생성해주기 때문
		// 생성자가 생성되면 더이상의 생성자는 없다
	public Calculator (){
		name = "정수계산기";
		//초기화를 한다
		System.out.println(name);
		System.out.println("Calculator()생성자를 실행합니다.");
	}
	/**
	 * 두개의 정수를 입력받아 두수의 합을 반환 합니다
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	// 메서드 만들기
	//    접근제한자 반환타입 메서드명 (매개변수타입 변수명) {           }
	       public    int    add  (int num1, int num2) {
		return num1+num2;
	}
}
