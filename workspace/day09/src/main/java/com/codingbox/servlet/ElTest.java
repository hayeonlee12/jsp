package com.codingbox.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class ElTest extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		arg0.setAttribute("result", "success");
		
		RequestDispatcher dispatcher
			= arg0.getRequestDispatcher("/test.jsp");
		dispatcher.forward(arg0, arg1);
	}
}
