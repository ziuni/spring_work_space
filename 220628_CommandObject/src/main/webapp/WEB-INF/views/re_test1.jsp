<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>data1,. data2</h1>
<%-- 	<h2>data1: ${requestScope.DataBean.data1 }</h2><br>
	<h2>data2: ${requestScope.DataBean.data2 }</h2><br> --%>
	<h2>data1: ${requestScope.testbean.data1 }</h2><br>
	<h2>data1: ${requestScope.testbean.data2 }</h2><br>
</body>
</html>