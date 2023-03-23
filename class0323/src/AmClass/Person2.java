package AmClass;

public class Person2 {

		protected String name;  // 왼쪽 아웃라인 기호식표로 쉽게 확인가능함
		public int age;
		public double height;
		public double weight;
		 //기본 생성자 : 초기화 담당
		 // 클래스 명과 같은 이름, 반환타입 없다
		public Person2()	{
			// 다른 생성자를 호출 this()
			// 초기화 값을 직접 입력
			this("정우성",30,17.6,60.5); // 매개변수의 타입과 갯수가 일치해야만 호출할 수 있다
			
		}
		public Person2(String name, int age, double height, double weight) {
			// 초기화 해줘야댐 - this.
			this.name=name;
			this.age=age;
			this.weight=weight;
			this.weight=weight;
			
			
		}
		// 접근제한자 반환타입 메서드명(매개변수타입 매개변수명){코드블럭} - 메소드 만들기
		/**
		 * 이름과 나이를 반환
		 * @return 이름,나이
		 */
		public String information() { // 리턴해줘야댐
			return name + "," + age ;
		}
}
