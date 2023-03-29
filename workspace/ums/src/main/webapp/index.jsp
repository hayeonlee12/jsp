<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${param.flag == false }">
		<script>
			alert("회원가입 실패! 다시 도전하세요");
		</script>
	
	</c:if>
	<a href = "./app/user/joinview.jsp">회원가입</a>
	<a href = "${pageContext.request.contextPath}/user/UserLogin.us">로그인</a>
</body>
</html>