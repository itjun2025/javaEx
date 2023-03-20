package Amclass;

import java.util.Iterator;

public class AmEx0403 {	

	public static void main(String[] args) {
		// 두개의 주사위를 던져서 나온수
		// 1,2,3,4,5,6 6개의 수가 나올 수 있다
		// 0.000000....1<= Math.random() < 1
		// 0.00000.....6<= < 5.4...... " *6 을 했을때"
		// 0보다 크거나 같고 5보다 작은 값을 추출 0,1,2,3,4,5
		// 초기값 지정 (+) + 1

		// i,j 합이 5이면 (i,j) 출력후 종료
		// 아니면 계속 주사위를 굴립니다.

		while (true) {

			int i = (int) (Math.random() * 6 + 1); 
			int j = (int) (Math.random() * 6 + 1);

			System.out.println("i=" + i);
			System.out.println("j=" + j);

			if (i + j == 5) {
				System.out.printf("(%d,%d)", i, j);
				break;
			}
		}
	}

}
