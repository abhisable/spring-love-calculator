<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Result page</h1>
<p>
your name: ${userInfo.getYourName()}
</p>
<p>
crush name: ${userInfo.getCrushName()}
</p>
You Guys are ${result}
<br>
<br>
<a href="/spring-love-calculator/sendEmail">click here to send mail</a>
</body>
</html>