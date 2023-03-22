package com.codingbox.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnection() {
		
		// dbconnection
		Connection conn = null;
		try {
			// 활용할 드라이버
			String driver = "oracle.jdbc.driver.OracleDriver";
			// 목적지(Oracle DB)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// dbms 계정명
			String user = "jsp";
			// dbms 비밀번호 
			String password = "1234";
			
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 오류");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("DB 접속 오류");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알 수 없는 에러");
		}
		
		return conn;
	}
}
