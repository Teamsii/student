package com.etoak.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class HelloController implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println("name - " + name);
		
		// 向request域传值
		request.setAttribute("result","Hello " + name);
		
		// 返回页面
		request.getRequestDispatcher("/hello.jsp").forward(request, response);
	}
}
