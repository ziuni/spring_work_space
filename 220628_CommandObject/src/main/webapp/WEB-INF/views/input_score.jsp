<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>성적구하기</h1>
	<form action="re_score" method="post">
		이름 <input type="text" name="name"><br>
		국어 <input type="text" name="kr"><br>
		영어 <input type="text" name="eng"><br>
		수학 <input type="text" name="math"><br>
		스프링 <input type="text" name="spring"><br>
		<button type="submit" action="./result">제출</button>
	</form>
</body>
</html>