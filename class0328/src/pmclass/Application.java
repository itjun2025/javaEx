package pmclass;

public class Application {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		// 차량이 달립니다
		driver.drive(new Vehcile());
		
		// bus가 Vehicle을 상속받아서 구현 되었으므로
		// Vehicle로 자동 형변환 될수있다
		// ***** 부모의 매서드가 오버라이딩(재작성) 된 경우자식 메서드를 호출한다 *****
		// 매개값으로 어떤 자식 객체가 제공되는가에 따라 메소드 실행 결과가 다양해짐
		driver.drive(new Bus());
		
		// Vehicle  타입을 상속받아서 구현된 클래스만 형변환이 가능하다
//		driver.drive(new Tsxi());
	}
}
