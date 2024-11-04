<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Welcome to Love Calculator!</h1>
<div align="center">
<form:form action="process-homepage" modelAttribute="userInfo">
<p>
<label for="yn">your name: </label>
<form:input  id="yn" path="yourName"/>
</p>
<p>
<label for="cn">crush name: </label>
<form:input  id="cn" path="crushName"/>
</p>
<input type="submit" value="calculate"/>
</form:form>
</div>
</body>
</html>