<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<title>Mobile Web Page</title>
</head>
<body>
<header>
<%@ include file="./top.jsp"%>
</header> <!-- 메뉴 또는 로그인 -->

<main><!-- banner, 입력.....등 모등 웹을 구성 -->
<section>
<%@ include file="./reserve.jsp"%>
</section>
</main>

<footer><!-- copyright -->
<%@ include file="./copyright.jsp"%>
</footer>
</body>
</html>