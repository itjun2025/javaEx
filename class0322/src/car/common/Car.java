package car.common;

public class Car {
	
	// 필드 생성
	String model;
	String cloor;
	int maxSpeed;
	
		// 생성자 오버로딩
		// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	 	// 생성자의 특징 2가지 - 클래스 이름과 같다, 반환타입 없다
	public Car() {
		// 생성자 호출
		// this. : 필드
		// this() : 생성자
		// 생성자를 사용하기 위해서 알맞은 파라메터를 넣어줍니다.
		
		//1. 생성자에서 다른 생성자를 호출할 수 있다
		// 중복되는 코드를 줄이기 위해서
		this("기본모델","색상",150);
		
	} // 기본 생성자
	public Car(String model) {
	// -> 코드블럭 안에서는 로컬변수가 우선되므로 아무런 의마가 없음
	// model = model; 
    //	this.model=model;
	this(model,"",150);
	}
	
	// 생성자 오버로딩
	public Car(String model,String cloor) {
		
		// 생성자를 호출 하는것은 첫번째 줄에서만 가능하다
		this(model,cloor,150);
//		this.model=model; // 위아래 순서 상관 없다
//		this.cloor=cloor;
	}
	public Car(String model,String cloor,int maxSpeed) {
		
		
		this.model=model;
		this.cloor=cloor;
		this.maxSpeed=maxSpeed;
	} 
	
	public Car(String model, int maxSpeed) {
		
		this.model=model;
		this.maxSpeed=maxSpeed;
		
	} 
	
	
	
}
