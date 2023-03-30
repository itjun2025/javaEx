package yesterday;

public class Tire {
	
	// 타이어가 생성될때 매개변수에 의해 초기화
	public int maxRotation;				// 최대 회전수
	public int rotation;				// 누적 회전수
	public String location;				// 타이어의 위치
	
	
	public Tire(String location , int maxRotation) {
//		super(); 생략가능 
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	/**
	 * 타이어 1회전 -
	 * 1번 실행 할때마다 rotation(누적회전수)를 증가시킵니다
	 * 만약 maxPotation(최대회전수)보다 크면 false를 리턴합니다.
	 */
	
	public boolean roll() {
		rotation++;	// 타이어 1회전
		System.out.println(location + "누적 회전수 : " + rotation );
		System.out.println(location + "최대 회전수 : " + maxRotation);
		
		if (rotation>=maxRotation) {
			// 바퀴 교체해야 한다고 알려줌
			return false; 
		}
			return true; // 계속 굴러가도돼
	}
	
	
}
