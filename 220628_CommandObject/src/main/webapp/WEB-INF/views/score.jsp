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
	<h2>�̸� : ${requestScope.name}</h2>
	<h2>���� : ${requestScope.kr}</h2>
	<h2>���� : ${requestScope.eng}</h2>
	<h2>���� : ${requestScope.math}</h2>
	<h2>������ : ${requestScope.spring}</h2>
	<h2>���� : ${requestScope.tot}</h2>
	<h2>��� : ${requestScope.avg}</h2>
</body>
</html>