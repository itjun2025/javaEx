package AmClass2;
//  String 메서드들
public class StringEx3 {
	
	public static void main(String[] args) {
		
		String str  = "자바 프로그래밍";
		
		// 매개값의 문자열을 포함 여부를 확인
		// 포함 : 시작인덱스값을 반환
		// 불포함 : -1 반환
		System.out.println(str.indexOf("프로"));
		System.out.println(str.indexOf("C"));
		
		System.out.println(str.substring(str.indexOf("프로")));
		
		if (str.indexOf("자바") >0 ) {
			System.out.println("자바관련있음");
		}else {
			System.out.println("자바관련있음");
			
		}
		
		// 무자의 길이를 반환합니다.
		// id의 길이는 5자 이상이어야 합니다
		String id = "id";
		if (id.length()<5) {
			System.out.println("아이디는 5자 이상 14 이하로 작성해야 합니다.");
		}
		String ssn = "1234569999999";
		
		if (ssn.length() != 13) {
			System.out.println("주민번호를 정확히 입력해야 합니다");
		}
		
		// 원하는 문자열을 추출
		// 시작 인덱스 포함 끝인덱스 불포함
		System.out.println("주민등록번호 앞자리 :"+ssn.substring(0, 6)); 
		System.out.println("주민등록번호 뒷자리 :"+ssn.substring(6)); 
		
		// 문자 교체
		str = "자바는 객체지향 언어 입니다. 자바를 자바봅시다";
		//							  원래단어 , 고칠단어
		System.out.println(str.replace("자바", "Java"));
		
		// 대소문자 교체
		str = "Java Programe Language";
		// 대문자로 변경
		System.out.println("대문자로변경 : " + str.toUpperCase());
		
		// 소문자로 변경
		System.out.println("소문자로 변경 : "+str.toLowerCase());
		
		// 대소문자 비교하지 않는 방법
		str= "q";
		System.out.println(str.equalsIgnoreCase("Q"));
		System.out.println(str.equalsIgnoreCase("q"));
		
		// 공백을 제거해주기
		id = "    id    ";
		System.out.println(id);
		System.out.println(id.trim());
		
		// 기본타입을 문자로 변경
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.2));
		System.out.println(String.valueOf(true));
		
		
		
		
		
	}
}
