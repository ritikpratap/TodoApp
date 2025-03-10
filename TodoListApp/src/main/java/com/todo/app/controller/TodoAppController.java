package com.todo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.models.Role;
import com.todo.app.models.Status;
import com.todo.app.models.Tag;
import com.todo.app.models.TodoList;
import com.todo.app.models.Users;
import com.todo.app.services.RoleService;
import com.todo.app.services.StatusService;
import com.todo.app.services.TagService;
import com.todo.app.services.TodoService;
import com.todo.app.services.UsersService;

@RestController
@RequestMapping(value = "/todo")
public class TodoAppController {
	
	@Autowired
	TodoService todoService;
	@Autowired
	private StatusService statusService;
	@Autowired
	private TagService tagService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private UsersService usersService;
	
	
	@GetMapping(value = "/all/items", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TodoList>> getAllTodoItems() {
		List<TodoList> response = todoService.getAllTodoItems();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/all/roles", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Role>> getAllRoles() {
		List<Role> response = roleService.getAllRoles();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/all/status", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Status>> getAllStatus() {
		// TODO Auto-generated method stub
		List<Status> response = statusService.getAllStatus();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/all/tags", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Users>> getAllTags() {
		// TODO Auto-generated method stub
		List<Users> response = usersService.getAllUsers();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping(value = "/all/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tag>> getAllUsers() {
		// TODO Auto-generated method stub
		List<Tag> response = tagService.getAllTags();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
