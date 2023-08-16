function idck(){
	if(f.mid.value==""){
		alert("아이디를 입력해");
	}
	else{
		ajax(f.mid.value);
	}
}

let apost;
let bdata;
function ajax(data){
	var ajax_data = "mid=" + data;	//Backend에게 전달형태 및 데이터값(Get방식이면 "?mid=" )
	
	function aaa(){
		if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}
	}
	function bbb(){
		if(apost.readyState==XMLHttpRequest.DONE && apost.status==200){
			bdata = this.response;
			console.log(bdata);
			return_resp(bdata); //리턴 메세지를 별도로 핸들링하는 함수로 전달
		}
	}
	apost = aaa();
	apost.onreadystatechange = bbb;
	//192.168.110.214:8081/web/ 
	apost.open("POST","http://192.168.110.214:8081/web/login_idck.jsp",true);
	//POST 전송에만 사용되는 enctype 구조이며, 사용자 입력한 모든 데이터를 암호화로 사용한다는 뜻
	apost.setRequestHeader("content-type","application/x-www-form-urlencoded");
	apost.send(ajax_data); //POST면 send에 태워서 보내야함
	
	/* GET전송
	apost.open("GET","http://192.168.110.214:8081/web/login_idck.jsp?mid="+data,true);
	apost.send();
	*/
}

function return_resp(rp){
	//error, no, yes
	if(rp=="no"){
		alert("해당 아이디는 사용하실 수 없습니다.");
	}
	else if(rp=="error"){
		alert("올바른 접근방식이 아닙니다.");
	}
	else{
		alert("해당 아이디는 사용가능 합니다.");
		document.getElementById("mid").readOnly = true;
	}
		
}