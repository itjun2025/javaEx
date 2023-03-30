package bmi0316;

//==============================0316 복습 2=============================
import java.util.Scanner;


public class bmi03162 {
	public static void main(String[] args) {

		// 변수 선언
		// 타입 변수명 = new 타입(매개 변수)
		// 기본변수는 메모리에 값을 가지고 있다
		// 참조변수는 메모리의 주소값을 가지고 있다
		Scanner scan = new Scanner(System.in);

		while (true) { // 반복문
			System.out.println("BMI를 구해드립니다.");
			System.out.println("키를 입력해주세요(m) 숫자만 입력 가능합니다");
			double height = scan.nextDouble();
			System.out.println("몸무게를 입력해주세요(kg) 숫자만 입력 가능합니다");
			double weight = scan.nextDouble();

			double bmi = weight / (height * height);
			System.out.printf("당신의 BMI는 %.1f입니다.\n", bmi);

			// 삼항연산자를 이용
			String bmires = (bmi <= 18.5) ? "저체중" : (bmi <= 22.9) ? "정상" : (bmi <= 24.9) ? "과체중" : "비만";
			System.out.println(bmires + " 입니다.");

			System.out.println("종료 : q, 계속...: 아무키나 입력 해주세요");
			String exit = scan.next();
			if ("q".equals(exit)) {
				// 반복문 탈출
				break;
				
			}

		}
		scan.close();
		System.out.println("프로그램이 종료 되었습니다.");
	}
}