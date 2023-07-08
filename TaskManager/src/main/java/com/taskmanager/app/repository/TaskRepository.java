package com.taskmanager.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.taskmanager.app.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{

}
