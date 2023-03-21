package PmClass;

public class array4 {

	public static void main(String[] args) {

		String[]  oldStrArr = {"java","array","copy"};
		String[]  newStrArr = new String[5];
		
		 //        원본배열, 복사시작index , 새로운배열 , 새배열에 복사를 시작할 index, 복사할 갯수
//System.arraycopy(oldStrArr,     0     , newStrArr,             0          ,    0   );
                                                          		
		// java 기본 API에서 제공해주는 메서드를 활용해서 배열을 복사 V
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for (int i = 0; i < newStrArr.length; i++) {          // 방법 1
			System.out.println(newStrArr[i]);
		}
		System.out.println("=============================");
		
		// 향상된 for문을 이용하는 방법
		
		// (타입 변수명 : 배열의이름)
		// 배열의 요소를 모두 순회 합니다 = 0 < 배열명.lenght 
		for(String data : newStrArr) {                         // 방법 2 간편함 추천
			System.out.println(data);
			
		}
		
		
		
		
	}

}
