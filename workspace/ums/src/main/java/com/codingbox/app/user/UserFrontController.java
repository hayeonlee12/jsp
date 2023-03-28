package com.codingbox.app.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.ActionForward;

@WebServlet()
public class UserFrontController extends HttpServlet {
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
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String requestURI = req.getRequestURI();
		ActionForward forward = null;
		if(requestURI.equals("/user/UserJoin.us")) {
			System.out.println(requestURI + " 도착!!");
			forward = new UserJoinAction().execute(req, resp);
		} else if(requestURI.equals("/user/UserLogin.us")) {
			forward = new ActionForward(false, "/app/user/loginview.jsp");
		}
		
		// 전송에 대한 일괄처리
		if(forward != null) {
			if(forward.isRedirect()) { 
				// true : redirect
				resp.sendRedirect(forward.getPath());
			} else {
				// false : forward
				RequestDispatcher disp = 
						req.getRequestDispatcher(forward.getPath());
				disp.forward(req, resp);
			}
		}
	}
}
