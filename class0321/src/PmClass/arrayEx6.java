package PmClass;

public class arrayEx6 {             // 1 차원 배열 int 타입
	
	public static void main(String[] args) {
		
		int[]scores = {30,14,40,40,98};
		
		int sum = 0;
		for(int arr : scores) {
			sum += arr;
		}
		System.out.println(" 모든 수의 합은 "+ sum);
		System.out.println(" 모든 수의 평균은 "+ sum/scores.length);
	}
}
