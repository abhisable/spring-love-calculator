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
<h1 align="center">Email Successfully send ${userName}</h1>
<div align="center">
Your Email is ${emailDTO.userEmail}
</div>
</body>
</html>