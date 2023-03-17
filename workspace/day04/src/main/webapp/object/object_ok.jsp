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
		String username = request.getParameter("username");
		String userbirth = request.getParameter("userbirth");
		
		// DB작업
		// ...
		
		// 페이지 이동
		// pageContext.forward("object_result.jsp");
		response.sendRedirect("object_result.jsp");
	%>
</body>
</html>