package com.taskmanagment.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.taskmanagment.dtos.TaskDto;
import com.taskmanagment.entities.Task;
import com.taskmanagment.repo.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements  TaskService{


    private final TaskRepo taskRepo;
    private final ObjectMapper objectMapper;

    public TaskServiceImpl(TaskRepo taskRepo, ObjectMapper objectMapper) {
        this.taskRepo = taskRepo;
        this.objectMapper=objectMapper;
    }

    @Override
    public void saveTask(TaskDto taskDto) {
        Task task=new Task();
        task.setDescription(taskDto.getDescription());
        task.setTitle(taskDto.getTitle());
        task.setStatus(taskDto.getStatus());
        System.out.println(task);
        taskRepo.save(task);
    }

    @Override
    public List<TaskDto> getAllTask() {

        List<Task> allEmployee = taskRepo.findAll();
        List<TaskDto> taskDtoList = allEmployee.stream().map(task -> objectMapper.convertValue(task, TaskDto.class))
                .collect(Collectors.toList());
        return taskDtoList;

    }
}
