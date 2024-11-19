
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8" isELIgnored = "false" %> 
    
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
 Your hobbies: 
 <c:forEach var="temp" items="${userRegInfo.hobbies}" >
   ${temp}
 </c:forEach>
 <br/>
 Your gender: ${userRegInfo.gender}<br/>
 <br/>
 Your email: ${userRegInfo.communicationDTO.email}<br/>
 Your phone: ${userRegInfo.communicationDTO.phone}<br/>
 
</div>
</body>
</html>