package PmClass;

public class memberMain {

	public static void main(String[] args) {
		
		Member member = new Member("blue", "이파란");
		
		// 재정의된 tostring 호출
		String str = member.toString();
		System.out.println(str);
		
		// 재정의된 toString을 호출하고 리터값을 받아 출력
		System.out.println(member);
		
		
	}
	
	
}
