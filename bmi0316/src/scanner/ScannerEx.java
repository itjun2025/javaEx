package scanner;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		// 변수 선언 : 변수 기본타입8개 그외는 참조타입

		// Scanner scan;// 자동 완성시 자동으로 import , 오류가 발생시 마우스를 올려 제시된 해결방안을 클릭하여 처리할 수 있음.

		// scan = new Scanner(System.in);

		// 객체를 생성하는 방법
		// new 연산자는 객체를 메모리에 생성 후 메모리의 주소를 반환 합니다.
		// 클래스명 변수명 = new 크랠스명(system.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------스캔---------");

		// 한줄을 몽땅 받읍니다.
		// String input = scan.nextLine();
		// System.out.println(input);

		// 공백으로 구분해서 하나씩 읽어옵니다 ex) 안녕-> 안녕 / 안녕 반가워 -> 안녕
		// String input = scan.next();
		// System.out.println(input);

		// 실수 숫자 만 받아옵니다.
		// double i = scan.nextDouble();
		// System.out.println(i);

		// 정수,음수 만 받습니다
		int i = scan.nextInt();
		System.out.println(i);

	}
}
