<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입 폼</h3>
	<form action="join" method = "post" id = "joinForm">
		아이디 <input type = "text" name = "userid" id = "userid"/> <br>
		비밀번호 <input type = "password" name = "userpw" id = "userpw"/> <br>
		이름 <input type = "text" name = "username" id = "username"/> <br>
		휴대폰번호 <input type = "text" name = "userphone" id = "userphone"/> <br>
		<input type = "button" value = "회원가입" onclick = "sendit()"/>
 	</form>
 	
 	<script>
 		/*
 			- 아이디 		: ""
 			- 비밀번호 	: "", 8자리 이상
 			- 이름 		: ""
 			- 휴대폰번호	: ""
 		*/
 		function sendit() {
 			let form = document.getElementById("joinForm");
 			let userid = joinForm.userid;
 			let userpw = joinForm.userpw;
 			let username = joinForm.username;
 			let userphone = joinForm.userphone;
 			
 			if(userid.value == "") {
 		 		alert("아이디를 입력해주세요.");
 		 		userid.focus();
 		 		return false;
 		 	}
 		 		
 		 	if(userpw.value == "") {
 		 		alert("비밀번호를 입력해주세요.");
 		 		userpw.focus();
 		 		return false;
 		 	} else if(userpw.value.length < 8) {
 		 		alert("비밀번호는 8자리 이상이어야 합니다.");
 		 		userpw.focus();
 		 		return false;
 		 	}
 		 		
 		 	if(username.value == "") {
 		 		alert("이름을 입력해주세요.");
 		 		username.focus();
 		 		return false;
 		 	}
 		 		
 		 	if(userphone.value == "") {
 		 		alert("휴대폰 번호를 입력해주세요.")
 		 		userphone.focus();
 		 		return false;
 		 	}	
 		 	
 		 	form.submit();
 		}
 	
 	</script>
</body>
</html>