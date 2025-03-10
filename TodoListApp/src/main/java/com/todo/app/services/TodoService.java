package com.todo.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.models.TodoList;
import com.todo.app.repositories.TodoListTaskRepo;

@Service
public class TodoService {
	
	@Autowired
	private TodoListTaskRepo todoRepo;
	
	@SuppressWarnings("deprecation")
	public TodoList findTaskById(Long id) {
		return (TodoList) todoRepo.getById(id);
	}
	
	public void saveTodoTask(TodoList todoList) {
		todoRepo.save(todoList);
	}
	
	public List<TodoList> getAllTodoItems() {
		return todoRepo.findAll();
	}
	
	public void deleteTodoTask(TodoList todoList) {
		todoRepo.delete(todoList);
	}
}
