import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
@WebServlet("/Practice")
public class Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("password");
		
		String gender = request.getParameter("gender");
		String [] notice = request.getParameterValues("notice");
		
		String job = request.getParameter("job");
		
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html> <body> <h1> 당신의 정보 </hr> <p>");
		out.println("<table border = '1' bgcolor = 'yellow'>");
		out.println("<tr> 이름 : " + name + "<p> </tr>");
		out.println("아이디 : " + id + "<p>");
		out.println("암호 : " + pass + "<p>");
		out.println("성별 : " + gender + "<p>");
		out.println("알림설정 : " + Arrays.toString(notice) + "<p>");
		
		if(notice != null){
			for(int i=0; i< notice.length;i++){
				out.println(notice[i]+ " ");
		 
			}
		} else out.println("없음");
		out.println("<p> 직업 : " + job + "<p> ");
		out.println("</table>");
		out.println("</body> </html>");
		
		out.println();
		out.close();
		//doGet(request, response);
	}

}
