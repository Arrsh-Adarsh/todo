package com.webapp.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.todo.dto.TodoDto;

public interface TodoRepo extends JpaRepository<TodoDto, Integer>{
	
	public List<TodoDto> findByUsername(String username);
	
	@Transactional
	public void deleteByUsername(String username);
	
}
