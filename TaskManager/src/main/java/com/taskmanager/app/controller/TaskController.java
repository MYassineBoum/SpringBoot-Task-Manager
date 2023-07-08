package com.taskmanager.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.taskmanager.app.model.Task;
import com.taskmanager.app.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/tasks")
	public String tasks(Model model) {
		List<Task> listTasks = taskService.getAllTasks();
		model.addAttribute("listTasks", listTasks);
		return "tasks";
	}
	
	@GetMapping("/addTask")
	public String addTask(Model model) {
		Task newTask = new Task();
		model.addAttribute("task", newTask);
		return "addTask";
	}
	
	@PostMapping("/tasks")
	public String addTask(@ModelAttribute("task") Task task) {
		taskService.saveTask(task);
		return "redirect:/tasks";
	}
	
	@GetMapping("/deleteTask/{ID}")
	public String deleteTask(@PathVariable Long ID) {
		taskService.deleteTask(ID);
		return "redirect:/tasks";
	}
	
}
