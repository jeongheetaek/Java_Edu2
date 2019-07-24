<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	String [] winner = {"홍길동", "김길동", "고길동"};
	request.setAttribute("winner", winner);
	RequestDispatcher re= request.getRequestDispatcher("winnerResult.jsp");
	re.forward(request, response);

%>

</body>
</html>