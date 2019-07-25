<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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

	request.setCharacterEncoding("utf-8");
	int maxSize = 5 * 1024 * 1024;
	String fileSave = "/fileSave";
	String realPath = getServletContext().getRealPath(fileSave);
	System.out.println(realPath);
	//C:\Java Programming\Sources\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\och14\
	System.out.println("realpath -> " + realPath);
	
	//MultipartRequest multi = new MultipartRequest(request, realPath, maxSize, "utf-8", new DefaultFileRenamePolicy());
	//MultipartRequest milti = new MultipartRequest(request, realPath, maxSize, "utf-8", new DefaultFileRenamePolicy());'
	MultipartRequest multi = new MultipartRequest(request, realPath, maxSize, "utf-8", new DefaultFileRenamePolicy());
	
	Enumeration en = multi.getFileNames(); //Enumeration - 나열 
	
	while(en.hasMoreElements()){
		//input 태그의 속성이 file인 태그의 name 속성값 : 파라미터이름
		String filename1 = (String) en.nextElement();
	
		//서버에 저장된 파일 이름
		String filename = multi.getFilesystemName(filename1);
		
		//전송전 원래의 파일 이름
		String origianl = multi.getOriginalFileName(filename1);
		
		//전송된 파일의 내용 타임
		String type = multi.getContentType(filename1);
		
		File file = multi.getFile(filename1);
		
		out.println("real Path : " + realPath + "<br>");
		out.println("파라미터 이름 : " + filename1 + "<br>");
		out.println("실제 파일 이름 : " + origianl + "<br>");
		out.println("저장된 파일 이름: " + filename + "<br>");
		out.println("파일 타입  : " + realPath + "<br>");
		
		if(file!= null){
			out.println("크기 : " + file.length() + "<br");
		}
	}
	String name = multi.getParameter("name");
	String title = multi.getParameter("title");
		
%>

작성자 : <%= name  %> <br>
제목 : <%= title %> <br>

</body>
</html>