<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
요기는 연산만하고 결과는 다음 페이지
<%
	
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	int add = num1 + num2;
	int min = num1 - num2;
	int mul = num1 * num2;
	int div = num1 / num2;
	
	request.setAttribute("add", add); //저장방식
	request.setAttribute("min", min); //저장방식
	request.setAttribute("mul", mul); //저장방식
	request.setAttribute("div", div); //저장방식
	
	//out.flush(); //버퍼 비우기
	
	RequestDispatcher rd = request.getRequestDispatcher("CalResult.jsp");
	
	// jsp에서는 html의 form을 사용할 수 없기에 페이지 이동을 위해 사용하는 객체 
	rd.forward(request, response); 
	//calResult에서 값을 가져오는 것이 아니라 calresult에서 값이 출력된다.
	
	//rd.include(request, response); out.flush() 가 필수이다.
	//CalResult에서 리턴된 값을 받아와서 현재 페이지에서 값을 보여줌 

%>
</head>
<body>

</body>
</html>