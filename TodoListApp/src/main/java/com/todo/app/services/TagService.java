package com.todo.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.models.Tag;
import com.todo.app.repositories.TagRepo;

@Service
public class TagService {
	
	@Autowired
	private TagRepo tagRepo;
	
	public List<Tag> getAllTags() {
		return tagRepo.findAll();
	}
	
	public void saveTag(Tag tag) {
		tagRepo.save(tag);
	}
}
