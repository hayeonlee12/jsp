<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% 
 	String ansStr = request.getParameter("ans");
 
 	int ans = 0;
 	
	if(ansStr != null && !ansStr.equals("")){
		ans = Integer.parseInt(ansStr);
	}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>응답결과</h1>
	<% if(ans == 300) {%>
		<p> 정답입니다.</p>
	<% } else { %>
		<p>정답이 아닙니다.</p>
	<% } %>
</body>
</html>