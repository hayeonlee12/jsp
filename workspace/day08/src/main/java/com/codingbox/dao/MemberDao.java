package com.codingbox.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.codingbox.vo.MemberBean;

public class MemberDao {
	Context context;
	DataSource dataSource;
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	public boolean join(MemberBean member) {
		String sql = "INSERT INTO TBL_MEMBER VALUES (?, ?, ?, ?)";
		int result = 0;
		
		try {
//			conn = dataSource.getConnection();
			context = new InitialContext(null);
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/oracle");
			conn = dataSource.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, member.getUserid());
			pstm.setString(2, member.getUserpw());
			pstm.setString(3, member.getUsername());
			pstm.setString(4, member.getUserphone());
			
			result = pstm.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		if(result != 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public MemberBean login(String userid, String userpw) {
		String sql = "SELECT * FROM TBL_MEMBER tm WHERE USERID = ? AND USERPW = ?";
		
		MemberBean member = null;
		
		try {
			conn = ((DataSource)new InitialContext(null)
					.lookup("java:comp/env/jdbc/oracle"))
					.getConnection();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				member = new MemberBean();
				member.setUserid(rs.getString(1));
				member.setUserpw(rs.getString(2));
				member.setUsername(rs.getString(3));
				member.setUserphone(rs.getString(4));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}
	
//	public boolean login(String userid, String userpw) {
//		String sql = "SELECT * FROM TBL_MEMBER tm WHERE USERID = ? AND USERPW = ?";
//		
//		boolean result = false;
//		
//		try {
//			conn = DBConnection.getConnection();
//			pstm = conn.prepareStatement(sql);
//			
//			pstm.setString(1, userid);
//			pstm.setString(2, userpw);
//			
//			rs = pstm.executeQuery();
//			
//			if(rs.next()) {
//				result = true;
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
	
	public boolean checkId(String userid) {
		/**
		 * 아이디가 있는 경우를 true - > 회원가입 불가능
		 * 아이디가 없는 경우 false -> 회원가입 가능
		 */
		boolean result = false; // 아이디가 있는 경우
		String sql = "SELECT COUNT(*)"
				+ "FROM TBL_MEMBER tm "
				+ "WHERE USERID = ?";
		
		try {
			conn = ((DataSource)new InitialContext(null)
					.lookup("java:comp/env/jdbc/oracle"))
					.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				if(rs.getInt(1) == 1) {
					result = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
