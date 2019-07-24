<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="person" class="och08.Person" scope="request"/>

<%-- 	<jsp:setProperty property="name" name="person" value="홍길동"/>
	<jsp:setProperty property="gender" name="person" value="남자"/>
	<jsp:setProperty property="age" name="person" value="23"/> --%>
	
	<!-- 위는 받은 값을 value 값으로 지정해서 노출하겠다. 아래는 입력받은거 그대로 노출 -->
	<jsp:setProperty property="*" name="person"/> <!-- 입력 받은거 그대로 전달하겠다.  -->
	<jsp:forward page="personResult.jsp"></jsp:forward>

</body>
</html>