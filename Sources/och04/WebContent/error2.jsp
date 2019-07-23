<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%> <!-- isErrorPage="true" 을 반드시 추가해놔야 함 에러출력시 -->
    <% response.setStatus(200); %> <!--  response.setStatus(200); 정상인 코스프레?  -->
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2> 공지사항 </h2>
나은 서비스를 위해서 준비중입니다. <p>
메세지 : <%=exception.getMessage() %> <br>
클래스 : <%=exception.getClass() %>
</body>
</html>