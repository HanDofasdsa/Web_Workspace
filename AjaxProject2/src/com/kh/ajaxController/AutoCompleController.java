package com.kh.ajaxController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kh.board.model.service.BoardService;
import com.kh.board.model.vo.Board;

/**
 * Servlet implementation class AutoCompleController
 */
@WebServlet("/jqAutoSearch.do")
public class AutoCompleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoCompleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String keyword = request.getParameter("keyword"); // 안녕 -> ㅇ 아 안 안ㄴ 안녀 안녕
		
		String searchType = request.getParameter("searchType");
		
		// board테이블에서 검색용 목적으로 BOARD_TITILE칼럼을 사용하고, 전달값으로는 keyword를 넘겨줄 예정
		ArrayList<Board> list = new BoardService().searchList(searchType,keyword);
		
		response.setContentType("application/json; charset=UTF-8");
		
		new Gson().toJson(list, response.getWriter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
