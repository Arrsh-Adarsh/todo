package com.webapp.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("/Hello")
	@ResponseBody
	public String sayHello() {
		return "Hello !!";
	}
	
	@RequestMapping("/HelloJsp")
	public String sayHelloJsp() {
		logger.info("Into Hello page");
		return "Hello";
	}
}
