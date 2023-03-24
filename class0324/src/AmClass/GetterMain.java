package AmClass;

public class GetterMain {
	public static void main(String[] args) {
	 
		Getter car = new Getter();
		// private 접근제한자를 이용한 경우
		// 필드에 직접 접근할 수 없으므
		// setter메서드를 이용해서 필드의 값을 변경 시켜줄 수 있다
		car.setSpeed(-50);
		System.out.println("현재 속도는 : " + car.getSpeed() );
		
		car.setSpeed(50);
		System.out.println("현재 속도는 : " + car.getSpeed() );
		
		// 멈춤: true / 생성되었을때 : false 
		// 멈추지 않은 상태라면 멈추는 메서드를 호출
		// 상태확인
		if (!car.isStop()) { //=> 아니야? 차가 멈춰있는지
			car.setStop(true); //=> 멈춰있다면 멈춰
		}
		
		car.setStop(true);
		System.out.println("현재 속도는 : " + car.getSpeed() );
		
		
	
	
}
	
}
