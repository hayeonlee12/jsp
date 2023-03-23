<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ajax를 이용해 실시간 순위 나타내기</h1>
	<table border = "1">
		<tr>
			<th>실시간 검색 순위</th>
			<th>키워드</th>
		</tr>
		<tr>
			<td id = "td1">순위</td>
			<td id = "td2">키워드</td>
		</tr>
	</table>
	
	<script>
		// HTML이 다 load된 후 실행
		window.onload = function(){
			let obj = "";
			let word = new Array();
			let xhr = new XMLHttpRequest();
			xhr.open("GET", "data.json", true);		
			xhr.send();
			xhr.onreadystatechange = function(){
				if( xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200 ){
					obj = JSON.parse( xhr.responseText );
				
					for(let i = 0; i< obj.search_word.length; i++  ){
					
						word[i] = obj.search_word[i].name;
					}
				}		
			}
			
			let i = 0;
			let interval = setInterval(function(){
			
				i = i % obj.search_word.length;
				document.getElementById("td1").innerHTML = i + 1;
				document.getElementById("td2").innerHTML = word[i];
				i++;
				
			},3000);
			
			// setTimeout(함수, 밀리초)
			// : 해당 밀리초 이후에 앞에 넘겨준 함수를 호출
			setTimeout(function() {
				// clearInterval(interval) 
				// : 해당 인터벌 삭제
				// 
					
				clearInterval(interval);
			}, 20000);
		}
	</script>
</body>
</html>