package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Board;
import dao.BoardDao;


public class ContentAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("content start!");
		try {
			int num = Integer.parseInt(request.getParameter("num"));
			String pageNum = request.getParameter("pageNum");
			BoardDao db = BoardDao.getInstance();
			
			db.readCount(num);
			Board board = db.select(num);

			request.setAttribute("num", num);  //db에 있는 num
			request.setAttribute("pageNum", pageNum);
			request.setAttribute("board", board);
			
			System.out.println(num);
			System.out.println(pageNum);
			System.out.println(board);
			System.out.println("content end!");
			System.out.println("content end!"+board.getContent());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return "content.jsp";
	}

}

