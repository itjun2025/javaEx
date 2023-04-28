package com.library.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DB Connection을 생성하여 반환 합니다.
 * 
 * @author user
 *
 */
public class ConnectionUtil {

	/**
	 * DB Connection을 반환 합니다
	 * 
	 * @return Connection
	 */
	// 	connection 을 가지고 올 수있는 메서드
	public static Connection getConnection() {

		// 접속정보 (ip,pw,sid,계정id, 비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "library";
		String pw = "1234";

		Connection conn = null;

		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 생성
			conn = DriverManager.getConnection(url, id, pw); // 생성자의 오버로딩
			// 트랜젝션 처리를 위해 자동커밋을 false로 설정
			// -> 커넥션이 종료되는 시점에 커밋
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			System.err.println("라이브러리를 확인해주세요"); // 오류 확인
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
			return conn; // 반환해야한다.
	}
	// 롤백
	public void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			System.err.println("rollback 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("conn.close() 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn,Statement stmt) {
		try {  // 닫는 순서는 거꾸로!
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("stmt.close() 실패");
			e.printStackTrace();
		}
	}
	
	public static void close(Connection conn,Statement stmt, ResultSet rs) {
		try {  // 닫는 순서는 거꾸로!
			if(rs != null && !rs.isClosed()) rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			System.err.println("rs.close() 실패");
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		// 접속정보 (ip,pw,sid,계정id, 비밀번호)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "library";
		String pw = "1234";

		Connection conn = null;

		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 생성
			conn = DriverManager.getConnection(url, id, pw); // 생성자의 오버로딩
			System.out.println(conn);
			System.out.println("프로그램 종료!");

			// 커넥션 닫기 만약 conn 이 닫히지 않았다면 닫아줘
			if (!conn.isClosed())
				conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println("라이브러리를 확인해주세요"); // 오류 확인
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
