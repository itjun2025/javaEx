package Pmclass;
// 상속받을때 사용하는 키워드 -> extends + 부모 클래스명
public class SupersonicAirplane extends Airplane {
	
	// 비행모드를 숫자타입으로 정의
	public static final int NORMAL =1;	 // 한번 정의 후 값을 변경할 수 없는 상수이다
	public static final int SUPERSONIC =2;	 // 대문자작성, 단어연결할때는 _ 사용
	
	// 비행상태
	public int flyMode;
	
	// 매개변수를 받아서flyMode를 세팅
	public SupersonicAirplane(int flyMode) {
		// 부모생성자 호출
//		super(); 쓰지 않아도 부모생성자 호출된다
		if (flyMode == NORMAL 
				|| flyMode == SUPERSONIC ) {
			
			this.flyMode=flyMode;
		}else {
			flyMode = NORMAL;
		}
	}
	@Override
	public void fly() {
		// 부모가 가지고 있는 메서드를 자식클래스에서 재정의
		// 메서드를 재정의 해도 기좆ㄴ에 부모가 가진 메서드를 호출할 수 있다
		// super.메서드명();
		if (flyMode==SUPERSONIC) {
			System.out.println("초음속 비행입니다");
		}else {
			// fly()를 다시작성 했지만
			// 부모가 가지고 있는 fly()메서드를 호출할 수 있다
			// super를 이용하여 접근
			super.fly();
		}
	}
	
	 
	public void booster() {
		System.out.println("부스터 작동!!!");
	}
	
}
