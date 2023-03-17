package com.jungang;


import java.util.Scanner;

public class OperatorEx {
	public static void main(String[] args) {
 
		int x, y;
	
		x = 5;
		y = 2;
		// 나머지 연산자 % - 두 수의 나눗셈 결과 나머지 값을 반환
		// 주로 홀수 인지 짝수 인지 구분할때 사용

		System.out.println(x % y);
		if (x % y == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");
		}

		// 비교연산자의 연산 결과는 boolean 타입으로 반환
		boolean b = (x + y) < 5;
		System.out.println("비교연산의 결과: " + b);

		System.out.println("=====================================1");

		// 증감연산자(++/--) : 1증가, 1감소
		// 증감연산자의 위치에 따라 값이 결정

		System.out.println("x =" + x);// 5
		System.out.println(++x); // 6 즉시 증가
		System.out.println("x =" + x);// 6
		System.out.println(x++); // 6 다음부터 증가
		System.out.println("x =" + x);// 7
		System.out.println("======================================2");

		System.out.println("y =" + y);
		System.out.println(--y);
		System.out.println("y =" + y);
		System.out.println(y--);
		System.out.println("y =" + y);
		System.out.println("======================================3");

		x = 11;
		y = 10;
		int result = ++x + 10;
		int result2 = y++ + 10;

		System.out.println(result);
		System.out.println(result2);

		// 논리 부정 연산자
		if (!true) {
			System.out.println(123);
		}

		// 비교 연산자 : 두 값이 같은지 비교 ==

		if (x == y) {
			System.out.println("1==1");

		}
		if (x != y) {
			System.out.println("1!=1");
		}
		// 두 값이 다른지 비교 !=

	}

}
