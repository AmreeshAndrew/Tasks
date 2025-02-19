package com.TaskManagement.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TaskManagement.Entity.Task;
import com.TaskManagement.Service.TaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/tasks")
public class TaskController {
	@Autowired
	TaskService ts;
@PostMapping(value="/inputs")
public String taskPost(@RequestBody List<Task>a) {
    
    return ts.taskPost(a);
}

}
