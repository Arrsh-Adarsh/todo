package com.webapp.todo.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.webapp.todo.dto.TodoDto;
import com.webapp.todo.service.TodoService;

import jakarta.validation.Valid;

@Component
public class TodoServiceImpl implements TodoService {

	private static List<TodoDto> todos = new ArrayList<>();
	
	private static int todoCount = 0;

	@Override
	public List<TodoDto> findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addtodo(String name, String Description, LocalDate date, boolean done) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TodoDto findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateTodo(@Valid TodoDto todoBean) {
		// TODO Auto-generated method stub
		
	}
	
//	static {
//		todos.add(new TodoDto(++todoCount, "owleye", "Learn Java", 
//				LocalDate.now().plusYears(1), false));
//		todos.add(new TodoDto(++todoCount, "JavaTPoint", "Learn Spring Boot", 
//				LocalDate.now().plusYears(2), false));
//		todos.add(new TodoDto(++todoCount, "JavaTPoint", "Learn AWS", 
//				LocalDate.now().plusYears(3), false));
//	}
//	
//	public List<TodoDto> findByUserName(String username){
//		Predicate<? super TodoDto> predicate = todo-> todo.getUsername().equalsIgnoreCase(username);
//		return todos.stream().filter(predicate).toList();
//	}
//	
//	public void addtodo(String name, String description, LocalDate targetDate, boolean done){
//		todos.add(new TodoDto(++todoCount, name, description, targetDate, done));
//	}
//	
//	public void deleteById(int id) {
//		Predicate<? super TodoDto> predicate = todo-> todo.getId() == id;
//		todos.removeIf(predicate);		
//	}
//	public TodoDto findById(int id) {
//		Predicate<? super TodoDto> predicate = todo-> todo.getId() == id;
//		TodoDto todoDto = todos.stream().filter(predicate).findFirst().get();
//		return todoDto;
//	}
//	
//	public void updateTodo(@Valid TodoDto todoDto) {
//		deleteById(todoDto.getId());
//		todos.add(todoDto);
//	}
}
