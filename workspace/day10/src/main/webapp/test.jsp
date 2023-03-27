<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	pageContext.setAttribute("result", "hello");
%>
<body>
<%=request.getAttribute("result") %> 입니다. <br>
${requestScope.result } 입니다. <br>
${names[0] } <br>
${names[1] } <br>
${notic.id } <br>
${notic.title } <br>
${result } <br>
------------------------------------------ <br>

${param.num }

------------------------------------------ <br>

${param.num >= 3 } <br>
${param.num gt 3 } <br>
------------------------------------------ <br>

${empty param.num } <br>
${not empty param.num } <br>

------------------------------------------ <br>
${empty param.num? '값이 비어있습니다':param.num  } <br>
</body>
</html>