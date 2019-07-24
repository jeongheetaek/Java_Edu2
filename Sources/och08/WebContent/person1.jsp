<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<jsp:useBean id="person" class="och08.Person" scope="request"></jsp:useBean>
	<!-- Person person = new Person(); person에 대한 인스턴스를 가져온것과 같음 위의 코드와 동일의미--> 
	
	
	<%-- <jsp:setProperty property="name" name="person" value="홍길동"/> --%>
	<jsp:setProperty property="name" name="person" param = "name"/>
	
	<!-- person.setName("홍길동"); 입력된 값을 바꿔준다. 아래코드-->
	<jsp:setProperty property="gender" name="person" value="남자"/>
	<jsp:setProperty property="age" name="person" value="23"/>
	
	<h2> 인적사항 </h2>
	
	이름 : <jsp:getProperty property="name" name="person"/><p>
	<!-- person.getName() -->
	성별 : <jsp:getProperty property="gender" name="person"/><p>
	나이 : <jsp:getProperty property="age" name="person"/>
	

</body>
</html>