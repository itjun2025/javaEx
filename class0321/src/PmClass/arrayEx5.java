package PmClass;

public class arrayEx5 {
	public static void main(String[] args) {
		int[] scores = {80,90,70,100};
		
		// 점수의 총합 구하기
		// 평균점수 구하기   
		
		// for( 타입변수명 : 배열){}
		int sum = 0;
		for(int age : scores) {
			sum = sum + age;  // sum +=age
		}
		System.out.println("점수의 총합 : "+ sum);
		System.out.println("평군 점수 : "+ sum/scores.length);
		
	}
}
