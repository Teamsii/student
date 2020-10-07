package com.etoak.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(path = {"/hello","hello2"})
	public String hello(String name,HttpServletRequest request) {
		System.out.println("name + " + name);
		request.setAttribute("result", "Hello" + name);
		return "hello";
	}
}
