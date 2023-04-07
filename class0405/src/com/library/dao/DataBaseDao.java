package com.library.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DBUTil;
import com.library.vo.Book;

public class DataBaseDao implements Dao {

	@Override
	public List<Book> getList() {

		List<Book> list = new ArrayList<>();

		try {
			Connection conn = DBUTil.getconnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book order by no");
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				String author = rs.getString("author");

				// Y,N
				String isRentStr = rs.getString("isRent");
				// (조건) ? 참일때 반환값 : 거짓일때 반환값
				boolean isRent = ("Y".equals(isRentStr)) ? true : false;

				Book book = new Book(no, title, author, isRent);

				list.add(book);
			}
			DBUTil.closeConnection(conn, stmt, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean listToFile(List<Book> list) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		int res = 0;
		try {
			Connection conn = DBUTil.getconnection();
			Statement stmt = conn.createStatement();
			 res = stmt.executeUpdate("UPDATE BOOK SET ISRENT = 'Y' WHERE NO = 6");
			System.out.println(res+ "건 처리되었습니다.");
			
			
			DBUTil.closeConnection(conn, stmt);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int insert(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

}
