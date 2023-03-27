<%@page import="com.codingbox.vo.MemberBean"%>
<%@page import="com.codingbox.dao.MemberDao"%>
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
		String userid = request.getParameter("userid");
		MemberDao udao = new MemberDao();
		MemberBean user = udao.searchById(userid);
		request.setAttribute("user", user);
		pageContext.forward("searchview.jsp");
	%>
</body>
</html>