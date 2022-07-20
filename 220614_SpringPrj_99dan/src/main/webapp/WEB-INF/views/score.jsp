<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>score</h1>
	<h2>이름 : ${requestScope.name}</h2>
	<h2>국어 : ${requestScope.kr}</h2>
	<h2>영어 : ${requestScope.eng}</h2>
	<h2>수학 : ${requestScope.math}</h2>
	<h2>스프링 : ${requestScope.spring}</h2>
	<h2>총점 : ${requestScope.tot}</h2>
	<h2>평균 : ${requestScope.avg}</h2>
</body>
</html>