package Amclass;

public class Break {
	public static void main(String[] args) {
		// 중첩(이중)반복문을 이용하여 구구단 출력하기

		outter : // Lable 이라고 한다	라벨의 위치
		for (int dan = 2; dan < 10; dan++) {

			System.out.println(dan + "단");

			for (int i = 9; i > 0; i--) {
				// 만약 6단이면 구구단을 출력하지마
				if (dan == 6) {
					break outter; // break 뒤에 outter(아무 이름임 다른거 가능) 
				}                 // 를 만나면 Lable 의 위치까지  반복문을 탈출 합니다.
//			System.out.println("i=" + i); // i 를 1~9까지 출력해보기
//			System.out.println(dan + "*" + i + "=" + dan*i);// 출력방법 1
				System.out.printf("%d*%d=%d\n", dan, i, dan * i);// 출력방법 2
			}

			System.out.println();
		}

	}
}
