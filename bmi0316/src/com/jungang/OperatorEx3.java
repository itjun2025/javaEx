package com.jungang;

public class OperatorEx3 {
	public static void main(String[] args) {
		int x = 10, y = 5, z = 3;

		// & : 두항 모두 연산하고 비교한다
		// && : 첫번째 항이 false 일 경우 두번째항은 확인하지 않는다
		// &&(그리고) - 두개의 항이 모두 true 일때 true
		if (x > y && x > z) {

			// | : 두항 모두 연산하고 비교한다
			// || 첫번째 항이 true 일 경우 두번째 항은 확인하지 않는다.
			// ||(또는) - 두개의 항중 하나라도 true 여도 true
		}
		if (x > y || x > z) {

		}

		// 대입연산자
		// 왼쪽의 값을 오른쪽에 대입
		x = 10;
		x += 10; // x= x+10
		x *= 10; // x= x*10
		x %= 10; // x= x%10

		boolean t = true;
		t |= false; // t = true | false

		// 삼항연산자
		// (조건)?참:거짓
		int score = 95;
		String grade = (score > 90) ? "A" : "B";
		System.out.println(grade);

		int high = 40;
		String good = (high > 50) ? "A" : ((high > 40) ? "B" : "C");
		System.out.println(high + "점은 " + good + "등급 입니다.");

	}

}
