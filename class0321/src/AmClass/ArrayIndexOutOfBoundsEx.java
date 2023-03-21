package AmClass;

public class ArrayIndexOutOfBoundsEx {
			// index 오류 확인
	public static void main(String[] args) {
		int[] score = {10,20,30};
		// 배열을 선언한 후 중괄호를 사용해서 값을 입력하면 오류가 발생
		// score = {10,20,30}; <--- 오류 발생
		
		// 1. 배열 선언후 생성하는 방법
		// 변수명 = new 타입[] {값 목록,.....};
		   score = new int[] {10,20,30};
		// 2. 배열 선언후 생성하는 방법
		// 값의 목록이 없지만 미리 배열을 만드는 경우
		// 타입[] 변수 = new 타입[길이]
		   score =  new int[10];   // score 에 주소를 넣음 [10칸] - 10개의 값을 넣을 수있는 주소를 만듬
		   System.out.println("int 타입을 저장한 10개의 저장공간을 만들었어요!");
		   
		   
		   for (int i = 0; i < score.length; i++) {  //i 는 for블록 밖으로 넘어가면 없어지는 로컬(지역)변수이다.
			System.out.println(score[i]);
		}
		
	}

	
	// 배열의 인덱스는 0부터 시작한다
	// 배열의 총길이는 갯수를 반환 한다
	//	java.lang.ArrayIndexOutOfBoundsException - 배열의 index를 초과하는 경우 나타나는 오류
	//	Index 3 out of bounds for length 3 - 0,1,2 밖에 없어서 오류
	//	at class0321/AmClass.ArrayIndexOutOfBoundsEx.main(ArrayIndexOutOfBoundsEx.java:8) -  오류 위치 

}
