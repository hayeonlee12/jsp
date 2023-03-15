package com.codingbox.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class MyServlet5 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {

		int number1 = Integer.parseInt(arg0.getParameter("x"));
		int number2 = Integer.parseInt(arg0.getParameter("y"));
		
		String button = arg0.getParameter("operator");
		
		int sum = number1 + number2;
		int minus = number1 - number2;
		
		PrintWriter out = arg1.getWriter();
		
		if(button.equals("덧셈")) {
			out.println("result is " + sum);
		} else {
			out.println("result is " + minus);
		}
	}
}
