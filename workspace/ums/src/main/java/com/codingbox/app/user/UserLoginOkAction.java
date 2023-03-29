package com.codingbox.app.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.app.user.dao.UserDAO;
import com.codingbox.app.user.dao.UserDTO;

public class UserLoginOkAction implements Action{
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		UserDAO udao = new UserDAO();
		
		ActionForward forward = new ActionForward();
		
		String userid = req.getParameter("userid");
		String userpw = req.getParameter("userpw");
		
		if(udao.login(userid, userpw)) {
			forward.setPath("/app/main/mainview.jsp");
			forward.setRedirect(true);
		} else {
			forward.setPath("/app/user/loginview.jsp?flag=false");
			forward.setRedirect(true);
		}
		
		forward.setRedirect(true);
		return forward;
	}
	
}
