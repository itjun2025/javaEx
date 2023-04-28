package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.library.common.ConnectionUtil;
import com.library.vo.Member;



public class MemberDao {

	
	
	/**
	 * 사용자 로그인
	 * @param id
	 * @param pw
	 * @return
	 */
		public Member login(String id, String pw) {
			Member member = null;
			
			String sql = 
			String.format("select id,name,adminyn,status,grade from member"
					+ " where id = '%s' and pw = '%s'",id,pw);
//			System.out.println(sql); // 오류 찾기 위해서
			
			
			
			try (Connection conn = ConnectionUtil.getConnection();
				 Statement stmt = conn.createStatement();	
				ResultSet rs = stmt.executeQuery(sql);)  {
				
				// 질의결과 결과집합을 member객체에 담아줍니다.
				if (rs.next()) {
					String name = rs.getString(2);
					String admin = rs.getString(3);
					String status = rs.getString(4);
					String grade = rs.getString(5);
					
					member = new Member(id, "", name, admin, status, grade);
					
					
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (member == null) {
		        System.err.println("로그인 실패");
		    } else {
		        System.out.println("로그인 성공");
		    }
			return member;
		}
		
		/**
		 * 멤버 등록
		 * @param member
		 * @return
		 */
		public int insert(Member member) {
			
			int res = 0;
			
			String sql = 
			String.format ("insert into member (id, pw, name ,adminYN) values" 
			+ "('%s','%s','%s','%s')"
			,member.getId() ,member.getPw(),member.getName(),member.getAdminyn());
			
			//System.out.println(sql);
			try (Connection conn = ConnectionUtil.getConnection();
				 Statement stmt = conn.createStatement();){
				res = stmt.executeUpdate(sql);
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			return res;
		}
		
		/**
		 * 아이디 중복 체크
		 * 중복일경우false
		 * @param id
		 * @return
		 */
		public boolean idCheck(String id) {
			boolean res = false;
			
			String sql = String.format(
						"select * from member where id = '%s'",id);
			
			//System.out.println(sql);
			try (Connection conn = ConnectionUtil.getConnection();
					Statement stmt = conn.createStatement();	
					ResultSet rs = stmt.executeQuery(sql)){
				
				//rs.next : 결과집합이 있으면 true -> !rs.next를 반환
				return !rs.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return res;
		}
		
		/**
		 * 멤버 삭제
		 * @param id
		 * @return
		 */
		public int delete (String id) {
			int res = 0;
			
			String sql = String.format("delete from member where id ='%s'",id);
			
			//System.out.println(sql);
			try(Connection conn = ConnectionUtil.getConnection();
					Statement stmt = conn.createStatement();	
					) {
				res = stmt.executeUpdate(sql);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			return res;
		}
		
		
		
		
		
		
		
		
		
}
