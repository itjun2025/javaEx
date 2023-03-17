package com.jungang;

public class BmiEx {

	/**
	* bmi 구하기
	*/
	public static void main(String[] args) {
		
		int weight = 50;
		double height = 1.6;
		double bmi;
		bmi = weight/(height*height);
		
		System.out.println("당신의 BMI는" + bmi + " 입니다.");
		
		
	}

}
