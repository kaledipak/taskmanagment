package com.taskmanagment.controller;


import com.taskmanagment.dtos.TaskDto;
import com.taskmanagment.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public void saveTask(@RequestBody @Valid TaskDto taskDto){
        System.out.println(taskDto);
        taskService.saveTask(taskDto);
    }

    @GetMapping
    public List<TaskDto> getAllTask(){
        return taskService.getAllTask();
    }

}
