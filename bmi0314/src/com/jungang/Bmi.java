package com.jungang;

public class Bmi {

	public static void main(String[] args) {
		//bmi 자신의 몸무게를 키의 제곱으로 나눈 값입니다.
		//타입 변수명 = 값;
				int weight = 75;
				//키를 미터로
				double height = 1.72;
				
				
				double bmi = weight/(height*height);
				
				// + 연산자가 숫자끼리 나오면 연산
				// +연산자가 문자열과 함께 나오면 연결
				System.out.println(10+10);
				System.out.println("당신의 BMI는" + bmi + " 입니다");
				System.out.println(weight+height+ "당신의 BMI는" + bmi + "입니다");
				
		
			

	}

}
