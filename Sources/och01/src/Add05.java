

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class add03
 */
@WebServlet("/Add05") // 상속자 지정
public class Add05 extends HttpServlet { //httpservlet의 기능을 add03이 상속받겠다.
	private static final long serialVersionUID = 1L; //version 넘버
    
//    public add03() {
//        super();
//    
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //get 방식시 실행
	
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int num=Integer.parseInt(request.getParameter("num"));
		int sum =0;
		for (int i=1 ; i<= num; i++)
			sum+=i;
		
		System.out.println("Add05 여기확인");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1> 1부터 %d까지 합계 </h1>",num);
		out.println(sum);
		out.println("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { //post 방식시 실행
	
		//doGet(request, response);
	}

}
