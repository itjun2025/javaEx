package AmClass;

public class Getter {

	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		// 필드값을 반환
		return speed;
	}
	public void setSpeed(int speed) {
		// 필드의 값을 변경
		// 검증 후 값을 변경합니다
		if (speed>0) {
			this.speed = speed;
		}else {
			this.speed = 0;
		}
	}
	public boolean isStop() {  // is가 붙은경우 대개 boolean값을 반환한다
		return stop;
	}
	public void setStop(boolean stop) {
		
		if (stop) {
			this.setSpeed(0);
		}
		this.stop = stop;
	}
	
	
		
	
}
