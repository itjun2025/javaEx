package Amclass;

import java.util.Scanner;

public class AmEx0407 {	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int money = 0;
		outter: // 라벨 (이름) 을 붙여줍니다. - 다른이름 가능
		while (true) {
			System.out.println("================================");	
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("================================");
			System.out.println("선택>");

			// scan.next() : 사용자의 입력을 문자열로 반환
			int input = scan.nextInt(); // 사용자의 입력을 (int)숫자 타입으로 반환
			// switch (변수) {
			// case 변수의 값 :
			// }

			// input 이 1 이면 실행합니다.
			switch (input) {
			// input == 1
			case 1:
				// 변수의 값이 1이면 실행
				// 코드 작성
				System.out.println("예금액> ");
				money += scan.nextInt();
				System.out.println("예금 할 금액 :" + money);

				// break 문이 없으면 다음 case 를 계속해서 실행 합니다.
				break;

			case 2:

				System.out.println("출금액> ");
				int num = scan.nextInt();
				System.out.println("출금 : " + num+ " 원");

				if (money < num) {
					System.out.println("금액이 부족합니다");

				} else {
					money -= num;
				} // money = money - num

				break;

			case 3:

				System.out.println("잔고 :" + money + "원 남았습니다.");
				break;

			case 4:

				// System.exit(0); 사용 가능하지만 라벨 사용 권장
				break outter;
			default:
				break;

			}
		}
		//자원을 반납!
		scan.close();
		System.out.println("=========== 종료 ===========");
	}

}
