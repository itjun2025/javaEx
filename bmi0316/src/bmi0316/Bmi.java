package bmi0316;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // scanner()괄호는 매개변수를 넣어야한다 sys.in
		System.out.println("키를 입력해 주세요: ");
		// 변수이름 . 을 누르면 메서드 알려줌

		String height = scan.next(); // 스캐너가 가지고 있는 next란 메서드 반환타입 = string
		System.out.printf("당신의 키는 %s 입니다.\n", height);

		// 몸무게를 입력해주세요:
		// 몸무게를 입력 받고 출력

		// scanner가 사용하고 있던 리소스를 반납 마지막에
		// scan.close();

		System.out.println("몸무게를 입력해 주세요");
		String weight = scan.next();
		System.out.printf("당신의 몸무게는 %s 입니다.\n", weight);

		double dHeight = Double.parseDouble(height);// 숫자실수형태를 string형태로 변환해준다
		double dweight = Double.parseDouble(weight);

		System.out.println("당신의 Bmi는 " + dweight / (dHeight * dHeight) + "입니다");

		scan.close();

	}

}
