package korea.object;

public class KoreanMain {
	public static void main(String[] args) {
		
		Korean hod = new Korean();
		hod.name= "전지현";
		hod.ssn= "4444444-4444444";
		
		System.out.println("============korean===============");
		System.out.println(hod.name);
		System.out.println(hod.ssn);
		System.out.println(hod.nation);
		
		
		// 값을 받아서 객체를 초기화 해준다
		
		Korean hong = new Korean("홍길동", "923420-144515");
		
		System.out.println("============홍길동===============");
		System.out.println(hong.name);
		System.out.println(hong.ssn);
		System.out.println(hong.nation);
		
		
		Korean lee = new Korean("이하늬","123143-1234123");
		
		System.out.println("============이하늬===============");
		System.out.println(lee.name);
		System.out.println(lee.ssn);
		System.out.println(lee.nation);
		
		
	}
}
