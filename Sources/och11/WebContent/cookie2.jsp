<%@page import="java.net.URLEncoder"%>
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

	Cookie cook2 = new Cookie("name", URLEncoder.encode("중앙정보","utf-8"));
	response.addCookie(cook2);

%>
쿠키저장 성공 <p>

<a href="cookView2.jsp">쿠키보기</a>

</body>
</html>