package PmClass;

import java.util.Scanner;

public class MemberMain3 {
	public static void main(String[] args) {
		Member3 service = new Member3("홍길동","1234");//동일한 타입, 동일한 갯수
		
	while (true) {
		
		//사용자로부터 id/pw를 입력받는다
		Scanner scan = new Scanner(System.in);
		System.out.println("id : ");
		String id = scan.next();
		System.out.println("pw :");
		String pw = scan.next();
		//===============================
		
		
		
		boolean res = service.login(id,pw);
		if (res) {
			System.out.println("환영합니다");
			break;
		}else {
			System.out.println("id 또는 pw가 일치하지 않습니다");
		}
		
		System.out.println("로그아웃을 하시려면 q를 입력해주세요");
		String exit = scan.next();
		System.out.println("로그아웃 되었습니다.");
		
		if ("q".equals(exit)) {
			System.exit(0);
		}	
		}
		
	
		
		
		
		
		
	}
}
