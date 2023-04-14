package com.library.dao.conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex4 {
	public static void main(String[] args) {
		

	
		String sql = "select sysdate from dual";
		
		try {
			Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
			rs.next();
			System.out.println("현재날짜 : " + rs.getString(1));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}

