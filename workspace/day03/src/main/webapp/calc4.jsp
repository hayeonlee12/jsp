<%
	int x = 5;
	int y = 10;

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	input {
		width : 50px;
		height : 50px;
	}
	
	.output {
		height : 50px;
		background: #e9e9e9;
		font-size: 24px;
		font-weight : bold;
		text-align: right;
		padding: 0px 5px;
	}
</style>
</head>
<body>
	<form action = "calc4" method = "post">
		<table>
			<tr>
				<td class = "output" colspan = "4"><%= x + y%></td>
			</tr>
			
			<tr>
				<td> <input type = "submit" name = "value" value = "EC"></td>
				<td> <input type ="submit" name = "value" value = "C"></td>
				<td> <input type = "submit" name = "value" value = "BS"></td>
				<td> <input type = "submit" name = "value" value = "/"></td>
			</tr>
			
			<tr>
				<td > <input type ="submit" name = "value" value = "7"></td>
				<td > <input type ="submit" name = "value" value = "8"></td>
				<td > <input type = "submit" name = "value" value = "9"></td>
				<td > <input type ="submit" name = "value" value = "-"></td>
			</tr>
			
			<tr>
				<td > <input type ="submit" name = "value" value = "1"></td>
				<td > <input type ="submit" name = "value" value = "2"></td>
				<td > <input type = "submit" name = "value" value = "3"></td>
				<td > <input type ="submit" name = "value" value = "+"></td>
			</tr>
			
			<tr>
				<td > </td>
				<td > <input type ="submit" name = "value" value = "0"></td>
				<td > <input type = "submit" name = "dot" value = "."></td>
				<td > <input type ="submit" name = "operator" value = "="></td>
			</tr>
		</table>
	</form>
</body>
</html>