package pmclass;

public class Driver {
	public void drive(Vehcile vehicle) {
		
		// Vehicle을 상속받아서 구현된 개게가 매개변수로 입력된 경우
		// 부모타입으로 자동 형변환 된경우!!!!
		
		// 만약 vehicle의 원래 타입이 Bus가 맞다면
		// 생성된인스턴스(객체) instance of 타입
		// 나의 원래 성성된 타입
		
		Vehcile v = new Bus();
		Vehcile v1 = new Vehcile();
		
		// now 연산자에 의해서 원래 생성된 타입을 확인
		// 부모타입이 자식타입으로 강제 캐스팅될 경우 오류가 발생
		if (vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			System.out.println("Bus 타입으로 변환 성공");
		}else {
			System.out.println("Bus 타입으로 변환 불가능");
		}
		
		
		vehicle.run();
	}
}
