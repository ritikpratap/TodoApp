package com.todo.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.models.Status;
import com.todo.app.repositories.StatusRepo;

@Service
public class StatusService {
	
	@Autowired
	private StatusRepo statusRepo;
	
	public List<Status> getAllStatus() {
		return statusRepo.findAll();
	}

	public void saveStatus(Status status) {
		statusRepo.save(status);
	}
	
	@SuppressWarnings("deprecation")
	public Status findStatusById(Long id) {
		return (Status) statusRepo.getById(id);
	}
}
