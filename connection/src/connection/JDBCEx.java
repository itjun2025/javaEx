package connection;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx {

	
public static void main(String[] args) {
	JDBCEx ex = new JDBCEx();
//	ex.connectionTest();
//	ex.getlist();
//	ex.getInsert();
//	ex.delete();
	ex.upDate();
	}

public void getlist() {
	
	// 데이터베이스 접근시 필요한 정보
		// ip, port, sid, 계정정보, 비밀번호
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
	
	// 커넥션 얻어오기
	// 쿼리 실행객체 생성하기
	// 쿼리 실행 후 결과집합 받아오기
	Connection conn;
	// 클래스 로딩
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		Statement stmt = conn.createStatement();
		
		ResultSet rs =	stmt.executeQuery("select * from book"); // 세미콜론 금지;
//		System.out.println("size : "+ rs.getFetchSize());
		List<Book> list = new ArrayList<>();
		while(rs.next()) {
			int no = rs.getInt(1);
			String title = rs.getString(2);
			String author = rs.getString(3);
			String isRentString = rs.getString(4);
			Date regDate =rs.getDate(5);
			Date editDate = rs.getDate(6);
			
			Book book = new Book(no, title, author, isRentString, regDate, editDate);
		list.add(book);
		}
		
		System.out.println(list);
		for(Book book : list) {
			System.out.println(book.toString());
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		
	}
	catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
}

public void getInsert() {
	
	// 데이터베이스 접근시 필요한 정보
		// ip, port, sid, 계정정보, 비밀번호
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser";
		String pw = "1234";
	
	Connection conn;
	
	// 클래스 로딩
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("커넥션 얻기 성공" + conn);
		Statement stmt = conn.createStatement();
		
		// 몇건이 처리되었는지 확인
	
		int res = stmt.executeUpdate ("insert into book values(9, '개똥벌레','박정자','N',sysdate,null)");
		System.out.println(res + "건 처리되었습니다");
		
		
		stmt.close();
		conn.close();
		
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		
	}
	catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
}

public void delete() {
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "orauser";
	String pw = "1234";
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 커넥션을 얻어오기 위한 정보
		Connection conn = DriverManager.getConnection(url,id,pw);
		System.out.println("오토커밋 - false 설정");
		conn.setAutoCommit(false);
		
		//  쿼리 실행 준비
		Statement stmt = conn.createStatement();
		// 몇건이 처리 되었는지 반환
		int res = stmt.executeUpdate("delete from book");
		System.out.println(res+"건 처리되었습니다. ");
		conn.rollback();
		System.out.println("롤백되엇습니다.");
		
	}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}


public void upDate() {
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "orauser";
	String pw = "1234";
	
	try {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// db 연결설정
		Connection conn = DriverManager.getConnection(url,id,pw);
		// 쿼리 실행 객체 생성
		Statement stmt = conn.createStatement();
		// 쿼리 실행
		int res = stmt.executeUpdate("update book update book  set isrent = 'Y' where no = 7");
		System.out.println(res + "건 처리되었습니다. ");
		
		
		
	} catch (ClassNotFoundException e) {
		System.out.println("jdbc 라이브러리를 확인해주세요");
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void connectionTest() {
	
	// 데이터베이스 접근시 필요한 정보
	// ip, port, sid, 계정정보, 비밀번호
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String id = "orauser";
	String pw = "1234";
	
	Connection conn;
	
	try {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//커넥션 얻어오기
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("커넥션 얻기 성공" + conn);
		// 쿼리실행
		Statement stmt = conn.createStatement();
		
		// 데이터 조회
		// executeQuery(쿼리문장 입력)
		// ResultSet : 결과 집합
		ResultSet rs =  stmt.executeQuery("select count (*) from book");
		rs.next();
		System.out.println("조회결과 : " +rs.getString(1));
//		System.out.println("조회결과 : " +rs.getInt("count(*)"));  다른방식
		
		// 자원 반납
		rs.close();
		stmt.close();
		conn.close();
		
		
		// 데이터 생성 ,수정, 삭제
		// stmt.executeQuery("");
		
	} catch (ClassNotFoundException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	catch (SQLException e) {
		e.printStackTrace();
	}
	
}


















}
