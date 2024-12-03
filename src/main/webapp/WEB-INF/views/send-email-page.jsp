<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error{
 position: fixed;
 text-align: left;
 color: red;
 margin-left: 30px;
}
</style>
</head>
<body>
<h1 align="center">Welcome to Email Page! ${userName}</h1>
<div align="center">
<form:form action="/spring-love-calculator/processEmail/${userName}" modelAttribute="emailDTO">

<form:input path="userEmail"/>
<button type="submit">send</button>
</form:form>
</div>
</body>
</html>