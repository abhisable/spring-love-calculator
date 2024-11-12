<%@ taglib uri="https://jakarta.ee/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">You Registered Successfuly with below details!</h1>
<div align="center">
 Your Name: ${userRegInfo.user} <br/>
 Your userName: ${userRegInfo.userName}<br/>
 Your password: ${userRegInfo.password}<br/>
 Your country: ${userRegInfo.country}<br/>
 Your hobbies: ${userRegInfo.hobbies}<br/>
 <c:forEach var = "temp" items="${userRegInfo.hobbies}">
         ${temp }
 </c:forEach>
 <br/>
 Your gender: ${userRegInfo.gender}<br/>
 
</div>
</body>
</html>