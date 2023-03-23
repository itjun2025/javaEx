package AmClass;



public class Calculator1 {

	// true : 켜짐 , false : 꺼짐
	boolean poweron; // 초기값 : false

	/**
	 * 전원을 키거나 끕니다
	 */
	public void poweron() {

		if (poweron) { // true 를 넣어도 되지만 필드에 poweron이 boolean 타입이기 때문에 넣어도 된다
			poweron = false;
			System.out.println("계산기를 종료합니다");
		} else {
			poweron = true;
			System.out.println("계산기를 실행합니다");
		}
	}

	public int add(int num1, int num2) {
		if (poweron) {
			return num1 + num2;

		} else {
			System.out.println("계산기를 실행 해주세요");
			return 0;
		}

	}
	
	public int add(int[]numbers) {
		int sum = 0;
		for(int num : numbers) { 
			sum += num;
		}
		return sum;
	}
	// 배열로 들어온다
	public int addFn(int...numbers) {
		int sum = 0;
		for(int num : numbers) {
			 sum +=num;
		}return sum;
		
		
	}
	

}
