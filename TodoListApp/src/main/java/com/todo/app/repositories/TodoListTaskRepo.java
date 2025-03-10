package com.todo.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.app.models.TodoList;

@Repository
public interface TodoListTaskRepo extends JpaRepository<TodoList, Long>{
	public List<TodoList> findByTaskName(String taskName);
}
