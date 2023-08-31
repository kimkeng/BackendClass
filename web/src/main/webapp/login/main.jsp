<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
String shopping_id = "";
String shopping_name = "";
	try{
	shopping_id = session.getAttribute("userid").toString();
	shopping_name = session.getAttribute("username").toString();
	}catch(NullPointerException e){
		
	}finally{
		//out.print("<scipt>alert('올바른 접근이 아닙니다.');location.href = './login/login.jsp';</script>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mail page (Session check)</title>
</head>

<script>
	function logout(){
		location.href="./logout.jsp";
	}
</script>
<body>
아이디 : 	<%= shopping_id %><br>
고객명 :  <%= shopping_name %><br>
<input type="button" onclick="logout()" value="로그아웃">
</body>
</html>