<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<title>Mobile Login Page</title>
</head>
<script>
	function login(){
		
	}
</script>
<body>
<header>
<%@ include file="./top.jsp"%>
</header> <!-- 메뉴 또는 로그인 -->

<main><!-- banner, 입력.....등 모등 웹을 구성 -->

<form name="f" method="post" action="./mlogin.do">
<section>
<p>MEMBER-LOGIN</p>
아이디 : <input type="text" name="mid" required="required"><br>	<!-- required : 필수 입력란을 가이드해주는 함수 -->
패스워드 : <input type="password" name="mpass" required="required"><br>
<button type="submit" >로그인</button>
</section>
</form>

</main>

<footer><!-- copyright -->
<%@ include file="./copyright.jsp"%>
</footer>
</body>
<script>
	var id = "<%=user_id%>";
	var nm = "<%=user_name%>";
	if(id != "null" && id != "null"){
		location.href="./index2.jsp";
	}
</script>

</html>
