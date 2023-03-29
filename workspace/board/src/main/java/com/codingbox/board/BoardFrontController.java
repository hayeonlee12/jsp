package com.codingbox.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.ActionForward;

@WebServlet("*.bo")
public class BoardFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws IOException, ServletException {
		String requestURI = request.getRequestURI();
		ActionForward forward = new ActionForward();
		
		if(requestURI.equals("/board/BoardWrite.bo")) {
			forward = new ActionForward(true, "/board/boardwrite.jsp");
		} else if(requestURI.equals("/board/BoardWriteOK.bo")) {
			System.out.println(requestURI + " 도착!!");
			forward = new BoardWriteOkAction().execute(request, response);
		}
		
		if(forward != null) {
			if(forward.isRedirect()) { 
				// true : redirect
				response.sendRedirect(forward.getPath());
			} else {
				// false : forward
				RequestDispatcher disp = 
						request.getRequestDispatcher(forward.getPath());
				disp.forward(request, response);
			}
			
		}
	}
}
