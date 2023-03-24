/**
 * 회원가입 폼 validation check
 * 개발자 : hy
 * 개발일 : 2023-03-22
 * -------------------------
 * 2023-04-22 : 
 */
function sendit() {
	// 아이디 : "", 5자 이상, 16자 미만
	// 비밀번호 : "", 8자 이상, 비밀번호 = 비밀번호 확인
	// 이름 : ""
	// 휴대폰 번호: ""
	
	let form = document.joinForm;
	
	let userid = form.userid;
	if(userid.value == "") {
		alert("아이디를 입력해주세요.");
		userid.focus();
		return false;
	}
	
	if(userid.value.length < 5 || userid.value.length > 16) {
		alert("아이디는 8자 이상, 16자 미만이어야 합니다.");
		userid.focus();
		return false;
	}
	
	let userpw = form.userpw;
	let userpw_re = form.userpw_re;
	
	if(userpw.value == "") {
		alert("비밀번호를 입력해주세요.");
		userpw.focus();
		return false;
	} else if(userpw.value.length < 8) {
		alert("비밀번호는 8자 이상이어야 합니다.");
		userpw.focus();
		return false;
	}
	
	if(userpw.value != userpw_re.value) {
		alert("비밀번호를 다시 확인해주세요.");
		userpw_re.focus();
		return false;
	}
	
	let username = form.username;
	if(username.value == "") {
		alert("이름을 입력해주세요.");
		username.focus();
		return false;
	}
	
	let userphone = form.userphone;
	if(userphone.value == "") {
		alert("휴대폰번호를 입력해주세요.");
		userphone.focus();
		return false;
	}
	
	form.submit();
	
}

function checkId(userid) {
	
	if(userid == "") {
		alert("아이디를 입력해주세요");
		return false;
	} else {
		// ajax 통신
		let xhr = new XMLHttpRequest();
		xhr.open("GET", "idcheck.jsp?userid=" + userid, true);
		xhr.send();
		xhr.onreadystatechange = function() {
			if(xhr.readyState == 4) {
//				alert(xhr.responseText);
				if(xhr.responseText.trim() === "ok") {
					// 회원가입 가능
					document.getElementById("text").innerHTML
						= "사용할 수 있는 아이디입니다.";
				} else {
					// 회원가입 불가
					document.getElementById("text").innerHTML
						= "중복된 아이디 입니다.";
				}
			}
		}
	} 
}

function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
