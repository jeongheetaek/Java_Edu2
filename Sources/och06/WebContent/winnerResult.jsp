<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- 배열값으로 받기  -->


<h2> 우승자 </h2>
1등 : ${winner[0]}<p>
2등 : ${winner[1]}<p>
3등 : ${winner[2]}<p>

<h2> 우승자 </h2>
<%
	
	String[] win = (String []) request.getAttribute("winner");
	for(int i=0; i<win.length; i++){
		out.println((i+1) + "둥 :" + win[i] + "<p>");
	}


%>	

</body>
</html>