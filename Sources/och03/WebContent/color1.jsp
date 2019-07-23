<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<%

	String color = request.getAttribute("color").toString();

%>
<body bgcolor="<%=color%>"> <!--자바에 있는 고드를 html에서 꺼낼 수 있는 것은 %= 으로 사용된다.  -->

</body>
</html>