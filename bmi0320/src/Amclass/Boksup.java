package Amclass;

import java.util.Scanner;

public class Boksup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		asdf: while (true) {

			System.out.println("====================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("====================================");
			System.out.println("선택>");

			int input = scan.nextInt();
			switch (input) {

			case 1:
				System.out.println(" 예금액> ");
				money = money + scan.nextInt();
				System.out.println(money + " 원");
				break;
			case 2:
				System.out.println(" 출금액> ");
				int num = 0;
				num = num = scan.nextInt();
				if (money < num) {
					System.out.println(" 잔액이 부족합니다");

				} else {
					money -= num;
					System.out.println("출금액 : " + num+ "원");
				}

				break;
			case 3:
				System.out.println("현재 잔고는" + money + "원");
				break;
			case 4:

				break asdf;
			default:
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}

//	public static void main(String[] args) {
//		int sum =  0;
//		for (int i = 2; i < 10	; i++) {
//			System.out.println(i + "단");
//			
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}System.out.println(i +" 단을 종료합니다");
//		}
//		System.out.println("종료합니다");
//	}