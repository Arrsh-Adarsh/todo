package com.webapp.todo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.webapp.todo.service.AuthService;
import com.webapp.todo.service.TodoService;
import com.webapp.todo.serviceImpl.AuthServiceImpl;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AuthService authService;

	@GetMapping(value="/")
	public String welcomePage(ModelMap model) {
		
		model.put("name", authService.getLoggedinUserName());
		logger.info("Into welcome page");
		return "welcome_page";
	}
	
}
