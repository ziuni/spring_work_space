<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>select ���</h1>
	<c:forEach var="value" items="${list }">
		${value.data1 }, ${value.data2 }, ${value.data3 } <br>
	</c:forEach>
</body>
</html>