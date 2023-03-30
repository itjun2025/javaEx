package Interface;

public class Application {
	public static void main(String[] args) {
		
		// 인터페이스는 생성할 수 없지만
		// 참보변수의 타입으로 사용할 수 있다
		
		// 인터페이스의 다형성
		// 인터페이스의 구현체는 인터페이스를 타입으로 가질 수 있다(!)
		// 인터페이스    변수 = new 구현객체;
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		
	    RemoteControl tv = new Television();
	    tv.turnOn();
	    tv.setVolume(5);
	    tv.turnOff();
		
		
		// 상속단계에 있는 부모가 인터페이스를 구현하고 있는경우
		// 인터페이스의 타입으로 생성이 가능하다(!)
		RemoteControl smartTV = new SmartTv();
		smartTV.turnOn();
		smartTV.setVolume(-1);
		smartTV.turnOff();
	    
	
		
		Searchable s = new SmartTv();
		Television television = new SmartTv();
		
		s.search("맛집");
		
	}
}
