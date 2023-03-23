package PmClass;

public class MemberServiceMain {
	public static void main(String[] args) {

		MemberService member = new MemberService();
		
//		boolean res = member.login("hong", "12345");        ---> 이렇게 사용도 가능
//		if (res) {   System.out.println("홍길동님 환영합니다");   }
		
		if(member.login("hong", "12345")) {
			System.out.println("홍길동님 환영합니다");
		}else {
			System.out.println(" 아이디와 비밀번호가 일치하지 않습니다");
		}
		member.logout(null);
	}

}
