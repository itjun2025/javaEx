package pmclass2;

public class Driver {
		
		public static void main(String[] args) {
			Driver driver = new Driver();
			// 인터페이스의 구현체를 생성하여 매개변수에 넣어줍니다.
			driver.drive(new Bus());
			
		}
		public void drive(Vehicle vechile) {
			vechile.run();
			
			// 원래타입으로 강제형변환
			// 강제형변환시 castingException이 발생할수 있으므로
			// 객체의 생성타입을 먼저 체크한다
			// 객체 instanceop 타입 : 객체가 타입으로 생성되었는지를 체크
			if (vechile instanceof Bus) {
				
				Bus bus =(Bus)vechile;
				bus.checkFare();
			}
	}
}
