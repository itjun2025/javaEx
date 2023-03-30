package Pmclass;

// 인터페이스의 구현체는 인터페이스를 타입으로 샤용할 수 있다
public class KumHo implements Tire {

	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}


}
