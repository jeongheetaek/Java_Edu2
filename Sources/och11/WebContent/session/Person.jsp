<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type = "text/css">
	table { background-color: pink;}
	tr:hover { background-color: green;}
</style>

</head>
<body>

<h2> 회원가입 </h2>

<form action = "agree.jsp">
	<table border = "1">
		<tr><td> 아이디 </td><td><input type = "text" name = "id" required = "required"> </td></tr>
		<tr><td> 패스워드 </td><td><input type = "text" name = "password" required = "required"> </td></tr>
		<tr><td> 이름 </td><td><input type = "text" name = "name" required = "required"> </td></tr>
		
		<tr><td><input type = "submit" value = "확인"> </td></tr>
		<tr><td><input type = "reset" value = "취소"> </td></tr>
			
	</table>
</form>

</body>
</html>