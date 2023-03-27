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

	<!-- param.userid가 empty 일때  -->
	<c:choose>
	<c:when test = "${empty param.userid }">
			<form action="">
				아이디 <input type="text" name="userid"> <br> 패스워드 <input
					type="password" name="userpw"> <br> <input
					type="submit">
			</form>
		</c:when>
	</c:choose>
	
	<!-- 
		userid 값이 있는 경우
		- userid == admin 	: 관리자
		- userid == apple	: 김사과
		- userid == 그 외 	: 비회원
		 -->
	<!-- param.userid가 empty 가 아닐때  -->
	<c:choose>
		<c:when test = "${param.userid eq 'admin'}"> 
			관리자
		</c:when>
		<c:when test = "${param.userid eq 'apple'}"> 
			김사과
		</c:when>
		<c:otherwise>
			비회원
		</c:otherwise>
	</c:choose>

</body>
</html>