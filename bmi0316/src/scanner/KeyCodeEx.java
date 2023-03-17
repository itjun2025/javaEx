package scanner;

import java.io.IOException;

public class KeyCodeEx {

	public static void main(String[] args) throws IOException {

		// system.in.read() 메서드는 오류가 발생 할 숭 있다.
		// 오류를 처리하는 2가지 방법중 throws 하는 방법을 선택 하여 해결
		// 다른 방법으로는 try {} catch{}{}문으로 감싸서 해결 할 수 있다.
		// try 실행했을때 오류가 나면 catch로 실행

		// 1. 사용자의 입력을 기다리고 있습니다.
		// 2. 엔터키를 입력하는 순간 실행이 됩니다.
		System.out.println("===============키코드=============");
		int code1 = System.in.read();
		int code2 = System.in.read();
		int code3 = System.in.read();
		int code4 = System.in.read();
		int code5 = System.in.read();

		System.out.println((char) code1);// 문자형으로 바꾸기
		System.out.println(code2);
		System.out.println(code3);
		System.out.println(code4);
		System.out.println(code5);
		// 123 만 입력했을때 뒤에 나오는 13, 10 은 ENTER 이다.

	}
}
