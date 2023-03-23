package PmClass;

public class Member3 {

	// 필드
	public String id;
	public String pw;

	// 생성자 
	public Member3(String id, String pw) {
		this.id= id;
		this.pw=pw;
		
	}
	
	
	// 메서드
	/**
	 * 로그인 처리 필드에 등록된 id와 pw가 일치하면 true 일치하지 않으면 false를 반환
	 * 
	 * @param id
	 * @param pw
	 * @return 로그인성공: true, 로그인 실해 : false
	 */
	public boolean login(String id, String pw) {
		// 필드 id : this.id
		if (id != null 									// 아이디가 null이 아니고
				&& id.equals(this.id) 					// id 가 필드의 id값과 같고
				&& pw != null 							// pw가 null이 아니고
				&& pw.equals(this.pw)) { 				// pw가 필드의 pw값과 동일하면
			System.out.println("로그인 성공");
			return true;

		}
		System.out.println("로그인 실패");
			return false;
	}
	
	
	public void logout() {
		System.out.println(id+"님 로그아웃 되었습니다"); // 동일한 이름의 지역변수가 없어서 id는 필드를 의미한다 *****
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
