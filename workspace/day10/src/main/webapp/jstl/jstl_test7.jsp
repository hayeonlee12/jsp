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
	<form action = "" method = "get">
	단 : <input type = "text" name = "number" >
	<input type = "button" value = "쿼리 전송" onclick = "times()">
	
	</form>
	
	<hr>
	
	<c:choose>
		<c:when test="${param.number gt 1 and param.number lt 100}">
			<c:forEach var = "i" begin = "1" end = "9" step = "1">
				${param.number } x ${i } = 
				${param.number * i }
				<br>
			</c:forEach>
		</c:when>
		<c:otherwise>
			1 이상 100 이하의 숫자를 입력하세요!
		</c:otherwise>
	</c:choose>

	
	<hr>
	
	<input type = "button" value = "홈으로 돌아가기" onclick = "history.go(-1)">
	
	<script>
	function times() {
		document.forms[0].submit();
	}
	</script>
</body>
</html>