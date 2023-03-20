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
// 	String userid = (String) request.getAttribute("userid");
// 	String userpw = (String) request.getAttribute("userpw");
// 	String username = (String) request.getAttribute("username");

	String userid = (String) session.getAttribute("userid");
	String userpw = (String) session.getAttribute("userpw");
	String username = (String) session.getAttribute("username");
	
	
	// pageContext.forward("attribute2.jsp");
// 	response.sendRedirect("attribute2.jsp");
	
%>

	이름 : <%= userid %>
	비밀번호 : <%= userpw %>
	아이디 : <%= username %>
</body>
</html>