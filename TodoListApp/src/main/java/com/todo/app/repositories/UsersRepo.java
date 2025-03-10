package com.todo.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.app.models.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long>{
	public List<Users> findByUsername(String username);
}
