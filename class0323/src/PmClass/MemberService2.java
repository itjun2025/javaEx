package PmClass;

public class MemberService2 {

	public String id;
	public String passward;
	
	public MemberService2(String id, String passward) {
		this.id= id;
		this.passward=passward;
		
	}
	public boolean login(String id, String passward) {
		if (this.id.equals(id) && this.passward.equals(passward)) {
			return true;
		}
		return false;
	}
	public void logout() {
		System.out.println("로그아웃되었습니다");
	}

}
