package com.todo.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.app.models.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {
	
}
