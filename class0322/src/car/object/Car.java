package car.object;

	
public class Car {
	// 필드
	// 값을 초기화 해주지 않으면 초기값을 입력한다
	String company = "현대자동차";
	String model = "그랜저";
	int speed; // 초기값 0 인 상태
	boolean engineStart;
	
	//생성자를 생성
	public Car(String company) {
		// 필드의 이름과 매개변수의 이름이 동일한경우 지역변수인 매개변수가 우선됨
		// 결과적으로 블록 내부에서 company 값은 매개변수의 값을 가르키고 있다
		// this : 생성된 객체를 의미 (로컬변수와 이름이 같아서 구분을 짓기 위해 사용)
		this.company = company;
	}
	
	

	// 기본생성자 : 매개변수가 없는 생성자
	// 생성자를 만들지 않으면 컴파일러가 자동으로 만들어주는 생성자
	// 생성자를 하나라도 만들면 자동으로 만들어주지 않는다!!
		public Car() {
		// TODO Auto-generated constructor stub
	}


		// 메서드를 생성
		public void speedup () {
			speed += 10;
		}
}
