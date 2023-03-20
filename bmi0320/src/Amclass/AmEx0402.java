package Amclass;

public class AmEx0402 {

	// for문을 이용해서 1~100 까지 정수중 3의 배수 총합 구하기

	public static void main(String[] args) {
		System.out.println("1~100까지의 3배수 총합 구하기");	

		int sum = 0;
		for (int i = 0; i < 101; i++) {
			// 3의 배수인지 판단
			// 3의 배수가 아니면 증감식(부정연산자 != 사용
			// == 같으면 / != 같지 않으면
			if (i % 3 != 0) {
				continue;
				// break: 반복문 탈출
				// continue: 증감식으로 이동해
				// continue 이후 명령문장을 실행하지 않고 증감식으로 이동
			}
			// 3의 배수만 넘어올 수 있다
			System.out.println("i=" + i);
			sum += i;// sum = sum + i
		} // for종료
		System.out.println("3의배수의 총합은: " + sum);
	}
}
