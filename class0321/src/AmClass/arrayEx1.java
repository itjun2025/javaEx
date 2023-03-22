package AmClass;

public class arrayEx1 {

	public static void main(String[] args) {

		// 배열 - 같은타입의 데이터를 연속된 공간에 나열하고 index를 부여한 자료구조
		//     - 같은 타입만 저장이 가능
		//     - 한번 생성된 배열의 길이를 늘이거나 줄일 수 없다
		//     - 배열의 길이를 확인하는 방법 : 변수명.lenght  = 항목의 갯수

		// 배열의 선언
        // 1. int[] score;
        // 2. int score[];
		
		// 배열 선언과 동시에 값을 입력
		int[] score = {90,80,60,85,50,60,70,55,99,80};
		
		// 배열의 값을 참조하는 방법
		// 변수이름[index]
		
		// 배열의 길이를 반환 : 변수이름.length
		int j = score.length;
		System.out.println("배열의 길이 :" + score.length);
		//    방번호 0번부터 여서 int i = 0~9
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum+= score[i];
//			System.out.println(score[i]);
			
		
		}
		System.out.println("점수의 총 합계 : "+ sum);
		System.out.println("평균 :"+ sum/score.length);
		
	}

}
