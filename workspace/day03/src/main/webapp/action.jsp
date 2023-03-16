<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String user_nameStr = request.getParameter("user_name");
	
	user_nameStr = user_nameStr.trim();
	
	if(user_nameStr == null) {
		user_nameStr = "이름이 없습니다.";
	} else if(user_nameStr.equals("")) {
		user_nameStr = "이름을 입력하세요.";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1><%= user_nameStr %></h1>
	</div>
</body>
</html>