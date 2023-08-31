//글쓰기 부분
function bon(){
	var t = CKEDITOR.instances.texts.getData();
	console.log(t)
	if(t == ""){
		alert("게시판 내용을 입력해 주세요");
	}else{
		b.submit();
	}
	
	/*
	if(document.getElementById("bt").value == ""){
		alert("제목을 입력하여 주세요.")
	}else if(document.getElementById("bi").value == ""){
		alert("글쓴이를 입력하여 주세요.")
	}else if(document.getElementById("bp").value == ""){
		alert("패스워드를 입력하여 주세요.")
	}else if(document.getElementById("bc").value == ""){
		alert("내용을 입력하여 주세요.")
	}else{
		b.submit();
	}
	*/
}

//게시판 부분
function lon(){
	alert("글쓰기");
}