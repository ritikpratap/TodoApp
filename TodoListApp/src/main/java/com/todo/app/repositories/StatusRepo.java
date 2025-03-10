package com.todo.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.app.models.Status;

public interface StatusRepo extends JpaRepository<Status, Long> {
	public Status findByStatusName(String statusName);
}
