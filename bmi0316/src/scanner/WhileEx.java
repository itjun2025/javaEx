package scanner;

import java.io.IOException;

public class WhileEx {
	/**
	 * 키보드에 입력된 키코드를 출력합니다.
	 * 
	 * @param args
	 * @throws IOException
	 */
	// .이랑 () 가 있다면 메소드다(하나의행동이다)
	public static void main(String[] args) throws IOException {

		// while (){} : 반복문
		// ()안의 값이 참이면 코드블럭을 계속해서 실행한다
		// break 문이 속해있는 반복문을 탈출한다.
		System.out.println("키보드 입력을 기다리는 중입니다.");

		// 반복 ()안의 조건이 true이면 계속해서 코드가 나온다
		while (true) {

			// 사용자의 입력을 대기
			int input = System.in.read();
			// Q또는 q가 입력되면 반복을 종료
			// || 이거나 , 또는
			// 81 (이거나,또는) 113 이면
			System.out.println("keyCode: " + input);
			if (input == 81 || input == 113) {
				// 반복문을 탈출 (내가 속해있는 반복문의 코드블럭을 탈출)13
				break;

			}

		}
		System.out.println("종료합니다.");
	}
}
