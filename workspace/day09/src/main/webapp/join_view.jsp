<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#text{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<form action = "join_db.jsp" name = "joinForm" method = "post">
		<p id = "text">사용할 수 있는 아이디입니다.</p>
		<p>
			<label>아이디
				<input type = "text" name = "userid"/>
				<input type = "button" value = "중복확인" 
					onclick = "checkId(joinForm.userid.value)"/>
			</label>
		</p>
		<p>
			<label> 비밀번호
				<input type = "password" name = "userpw"/>
			</label>
		</p>
		<p>
			<label> 비밀번호 확인
				<input type = "password" name = "userpw_re"/>
			</label>
		</p>
		<p>
			<label> 이름
				<input type = "text" name = "username"/>
			</label>
		</p>
		<p>
			<label> 휴대폰번호
				<input type = "text" name = "userphone"/>
			</label>
		</p>
		<p>
			<label> 우편번호
				<input type="text" id="sample6_postcode" name = "zipcode" placeholder="우편번호">
				<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
			</label>
		</p>
		<p>
			<label> 주소
				<input type="text" id="sample6_address" name = "addr" placeholder="주소"><br>
				<input type="text" id="sample6_detailAddress" name = "addrdetail" placeholder="상세주소">
			</label>
		</p>
		<p>
			<label> 참고항목
				<input type="text" id="sample6_extraAddress" name = "addretc" placeholder="참고항목">
			</label>
		</p>
		
		<input type = "button" value = "가입완료" onclick = "sendit()"/>
	</form>
</body>
<script src = "user.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</html>