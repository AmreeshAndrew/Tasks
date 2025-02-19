package com.TaskManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskManagement.Dao.TaskDao;
import com.TaskManagement.Entity.Task;

@Service
public class TaskService {
@Autowired
TaskDao td;

public String taskPost(List<Task>a) {
	return td.taskPost(a);
	
}
}
