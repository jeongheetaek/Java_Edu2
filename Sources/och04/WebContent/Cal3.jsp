<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<h2> 연산결과 </h2>
<!-- 직접 자바스크립트에서 에러메세지 -->
<% 

try{
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	out.println(num1 +" + " + num2 + " = " + (num1+num2)+"<p>");
	out.println(num1 +" - " + num2 + " = " + (num1-num2)+"<p>");
	out.println(num1 +" * " + num2 + " = " + (num1*num2)+"<p>");
	out.println(num1 +" / " + num2 + " = " + (num1/num2)+"<p>");
	}catch(NumberFormatException e) { 
%>
	<script type="text/javascript"> alert("그게 숫자냐"); history.go(-1); 
		</script> 
<% }catch(ArithmeticException e) { 
%>
	<script type="text/javascript"> alert("0으로 못나눠"); history.go(-1);
	 	</script>
<% }catch(Exception e) { out.println(e.getMessage()); 
%>
	<script type="text/javascript"> alert("하여튼 에러야"); location.href="Num2.html";
	</script>
<%}  
%>

</head>
<body>

</body>
</html>