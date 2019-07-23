

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Greet")
public class Greet extends HttpServlet {
	PrintWriter log;
	String path = "c:/log/log.txt";
	public void init(ServletConfig config) throws ServletException {
		try { log = new PrintWriter(new FileWriter(path,true)); // 로그 저장용 프린터
		} catch(IOException e ) {System.out.println("헐 ! 즐~"); }
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		log = new PrintWriter(new FileWriter(path, true));
		String name = request.getParameter("name");
		String msg = name + "님 반가워 \r\n";
		GregorianCalendar gc = new GregorianCalendar();
		String date = String.format("%TF %TT\r\n", gc,gc);
		response.setContentType("text/html;charset=utf-8"); // browser에도 노출하겠따.
		PrintWriter out = response.getWriter(); // 화면노출용 프린터
		out.println("<html><body><h2>인사</h2>"+msg);
		out.println("</body></html>");
		log.print(date+msg);
		log.close();
		
		
		//init();
		
		out.close();
		
	}
	public void destroy() {
		
		if(log != null) log.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
