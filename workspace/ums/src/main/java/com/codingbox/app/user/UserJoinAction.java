package com.codingbox.app.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingbox.action.Action;
import com.codingbox.action.ActionForward;
import com.codingbox.app.user.dao.UserDAO;
import com.codingbox.app.user.dao.UserDTO;

public class UserJoinAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		UserDTO user = new UserDTO();
		UserDAO udao = new UserDAO();
		
		user.setUserid(req.getParameter("userid"));
		user.setUserpw(req.getParameter("userpw"));
		user.setUsername(req.getParameter("username"));
		user.setUserphone(req.getParameter("userphone"));
		user.setUseraddr(req.getParameter("useraddr"));
	
		ActionForward forward = new ActionForward();
		
		if (udao.join(user)) {
			forward.setPath("/app/user/loginview.jsp");
			forward.setRedirect(true);
		} else {
			forward.setPath("/index.jsp?flag=false");
			forward.setRedirect(true);
		}
		
		return forward;
	}
}
