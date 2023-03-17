package bmi0316;

public class Bmiclass1 {

	public static void main(String[] args) {

		// --------------------3/15복습----------------------------

		// printf (형식문자열) 사용 법

		double area = 3.14159 * 10 * 10;

		System.out.println(area);

		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);

		// 키 1.6m 몸무게 55kg
		// 변수의 타입 변수명 = 값
		// 오른쪽에 있는 값을 왼쪽의 변수에 저장 = 대입연산자

		double height = 1.6;
		int weight = 55;
		// 실수와 정수의 연산
		// 정수 55가 실수 55.0으로 자동형변환 되어짐

		double bmi = weight / (height * height);
		System.out.println("당신의 BMI는 " + bmi + " 입니다.");
		System.out.printf("당신의 BMI는 %f\n", bmi);
		System.out.printf("당신의 BMI는 %10.2f\n", bmi);
		System.out.printf("당신의 BMI는 %-10.2f%s\n", bmi, "입니다");
		System.out.printf("당신의 BMI는 %.2f\n", bmi);
		System.out.printf("당신의 BMI는 %6.4f\n", bmi);
		System.out.printf("당신의 BMI는 %7.4f\n", bmi);
		System.out.printf("당신의 BMI는 %11.4f\n", bmi);
		System.out.printf("당신의 BMI는 %10.4f\n", bmi);
		System.out.printf("당신의 BMI는 %9.4f\n", bmi);
		System.out.printf("당신의 BMI는 %8.4f\n", bmi);
		System.out.printf("당신의 BMI는 %7.7f\n", bmi);
		// -10.2 = .2 와 같다
		System.out.printf("당신의 BMI는 %-10.2f\n", bmi);
		System.out.printf("당신의 BMI는 %.2f\n", bmi);

	}
}
