/* 
 storage : local, session  : 웹 브라우져에 작은 메모리를 활용하여 해당 정보를 기억시켜 놓는 공간
 단점 : 브라우져 종류가 다를 경우 storage값이 유/무로 나누어집니다.
 window.localStorage.setItem("별명",값 또는 변수명) : storage에 저장
 window.localStorage.getIten("별명") : storage에 있는 별명 명칭 값을 가져올 때 사용
*/


var storage = window.localStorage.getItem("userid");
f.uid.value = storage;

//아이디 저장 기능
function id_save(){
	var ck = document.getElementById("saveid");
	if(f.uid.value==""){
		alert("아이디를 입력하셔야만 해당 기능을 사용할 수 있습니다.")
		ck.checked = false;
	}else{
		if(ck.checked == true){
			window.localStorage.setItem("userid",f.uid.value);			
		}else{
			window.localStorage.setItem("userid","");
		}
	}
}

//로그인
function login() {
	if(f.uid.value==""){
		alert("아이디를 입력하세요");
		f.uid.focus();
		return false;
	}else if(f.upw.value==""){
		alert("패스워드를 입력하세요");
		f.upw.focus();
		return false;
	}else{
		return;
	}
}
//회원가입
function join(){
	if(document.getElementById("id").value == ""){
		alert("아이디 입력");
	}else if(document.getElementById("name").value == ""){
		alert("이름 입력");
	}else if(document.getElementById("pw").value == ""){
		alert("비밀번호 입력");	
	}else if(document.getElementById("pwok").value == ""){
		alert("비밀번호 확인 입력");
	}else if(document.getElementById("pw").value != document.getElementById("pwok").value){
		alert("비밀번호 가 일치하지 않습니다.");
	}else if(document.getElementById("tel").value == ""){
		alert("전화번호 입력");
	}else if(document.getElementById("email").value == ""){
		alert("이메일 입력");
	}else{
		if(document.getElementById("tel").value.length < 10){
			alert("올바른 휴대폰 번호를 입력하세요");
		}else if(isNaN(document.getElementById("tel").value)==true){	//isNaN 숫자를 변환했을때 true -> 문자가 포함됨 false 반환시 ->숫자만
			alert("숫자로 입력하세요");
		}else if(document.getElementById("email").value.indexOf("@")==-1){	
			//indexOf() : 문자열 중에서 @가 포함되어 있는지 검토 -1은 없다는뜻 있으면 양수가 뜸
			alert("제대로된 이메일을 입력하세요");
		}else{
			f.submit();
		}
	}
}