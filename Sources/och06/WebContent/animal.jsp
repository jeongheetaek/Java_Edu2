<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

첫번째 동물 : ${param.an1} <br> <!-- script에서는 script getparmeter로 가져오던걸 익스프레션 기법 -->
첫번째 동물 : ${param.an2} <p>
같은 동뭉 : ${param.an1 == param.an2} <br>

</body>
</html>
