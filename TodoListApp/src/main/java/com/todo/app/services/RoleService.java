package com.todo.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.models.Role;
import com.todo.app.repositories.RoleRepo;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepo roleRepo;
	
	public List<Role> getAllRoles() {
		return roleRepo.findAll();
	}

	public void saveRole(Role role) {
		roleRepo.save(role);
	}
}
