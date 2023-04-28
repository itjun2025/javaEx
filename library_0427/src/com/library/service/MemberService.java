package com.library.service;

import com.library.dao.MemberDao;
import com.library.vo.Member;

public class MemberService {

	
	MemberDao dao = new MemberDao();
	
	/**
	 * 로그인 메서드
	 * @param id
	 * @param pw
	 * @return
	 */
	public Member logIn( String id, String pw) {
			
		Member member = null;
		member = dao.login(id, pw);
		if (member == null) {
			System.err.println("아이디/비밀번호 확인해주세요");
		}else {
			System.out.println(member.getName() + "님 환영합니다.");
		}
		
		return member;
	}

	public void insert(String id, String pw, String name, String adminYN) {
		
		// 아이디 중복체크
		boolean idCheck = dao.idCheck(id);
		if (idCheck) {
			
		
		Member member = new Member(id, pw, name, adminYN, null, null);
		int res = dao.insert(member);
		if (res  > 0) {
			System.out.println( res +"건 등록되었습니다.");
		}else {
			System.err.println("등록되지 않았습니다");
		}
	} else {
			System.err.println("중복된아이디가 있습니다");
		}
	}

	public void delete(String delid) {
		int res = dao.delete(delid);
		
		if (res>0) {
			System.out.println(res + "건 삭제되었습니다");
		}else {
			System.err.println("삭제중 오류발생 관리자에게 문의해주세요");
		}
	}

	public boolean idCheck(String id) {
		dao.idCheck(id);
		if (id == null) {
			System.out.println("XXXXXXXXXXXXXXXXXX");
		}else {
			System.out.println("oooooooooooooooooo");
		}
		return false;
	}

	
}
