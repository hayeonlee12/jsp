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
	<h2>JSTL Test</h2>
	<!-- 변수 선언 -->
	<!-- scope :  어느 범위까지 사용하는지, page : pageContext -->
	<c:set var = "userid" value="apple" scope="page"/>
	
	회원 아이디 <c:out value= "${userid }"/> <br>
	회원 아이디${userid } <br>
	------------------------------------------------------- <br>
	<c:set var = "userid" scope = "session">홍길동</c:set>
	<c:set var = "userpw" scope = "session">hong1234</c:set>
	회원 아이디${userid } <br>
	회원 패스워드${userpw } <br>
	회원 아이디${sessionScope.userid } <br>
	회원 패스워드${sessionScope.userpw } <br>
</body>
</html>