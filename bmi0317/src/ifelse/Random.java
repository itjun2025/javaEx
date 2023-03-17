package ifelse;

public class Random {

	public static void main(String[] args) {

		// Math.random() 더블 타입이다. 정수 값을 받환하려면 int 타입 변환 해야 한다.
		// 0.0 ~ 1.0 사이의 무작위수를 추출하여 double 타입으로 반환
		// 0.0000...1 ~ 0.999999999...9
		// 10을 곱했을때 0 ~ 9  /  +1 을 하면 --> 1 ~ 10  /  +10 을 하면 --> 10 ~ 19 
		// 100을 곱했을때 00 ~ 99
		
		
		double rotto1 = Math.random(); 
		double rotto2 = Math.random();
		double rotto3 = Math.random();
		double rotto4 = Math.random();
		double rotto5 = Math.random();

		System.out.println(rotto1);
		System.out.println(rotto2);
		System.out.println(rotto3);
		System.out.println(rotto4);
		System.out.println(rotto5);

		int num = (int)(Math.random() * 6) + 1 ;
		
		if (num==1) {
			System.out.println("1번이 나왔습니다");
		}else if (num==2) {
			System.out.println("2번이 나왔습니다");
		}else if (num==3) {
			System.out.println("3번이 나왔습니다");
		}else if (num==4) {
			System.out.println("4번이 나왔습니다");
		}else if (num==5) {
			System.out.println("5번이 나왔습니다");
		}else {
			System.out.println("6번이 나왔습니다");
		}
		
		
		// ---------------------로또 번호 만들기------------------
		
		int lotto1 = (int)(Math.random()*45) + 1;
		int lotto2 = (int)(Math.random()*45) + 1;
		int lotto3 = (int)(Math.random()*45) + 1;
		int lotto4 = (int)(Math.random()*45) + 1;
		int lotto5 = (int)(Math.random()*45) + 1;
		int lotto6 = (int)(Math.random()*45) + 1;
		
		if (num<=45) {
			System.out.printf("로또 번호는 %d,%d,%d,%d,%d,%d, 입니다.",lotto1,lotto2,lotto3,lotto4,lotto5,lotto6);
			
		}
		
		
		
		
		
		
		
		
	}
}
