package AmClass;

// 접근제어자 + class + 클래스 명
public class arrayEx6 {
	// public :  접근제어자	
	// void : 반환 타입이 없다는 의미 "int , String"
	// main : 메서드 이름
	// 매개변수 : (타입 변수명) - 있을 수도 있고 없을 수도 있다 (필수아님)
	// 매개변수가 있다면 타입을 명시해줘야 한다
	public static void main(String[] args) {
		System.out.println(args.length);
		
		// (String[] args) 에 값(매개변수)을 넣어주는 방법 - run 삼각형 -> configurations -> argument
		// 1: 로컬, 2: 테스트, 3: 운영
		int mode = Integer.parseInt(args[0]);
		if (mode==1) {
			System.out.println("로컬환경입니다");
		}else if (mode==2) {
			System.out.println("테스크 환경입니다");
			
		} else if (mode==3) {
			System.out.println("운영 환경입니다.");
			
		}
			
		
		
		for (int i = 0; i < args.length; i++) {
			
			System.out.println(args[i]);
		}
		
		
//		System.out.println(args[0]);
	}

}
