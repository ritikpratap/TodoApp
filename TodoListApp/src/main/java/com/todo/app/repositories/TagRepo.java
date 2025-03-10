package com.todo.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.app.models.Tag;

@Repository
public interface TagRepo extends JpaRepository<Tag, Long> {
	public List<Tag> findByTagName(String tagName);
}
