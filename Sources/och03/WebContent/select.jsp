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
	
	String[] col = {"red", "orange", "yellow", "green", "blue", "navy", "vilet", "black"};
	int n= (int)(Math.random()*8);
	
	//String num = request.getParameter("num");
	//RequestDispatcher rd = null;
	
	
	String pgm = request.getParameter("pgm") + ".jsp";
	
	RequestDispatcher rd = request.getRequestDispatcher(pgm);
	
	if(pgm.equals("color1.jsp")){
		request.setAttribute("color", col[n]);
		//rd = request.getRequestDispatcher("Color1.jsp");
	} else if (pgm.equals("gugu1.jsp")){
		request.setAttribute("num",n+2);
		//rd = request.getRequestDispatcher("gugu1.jsp");
	} else if(pgm.equals("response.jsp")) {
		
		//rd = request.getRequestDispatcher("response.jsp");
	}
	rd.forward(request, response);
	
%>

</body>
</html>