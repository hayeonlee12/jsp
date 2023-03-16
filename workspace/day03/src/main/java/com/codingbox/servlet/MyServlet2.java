package com.codingbox.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/calc2")
public class MyServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		// session
//		HttpSession session = arg0.getSession();
		
//		ServletContext application 
//		= arg0.getServletContext();
//	
		String value_ = arg0.getParameter("value");
		String op = arg0.getParameter("operator");
		
		// cookie
		Cookie[] cookies = arg0.getCookies();
		
		int x = 0;
//		Cookie c = cookies[0];
//		if(c.getName().equals("value")) {
//			x = Integer.parseInt(c.getValue());
//		}
		for(Cookie c : cookies ) {
			if(c.getName().equals("value")) {
				x = Integer.parseInt(c.getValue());
				break;
			}
		}
		
		PrintWriter out = arg1.getWriter();
		
		int value = 0;
		
//		if(!value_.equals("")) {
//			value = Integer.parseInt(value_);
//		}
//		
		if(op.equals("=")) {
			// 계산
//			int x = (Integer)application.getAttribute("value");
//			int x = (Integer)session.getAttribute("value");
//			int y = value;
//			String operator = (String)application.getAttribute("op");
//			String operator = (String)session.getAttribute("op");
			
			String operator = "";
			for(Cookie c : cookies) {
				if(c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}
			
//			int result = 0;
			
			if(op.equals("+")) {
//				result = x + y;
			} else {
//				result = x - y;
			}
			
//			out.printf("결과값 : %d", result);
		} else {
			// application 값 저장
//			application.setAttribute("value", value);
//			application.setAttribute("op", op);
			
//			session.setAttribute("value", value);
//			session.setAttribute("op", op);
			
			
			// cookie로 저장, 저장시 문자열 형태만 사용
			Cookie valuecookie = new Cookie("value_", String.valueOf(value));
			Cookie opCookie = new Cookie("op", op);
			
			// 사용자에게 cookie 전달
			arg1.addCookie(valuecookie);
			arg1.addCookie(opCookie);
		}
	
	}
}
