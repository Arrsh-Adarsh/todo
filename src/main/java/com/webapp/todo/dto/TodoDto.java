package com.webapp.todo.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="TODO")
public class TodoDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String username;
	
	@Size(min=3, message="Enter atleast 3 characters!")
	@Size(max=80, message="Maximum 80 characters Allowed!")
	private String description;
	
	private LocalDate startDate;
	
	private LocalDate targetDate;
	
	private boolean done;
	
	
	public TodoDto(int id, String username, String description,LocalDate startDate, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.startDate=startDate;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	public TodoDto() {
		
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "TodoDto [id=" + id + ", username=" + username + ", description=" + description + ", startDate="
				+ startDate + ", targetDate=" + targetDate + ", done=" + done + "]";
	}

}
