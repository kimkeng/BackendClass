<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%	
	session.invalidate();	
%>
<meta charset="UTF-8">
<script>
	window.onload = function(){
		alert("로그아웃 되셨습니다.")
		location.href="./login.jsp";
	}
</script>
