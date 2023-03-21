package PmClass;

import java.util.Iterator;

public class array {

	public static void main(String[] args) {
		
		// new int [scores의 방의 갯수][];
		int[][] scores = new int[2][];  // 방법 1
//		scores[0] = new int[] {1,2,3};
//		scores[1] = new int[] {1,2};
		
		scores = new int[][] {{1,2,3},{1,2}}; // 방법 2
		
		// scores의 방의 갯수를 확인
		for (int i = 0; i < scores.length; i++) {
			System.out.println("방번호 : "+i);
			System.out.println("int 배열의 길이"+scores[i].length);
			int[]points = scores[i];
			for (int j = 0; j < points.length; j++) {
				System.out.printf("(%d,%d)", i,j);
				System.out.println(points[j]);
				System.out.println(scores[i][j]);
			}
		}
		
	}

}
