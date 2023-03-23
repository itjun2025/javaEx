package AmClass;

public class Car3 {

	public int gas;

	// 생성자 : gas 초기화 - 생성자 만드는 방법
	public Car3(int gas) {
		this.gas = gas;
	}
	// 달립니다 출력
	public void run1() {
	while(true) {
			System.out.println("달립니다");
		// 내부 메서드를 호출합니다.
			stop();
		//이름, 매개변수의 갯수, 타입이 일치하는 메서드를 찾아서 실행
			sound("빵빵");
			return;
	}
		
	}
	// 멈춥니다 출력 
	void stop() {
		System.out.println("멈춥니다");
	};
	
	// 사운드 빵빵 출력
	void sound(String sound) {
		System.out.println(sound);
	};
	
	//boolean 타입이 반환인 경우 메서드의 이름에 is가 붙는 경우가많다
	// 기름이 0이면false를 반환
	public boolean isLeftGas() {
		if (gas>0) {
			return true;
		}else {
			return false;
		}
	}

	public void run() {
		while (true) {
			if (gas > 0) {
				// gas-=1 / // gas = gas -1
				gas--;
				System.out.println("달립니다");
				System.out.println("남은기름양 : " + gas);
			} else {
				System.out.println("기름이 떨어졌습니다");
				System.out.println("남은기름 :" + gas);
//				break;
//				메서드를 강제 종료
				return;
			}
		}
	}
}
