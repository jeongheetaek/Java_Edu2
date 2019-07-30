package service;

import java.io.IOException;
import java.util.List;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.Board;
import dao.BoardDao;

//mvc에서 servic 작업을 하는 것입니다. 비지니스 로직을 부르는 것이다.

public class ListAction implements CommandProcess {
	
	@Override
	public String requestPro(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			BoardDao bd = BoardDao.getInstance(); //DAO -> DML 작업을 한다.
			try {
				
				int totCnt = bd.getTotalCnt(); // 보드의 전체 카운트 totcnt가 받는다.
				System.out.println("총 가져오는 갯수 " + totCnt);
				String pageNum = request.getParameter("pageNum");
				System.out.println("확인하세요" + pageNum);
				if(pageNum == null || pageNum.equals("")) { pageNum = "1";} //초기설정
				System.out.println("확인하세요" + pageNum);
				
				int currentPage = Integer.parseInt(pageNum);  //현재페이지 받기
				System.out.println("확인하세요 현재페이지" + currentPage);
				int pageSize = 10, blockSize = 10;
				
				int startRow = (currentPage - 1) * pageSize + 1;

				int endRow = startRow + pageSize -1;
				
				int startNum = totCnt - startRow + 1;
				System.out.println("startrow -> " + startRow);
				System.out.println("totCnt -> " + totCnt);
				System.out.println("startNum -> " + startNum);
				
				System.out.println(startRow + "," + endRow);
				//List<Board> list = bd.list(startRow, endRow); //1,10을 가져옴 (자원절감을 위해 지정한 만큼의 범위로 가져온다.)
				List<Board> list = bd.list(startRow, endRow); // 가져올 테이블의 속성 범위를 가져온다. (1~10까지)
				//DAO 의 LIST 클래스의 DML 작업을 호출
				
				int pageCnt = (int)Math.ceil((double)totCnt/pageSize); //math.ceil 소수점 오림 (정수로 만들어버리기)
				int startPage = (int)(currentPage - 1)/blockSize*blockSize+1;
				int endPage = startPage + blockSize - 1;
				if(endPage > pageCnt) endPage = pageCnt;
				
				//board.setContent(request.getParameter("content"));
				//아래는 페이지 세팅을 한다.
				request.setAttribute("totCnt", totCnt);
				request.setAttribute("pageNum", pageNum);
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("list", list);
				request.setAttribute("blockSize",blockSize);
				request.setAttribute("pageCnt", pageCnt);
				request.setAttribute("startPage", startPage);
				request.setAttribute("startNum", startNum);
				request.setAttribute("endPage", endPage);
				
				
				System.out.println("----------------------------");
				System.out.println("startNum --> " + startNum);
				System.out.println("totCnt --> " + totCnt);
				System.out.println("curretPage --> " + currentPage);
				System.out.println("blockSize --> " + blockSize);
				System.out.println("pageCnt --> " + pageCnt);
				System.out.println("startpage --> " + startPage);
				request.setAttribute("startNum", startNum);
				System.out.println("endPage --> " + endPage);
			
			} catch(Exception e) { System.out.println(e.getMessage());}
			return "list.jsp";
	}
}
