package com.jungang;

public class OperatorEx2 {
	public static void main(String[] args) {
		int v2 = 1; // => 1.0 double 타입으로 자동 변환
		double v3 = 1.0;

		System.out.println(v2 == v3);

		double v5 = 0.1;
		float v4 = 0.1f; // 같아 보이지만 소수점 더 있기 때문에 다르다
		System.out.println((double) v4);
		System.out.println(v4 == v5);

	}
}
