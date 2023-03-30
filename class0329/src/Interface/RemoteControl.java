package Interface;

public interface RemoteControl {
	// 생성자를 가질 수 없다
	// 인스턴스 필드도 가질 수 없다
	// -> 상수 사용가능
	// 추상메서드를 가지고 있음
	
	// static final을 자동으로 붙여줍니다
	// 상수 : 대문자,언더바 사용
	public int MAX_VOLUUE = 10;
	public int MIN_VOLUME =0;
	public String MMMMM_MMMM =  "홍길동";
	
	// 추상메서드 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
