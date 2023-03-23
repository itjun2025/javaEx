package PmClass;


import java.util.Scanner;

public class MemberServiceMain2 {
	public static void main(String[] args) {
		
		MemberService2 member =  new MemberService2("홍길동","12345");
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (true) {
			System.out.println("아이디입력해주세요");
			String id = scan.next();
			System.out.println("비빌번호 입력해주세요");
			String pw = scan.next();
			
			boolean res = member.login(id,pw);
			if (res) {
				System.out.println(member.id + " 님 환영합니다");
				break;
			}else {
				System.out.println(" 아이디 또는 비번 다릅니다");
				i++;
				if (i>=5) {
					System.out.println("5회 실패 -> 시스템 종료");
					System.exit(0);
				}
			}
			
		}
		}
		
	}

