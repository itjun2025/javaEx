package Loop;

public class Nine3 {
	// ===0317복습=================구구단 출력하기================================

	public static void main(String[] args) {
		// dan = 2~9
		for (int dan = 2; dan < 10; dan++) {

			System.out.println(dan + "단");

			for (int i = 1; i < 10; i++) {
//			System.out.println("i=" + i); // i 를 1~9까지 출력해보기
//			System.out.println(dan + "*" + i + "=" + dan*i);// 출력방법 1
				System.out.printf("%d*%d=%d\n", dan, i, dan * i);// 출력방법 2
			}

			System.out.println("\n--------------------------\n");
		}
		System.out.println(" 구구단을 종료합니다. ");

	}
}
