package com.taskmanager.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Tasks")
public class Task {
	
	//Task data
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	@Column(length=1000000)
	private String taskName;
	
	@Column(length=1000000)
	private String taskDate;
	
	//Constructors
	public Task() {
		
	}

	public Task(String taskName, String taskDate) {
		super();
		this.taskName = taskName;
		this.taskDate = taskDate;
	}

	//Getters & Setters
	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	
}
