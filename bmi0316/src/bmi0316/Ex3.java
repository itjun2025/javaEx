package bmi0316;

import java.util.Scanner;

public class Ex3 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("======= BMI를 구해드립니다. =======\n");
			System.out.println("키를 입력해주세요(m) 숫자만 입력 가능합니다");
			double height = scan.nextDouble();
			System.out.println("몸무게를 입력해주세요(kg) 숫자만 입력 가능합니다");
			double weight = scan.nextDouble();
			double bmi = weight / (height * height);
			System.out.printf("당신의 BMI는 %.1f입니다.", bmi);

			
		}
}
