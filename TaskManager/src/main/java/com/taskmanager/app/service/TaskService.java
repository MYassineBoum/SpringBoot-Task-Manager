package com.taskmanager.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanager.app.model.Task;
import com.taskmanager.app.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Optional<Task> getTask(final Long ID) {
		return taskRepository.findById(ID);
	}
	
	public List<Task> getAllTasks() {
        return (List<Task>) taskRepository.findAll();
    }
	
	public void deleteTask(final Long ID) {
		taskRepository.deleteById(ID);
	}
	
	public void saveTask(Task task) {
		taskRepository.save(task);
	}
	
}
