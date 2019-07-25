<%@page import="util.MemberDTO"%>
<%@page import="util.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="util.*" errorPage="Error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
	out.print("error");
	String chk = "";
	String agree = request.getParameter("agree");
	if(agree.equals("y")){
		String id = (String)session.getAttribute("id");
		String password = (String)session.getAttribute("password");
		String name = (String)session.getAttribute("name");
		
		MemberDao md = new MemberDao();
		MemberDTO member = new MemberDTO();
		
		member.setId(id);
		member.setName(name);
		member.setPassword(password);
		
		int result = md.insert(member); // id. name. password. 식으로 해도 됨
		if(result > 0 ) chk = "success";
		else chk = "fail";
		
	} else chk = "fail";
	session.invalidate();
	out.print("invalidate() 적용후에도 " + session.getId() + "<br>");
	response.sendRedirect("result.jsp?chk="+chk);
%>

</body>
</html>