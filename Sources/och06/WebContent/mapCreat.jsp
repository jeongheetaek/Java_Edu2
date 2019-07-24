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

	HashMap<String, String> map = new HashMap<String, String>();
	map.put("park", "목동");
	map.put("홍길동", "율도국");
	map.put("Jasica", "크라이스처치");
	map.put("Susan", "시드니");
	
	request.setAttribute("ADDRESS", map);  //객체명이 address로 바뀌는 부분
	RequestDispatcher dispatcher = request.getRequestDispatcher("mapView.jsp?Name=park");
	
	dispatcher.forward(request, response);
	

%>

</body>
</html>