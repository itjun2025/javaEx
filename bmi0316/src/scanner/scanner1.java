package scanner;

import java.net.SocketOption;
import java.util.Scanner;

public class scanner1 {
	public static void main(String[] args) {

		// 스캐너 객체를 사용하기 위해 생성합니다.
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("==================BMI=================");
			System.out.println("키를 입력해주세요(m)");
			double height = scan.nextDouble();
			
			System.out.println("몸무게를 입력해주세요 (kg)");
			double weight = scan.nextDouble();
			
			double bmi = weight / (height * height);
			
			System.out.printf("당신의 BMI는 %.2f 입니다\n.", bmi);// %.2f = 소수점 2번째 자리까지 .-- 나온다는 뜻

			if (bmi <= 18.5) {
				System.out.println("저체중");

			} else if (bmi <= 22.9) {
				System.out.println("정상");
			} else if (bmi < 24.9) {
				System.out.println("과체중");
			} else {
				System.out.println("비만");
			}

			System.out.println("q: 종료, 아무키나 입력해주세요");
			// 스트링의 비교는 .equals() 란 함수를 사용한다
			String str = scan.next();
			if ("q".equals(str)) {

				// 반복문을 탈출
				break;
			}
			System.out.println("----------------------------------");

		}

	}

}
