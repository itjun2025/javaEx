package Pmclass;

// final 키워드 : 부모클래스가 될 수 없음

//public final class Airplane {} -> 오류
public class Airplane {
 

	public void land() {
		System.out.println("착륙 합니다");

	}
// final 키워드 메서드에 붙었을때 : 메서드를 재정의 할 수 없다
//	public final void fly() {}
	public void fly() {
		System.out.println("일반비행 입니다");

	}

	public void takeoff() {
		System.out.println("이륙 합니다");

	}

}
