package PmClass;

public class MemberService {

	public boolean login(String id, String passward) {

		// id 에 null이 들어올 경우 nullpointException이 발생할 우려가 있다
		// null이 아닌경우 체크로직을 실행하거나 "hong"(문자열).equals 를 사용
		if (id != null && "hong".equals(id) && "12345".equals(passward)) {
			return true;
		}
		return false;

	}

	public void logout(String id) {

		System.out.println("로그아웃 되었습니다");
	}
	
}
