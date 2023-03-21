<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Connection conn = null;
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
	
	String sql = "select sysdate from dual";
	PreparedStatement pstm = conn.prepareStatement(sql);
	ResultSet rs = pstm.executeQuery();
	
	while(rs.next()) {
		out.print(rs.getDate(1)); // 2023-03-21
	}
%>

<%-- <%= conn %> --%>
</body>
</html>