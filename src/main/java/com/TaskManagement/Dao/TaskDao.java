package com.TaskManagement.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.TaskManagement.Entity.Task;
import com.TaskManagement.Repository.TaskRepository;

@Repository
public class TaskDao {
@Autowired
TaskRepository tr;

public String taskPost(List<Task>a) {
	 tr.saveAll(a);
	return"Saved the task";
	
}
}


