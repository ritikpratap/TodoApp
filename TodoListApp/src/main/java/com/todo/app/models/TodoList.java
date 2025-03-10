package com.todo.app.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TodoList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long taskId;
	private String taskName, taskDescription,  taskAssignedBy, taskCreationDate, taskEndDate;
	
	// to have status_id as FK in Users table
	
	@ManyToOne(targetEntity = Status.class)
	@JoinColumn(name = "status_id", referencedColumnName = "statusId")
	private Status status; 
	
	// to have tag_id as FK in Users table
	
	@ManyToOne(targetEntity = Tag.class)
	@JoinColumn(name = "tag_id", referencedColumnName = "tagId")
	private Tag tag; 
	
	// to have user_id as FK in Users table
	
	@OneToOne(targetEntity = Users.class)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private Users user;

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public String getTaskAssignedBy() {
		return taskAssignedBy;
	}

	public void setTaskAssignedBy(String taskAssignedBy) {
		this.taskAssignedBy = taskAssignedBy;
	}

	public String getTaskCreationDate() {
		return taskCreationDate;
	}

	public void setTaskCreationDate(String taskCreationDate) {
		this.taskCreationDate = taskCreationDate;
	}

	public String getTaskEndDate() {
		return taskEndDate;
	}

	public void setTaskEndDate(String taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	} 

}
