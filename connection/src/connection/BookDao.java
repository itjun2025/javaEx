package connection;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDao {
	
	public static void main(String[] args) {
		
		
		BookDao dao = new BookDao();
//		dao.insert(15,"가시고기","김춘배","N");
//		dao.delete(1);
//		dao.update();
//		List<Book> list = dao.getList();
//		System.out.println("책리스트====================");
//		for(Book book : list) {
//			System.out.println(book.toString()); 
//		}
	}
//	
//	}
	
	// 데이터 삽입
	public  void insert(int no, String title, String author, String isRent) {
	 try {
		 
		Connection conn =	DBUTil.getconnection();
		Statement stmt = conn.createStatement();
		String sql = "insert into book values("+no+", '"+title+"', '"+author+"','"+isRent+"' ,sysdate,null)";
		// 삽입,수정,삭제
		int res = stmt.executeUpdate(sql);
		
		System.out.println(res + "건 처리되었습니다.");
		// 자원 반납
		DBUTil.closeConnection(conn, stmt);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 
	 
		
	}
	
	
	
	
	// 데이터 수정
	public void update() {
		
		Connection conn = DBUTil.getconnection();
		try {
			Statement stmt = conn.createStatement();
			
			System.out.println("=============");
			int res = stmt.executeUpdate("UPDATE BOOK SET ISRENT = 'Y' WHERE NO = 15");
			System.out.println(res + "건 수정되었습니다.");
			
			System.out.println("대기");
			Thread.sleep(5000);
			
			DBUTil.closeConnection(conn, stmt);
			System.out.println("자원반납");
			System.out.println("대기");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 데이터 삭제
	public void delete(int no) {
		
		try {
			Connection conn = DBUTil.getconnection();
			Statement stmt = conn.createStatement();
			int res =  stmt.executeUpdate("delete from book where no =" + no);
			
			DBUTil.closeConnection(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 데이터 조회
	public List<Book> getList(){
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn =  DBUTil.getconnection();
			Statement stmt = conn.createStatement();
			
			// 질의결과를 결과집합으로 받아 옵니다
			ResultSet rs =  stmt.executeQuery("select * from book order by no");
			while(rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString(2);
				String author =  rs.getString("author");
				String isrent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editdate = rs.getDate(6);
				
			 Book book =new Book(no, title, author, isrent, null, null);
			 list.add(book);
			}
			
			DBUTil.closeConnection(conn, stmt, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
