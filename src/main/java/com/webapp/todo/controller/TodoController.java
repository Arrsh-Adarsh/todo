package com.webapp.todo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.webapp.todo.dto.TodoDto;
import com.webapp.todo.repository.TodoRepo;
import com.webapp.todo.service.AuthService;
import com.webapp.todo.service.TodoService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
@SessionAttributes("name")
public class TodoController {
	
//	private TodoService todoService;
	
	@Autowired
	private AuthService authService;
	@Autowired
	private TodoRepo todoRepo;
	
	public TodoController(TodoService todoService) {
		super();
//		this.todoService = todoService;
	}


	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		String userName = authService.getLoggedinUserName();
		model.put("name", userName);
		List<TodoDto> todos = todoRepo.findByUsername(userName);
		model.addAttribute("todos", todos);
		return "listAllTodos";
	}
	
	@GetMapping("add-todo")
	public String addTodosPage(ModelMap model) {
		String userName = authService.getLoggedinUserName();
		model.put("name", userName);
		TodoDto todoDto = new TodoDto(0, userName, "",LocalDate.now(),LocalDate.now().plusYears(1), false);
		model.put("todoDto", todoDto);
		return "add_todo";
	}
	
	@PostMapping("add-todo")
	public String addTodos(ModelMap model, @Valid TodoDto todoDto, BindingResult brResult) {
		String username = authService.getLoggedinUserName();
		model.put("name", username);
		if(brResult.hasErrors()) {
			return "add_todo";
		}
		todoDto.setUsername(username);
		todoRepo.save(todoDto);
		return "redirect:list-todos";
	}
	
	@GetMapping("delete-todo/{value}")
	public String deleteTodoPage(@PathVariable("value") int id) {
		todoRepo.deleteById(id);
		return "redirect:/list-todos";
	}
	@GetMapping("update-todo/{value}")
	public String updateTodoPage(@PathVariable("value") int id, ModelMap model) {
		TodoDto todoDto = todoRepo.findById(id).get();
		model.put("name", authService.getLoggedinUserName());
		model.addAttribute("todoDto", todoDto);
		return "add_todo";
	}
	
	@PostMapping("update-todo/{value}")
	public String updatingTodoPage(ModelMap model,@Valid TodoDto todoDto, BindingResult brResult) {
		
		if(brResult.hasErrors()) {
			return "add_todo";
		}
		
		String userName = authService.getLoggedinUserName();
		model.put("name", userName);
		todoDto.setUsername(userName);
		todoRepo.save(todoDto);
		return "redirect:/list-todos";
	}
	
	@PostMapping("delete-all")
	public String deleteAllTodos(ModelMap model) {
		String userName = authService.getLoggedinUserName();
		model.put("name", userName);
		todoRepo.deleteByUsername(userName);
		return "redirect:/list-todos";
	}
}
