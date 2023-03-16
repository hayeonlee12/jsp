package com.codingbox.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/postget")
public class PostgetServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		if(request.getMethod().equals("GET")) {
			System.out.println("GET요청");
		} else if (request.getMethod().equals("POST")) {
			System.out.println("POST요청");
		}
		
		super.service(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("doPost 메소드 호출");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("doGet 메소드 호출");
	}
}
