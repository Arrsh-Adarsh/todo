package com.webapp.todo.serviceImpl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.webapp.todo.service.AuthService;

@Component
public class AuthServiceImpl implements AuthService{

	public String getLoggedinUserName() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth.getName();
	}
}
