package Pmclass;

public class SupersonicMain {
	public static void main(String[] args) {
		SupersonicAirplane sonic = new SupersonicAirplane(SupersonicAirplane.NORMAL);
		
		// 이륙합니다
		sonic.takeoff();
		sonic.fly();
		
		// 가독성을 높여주기 위해 상수를 사용
		sonic.flyMode = SupersonicAirplane.SUPERSONIC;
		sonic.fly();
		
		sonic.flyMode = SupersonicAirplane.NORMAL;
		sonic.fly();
		
		// 착륙
		sonic.land();
	}
	
}
