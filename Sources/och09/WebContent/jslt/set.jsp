<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<c:set var="num1" value="6"/> 
<c:set var="num2" value="2"></c:set>
<c:set var="result" value="${num1+num2}"></c:set> 


<body>

덧셈 : ${num1 } + ${num2 } = ${result} <p>
뺄셈 : ${num1 } - ${num2 } = ${num1 - num2} <p>
곱셈 : ${num1 } * ${num2 } = ${num1 * num2} <p>
나눗셈 : ${num1 } / ${num2 } = ${num1 / num2} <p>

</body>
</html>