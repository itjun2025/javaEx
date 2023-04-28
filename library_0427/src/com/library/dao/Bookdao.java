package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.common.ConnectionUtil;
import com.library.vo.Book;

public class Bookdao {
	/**
	 * 도서목록 조회
	 * @return
	 */
		public List<Book> getList(){
			List<Book> list = new ArrayList<Book>();
			
			String sql = "select no, title,"
					+ " nvl(대여여부,'N') , author from book, 대여 "
					+ "where book.no = 대여.도서번호(+) "
					+ "and 대여여부(+) = 'Y' order by no";
			
			//String sql = "select * from book order by no";
			// try ( 리소스생성 ) => try문이 종료되면서 리소스를 자동으로 반납
			// 자동으로 반납하기위해 ()안에 넣는다
			try(Connection conn = ConnectionUtil.getConnection(); 
				Statement stmt =  conn.createStatement();
					// stmt.executeQuery 반환타입 : resultSet
					// stmt.executeUpdate 반환타입 : int(몇건이 처리되었는지!!)
					// ResultSet : 내가 질의한 쿼리에 대한 결과 집합
				ResultSet rs = stmt.executeQuery(sql)){
				
				while(rs.next()) {
					int no = rs.getInt(1);
					String title = rs.getString(2);
					String rentYN = rs.getString(3);
					String author = rs.getString(4);
					
					Book book = new Book(no, title, rentYN, author);
					list.add(book);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return list;
		}
		/**
		 * 도서 등록
		 * @param book
		 * @return
		 */
		public int insert (Book book) {
			int res = 0;
			
			String sql = String.format
						("insert into book values (SEQ_BOOK_NO.NEXTVAL,'%s','%s','%s')"
								, book.getTitle(),book.getRentyn(),book.getAuthor());
			// 실행될 쿼리를 출력해봅니다
			// System.out.println(sql);
			System.out.println("도서 등록 성공");
			try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();		) {
				res = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				System.err.println("도서등록 실패");
				e.printStackTrace();
			}
			
			return res;
		}
		/**
		 * 도서 삭제
		 * @param no
		 * @return
		 */
		public int delete(int no) {
			int res = 0;
			
			String sql = String.format("delete from book where no  = %d" , no);
			//System.out.println(sql);
			try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();	 
				) {
				res = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			return res;
		}
		
		/**
		 * 도서 업데이트
		 * @param book
		 * @return
		 */
		public int update (int no , String rentYN) {
			int res = 0;
			String sql = String.format
						("update book set rentYn = '%s' where no = %d",  rentYN,no);
			// 실행될 쿼리를 출력해봅니다
			//System.out.println(sql);
			try(Connection conn = ConnectionUtil.getConnection();
				Statement stmt = conn.createStatement();		) {
				res = stmt.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return res;
		}
		
		public String getRentYN(int bookNo) {
			String rentYN = "";
			String sql = String.format("select rentyn from book where no =  %d",bookNo);
			try (
					Connection conn = ConnectionUtil.getConnection();
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);)
			{	// 조회된 행이 있는지 확인하는 문구 rs.next()
				if(rs.next()) {
				// db에서 조회된 값을 변수에 저장
				rentYN = rs.getString(1);
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return rentYN;
//			int res = 0;
//			String sql = String.format("update  book set rentyn = 'Y'  where  no = %d",num);
//				
//			try(Connection conn = ConnectionUtil.getConnection();
//					Statement stmt = conn.createStatement();		) {
//					res = stmt.executeUpdate(sql);
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			return res;
		}
		
		

}

















