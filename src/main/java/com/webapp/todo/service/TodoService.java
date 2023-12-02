package com.webapp.todo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.todo.dto.TodoDto;

import jakarta.validation.Valid;

@Service
public interface TodoService {
	public List<TodoDto> findByUserName(String username);
	
	public void addtodo(String name, String Description, LocalDate date, boolean done);
	
	public void deleteById(int id);
	
	public TodoDto findById(int id);
	
	public void updateTodo(@Valid TodoDto todoBean);
}
