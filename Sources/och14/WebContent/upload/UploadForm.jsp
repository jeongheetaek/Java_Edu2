<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<h2> 파일 업로드 </h2>
<form action="Upload.jsp" method ="post" enctype="multipart/form-data">
	<label for = "name"> 작성자 </label> :
		
				<input type = "text" name = "name" id="name" 	required="required"> <p>
		제목	: 	<input type ="text" name ="title"				required="required"> <p>
		파일명 : 	<input type="file" name = "uploadFile"			required="required"> <p>
	
		<input type = "submit" value="확인">
	
</form>


</body>
</html>