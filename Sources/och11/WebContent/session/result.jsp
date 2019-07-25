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

	String chk = request.getParameter("chk");
	if (chk.equals("success")) out.println("푹하합니다. 회원가입");
	else out.println("회원 가입이 안됐습니다.");
	

%>

</body>
</html>