<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	position: fixed;
	text-align: left;
	color: red;
	margin-left: 30px;
}
</style>
</head>
<body>
	<h1 align="center">Please fill below details for Registration!</h1>
	<div align="center">
		<form:form action="registration-success" modelAttribute="userRegInfo">
			<label>User:</label>
			<form:input path="user" />
			<form:errors path="user" cssClass="error"/>
			<br />
			<br />

			<label>User Name:</label>
			<form:input path="userName" />
			<form:errors path="userName" cssClass="error"/>

			<br />
			<br />

			<label>Password:</label>
			<form:password path="password" />

			<br />
			<br />

			<label>Country:</label>
			<form:select path="country">
				<form:option value="IND">INDIA</form:option>
				<form:option value="USA">United State</form:option>
				<form:option value="SL">SriLanka</form:option>
				<form:option value="PAK">Pakistan</form:option>
			</form:select>

			<br />
			<br />

			<label>Hobbies:</label>
			Cricket:<form:checkbox path="hobbies" value="cricket" />
			Reading:<form:checkbox path="hobbies" value="reading" />
			Travel:<form:checkbox path="hobbies" value="travel" />
			Programming:<form:checkbox path="hobbies" value="programming" />

			<br />
			<br />

			<label>Gender:</label>
			Male: <form:radiobutton path="gender" value="male" />
			Female: <form:radiobutton path="gender" value="female" />

			<br />
			<br />
			<label>age:</label>
			<form:input path="age" />
			<form:errors path="age" cssClass="error"/>

			<br />
			<br />
			<h3>Communication Details</h3>

			<br />
			<br />

			<label>Email:</label>
			<form:input path="communicationDTO.email" />



			<label>phoneNumber:</label>
			<form:input path="communicationDTO.phone" />

			<br />
			<br />

			<input type="submit" />
		</form:form>
	</div>
</body>
</html>