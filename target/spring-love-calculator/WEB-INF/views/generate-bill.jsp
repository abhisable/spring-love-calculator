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
<h1 align="center">Welcome to bill payment page!</h1>
<div align="center">
<form:form action="process-bill" modelAttribute="bill" >
<p>
<label>credit card: </label>
<form:input path="creditCard"/>
</p>
<p>
<label>amount: </label>
<form:input path="amount"/>
</p>

<input type="submit" value="PAY"/>
</form:form>
</div>
</body>
</html>
