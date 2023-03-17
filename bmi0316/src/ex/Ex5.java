package ex;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		String num1 = scan.next();
		System.out.print("두번째 수: ");
		String num2 = scan.next();
		
		// 위의 스트링 값을 정수형으로 변환
		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);
		
		System.out.println("덧셈결과 : " + (int1 + int2));
	}

}
