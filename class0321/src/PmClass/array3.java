package PmClass;

public class array3 {

	public static void main(String[] args) {
		// 배열의 길이를 변경할 수 없으므로
		// 배열이 길이를 늘이거나 줄이기 위해서는
		// 새로운 배열을 만들고 기존 배열을 복사한다 
		
		// int 타입의 배열을 선언 {1,2,3}
		int[] oldArr = {1,2,3};
		int[] newArr = {0,0,0,0,0}; // --> 또는 new int[5];
		
		for (int i = 0; i < oldArr.length; i++) {
			System.out.println("oldArr "+ i+" : " + oldArr[i]);
			newArr[i] = oldArr[i];
			
			}
		System.out.println("========= newArray ===========");
		//newArr 출력
		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
			
		}
	}

}
