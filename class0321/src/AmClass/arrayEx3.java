package AmClass;

public class arrayEx3 {

	public static void main(String[] args) {

		int[] score = {1,30,40,69,55};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum +score[i];
			
		}
		System.out.println("모든 score 의 합은"+ sum);
		System.out.println("모든 score 의 평균은"+ sum/score.length);
	}

}
