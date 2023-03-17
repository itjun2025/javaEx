package bmi0316;

import java.util.Scanner;

public class BmiInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// scan 을 썻으면 끝날때 반납해줘야 한다 scan close()

		while (true) {

			// 키를 입력 받는다
			System.out.println("키를 입력해 주세요(단위:m) : ");
			double height = scan.nextDouble();
			System.out.printf("당신의 키는 %s 입니다.\n", height);

			// 몸무게를 입력 받는다
			System.out.println("몸무게를 입력해 주세요(단위:kg)");
			double weight = scan.nextDouble();
			System.out.printf("당신의 몸무게는 %s 입니다.\n", weight);

			// bmi 를 출력한다
			System.out.println("bmi를 입력해주세요");

			double bmi = weight / (height * height);

			System.out.printf("당신의 BMI 는 %f 입니다\n", bmi);

			if (bmi <= 18.5) {
				System.out.println("저체중 입니다.");

			} else if (bmi <= 22.9) {
				System.out.println("정상 입니다");
			} else if (bmi <= 24.9) {
				System.out.println("과체중 입니다");
			} else {
				System.out.println("비만 입니다.");
			}
			/*
			 * BMI가 18.5 이하면 저체중 18.5~22.9 사이면 정상 23.0~24.9 사이면 과체중 25.0 이상부터는 비만으로 판정.
			 */

		}

	}

}
