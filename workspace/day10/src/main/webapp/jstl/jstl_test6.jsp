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
	<c:set var = "num" value = "5"/>
	<c:forEach var = "i" begin = "1" end = "9" step = "1">
		${num } x ${i } =
		${num * i } 
		<br>
	</c:forEach>
</body>
</html>