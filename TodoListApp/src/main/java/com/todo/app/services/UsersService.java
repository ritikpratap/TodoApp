package com.todo.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.models.Users;
import com.todo.app.repositories.UsersRepo;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepo usersRepo;
	
	public List<Users> getAllUsers() {
		return usersRepo.findAll();
	}
	
	public void saveUser(Users user) {
		usersRepo.save(user);
	}
	
}
