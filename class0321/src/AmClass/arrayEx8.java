package AmClass;

public class arrayEx8 {

	public static void main(String[] args) {
		
		// 1. 이차원 배열 선언
		// new int [행][열]
		int[][] scores = new int[2][3];
		
		// 2. 행을 가지고 오는 방법
		// 변수명[행번호]
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6};
		
		// 3. 값을 가지고 오는 방법
		// scores [행번호][열번호] 
		System.out.println(scores[0][0]);
		System.out.println(scores[1][2]);
		System.out.println("\n====================================\n");
		
		// i = 행번호  /  j = 열번호
		for (int i = 0; i < scores.length; i++) {      
			int[] points = scores[i];
		for (int j = 0; j < points.length; j++) {
			System.out.print(points[j]);
		} System.out.println();
		}
	}
}
