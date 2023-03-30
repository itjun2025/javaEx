package yesterday;

public class KumhoTire  extends Tire{
	
	public KumhoTire(String locationint, int maxRotation) {
	//부모가 가진 생성자를 호츨
	// 생성자를 만들면 기본생성자가 생성되지 않습니다
	
		super(locationint, maxRotation+2);
		

	}
	@Override
	public boolean roll() {
		
		
			rotation++;	// 타이어 1회전
			System.out.println("금호타이어*****" + location + "누적 회전수 : " + rotation );
			System.out.println("금호타이어*****" + location + "최대 회전수 : " + maxRotation);
			
			if (rotation>=maxRotation) {
				// 바퀴 교체해야 한다고 알려줌
				return false; 
			}
				return true; // 계속 굴러가도돼
		}		
	}


