package AmClass;

public class arrayEx2 {

	public static void main(String[] args) {
		
		// 배열을 생성
		int[] score = {50,40,10};
		String[] name = {"이문세","박효신","김범수"};
		
		
		// 반복문을 이용해서 배열에 입력된 값을 출력
		// 초기화 ; 조건식 ; 증감식
		// 변수명.lenght : 배열의 값의 갯수
		for (int i = 0; i < name.length; i++) {
			
			//배열의 값에 접근 : 변수이름[방번호]
			System.out.println(name[i]);
		}
	}

}
